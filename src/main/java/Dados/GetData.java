package Dados;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class GetData {
    private static String currentDir = System.getProperty("user.dir");

    private static <T> List<T> carregarDados(String arquivo, Class<T> tipo) {
        try {
            Path filePath = Paths.get(currentDir, "src", "main", "database", arquivo);
            return new CsvToBeanBuilder<T>(new FileReader(filePath.toString()))
                    .withType(tipo)
                    .build()
                    .parse();
        } catch (IOException e) {
            System.err.println("Erro lendo ou avaliando arquivo CSV: " + e.getMessage());
            return List.of();
        }
    }

    public static List<Cartoes> cartoes() {
        return carregarDados("campeonato-brasileiro-cartoes.csv", Cartoes.class);
    }

    public static List<Gols> gols() {
        return carregarDados("campeonato-brasileiro-gols.csv", Gols.class);
    }

    public static List<Estatisticas> estatisticas() {
        return carregarDados("campeonato-brasileiro-estatisticas-full.csv", Estatisticas.class);
    }

    public static List<Campeonato> campeonato() {
        return carregarDados("campeonato-brasileiro-full.csv", Campeonato.class);
    }

    // Método para obter os times que mais venceram em 2008
    public static List<Map.Entry<String, Long>> getTimeQueMaisVenceu2008() {
        List<Campeonato> campeonatos = campeonato();
        if (campeonatos.isEmpty()) return List.of();

        Map<String, Long> vencedores2008 = campeonatos.stream()
                .filter(data -> data.getData() != null && data.getData().contains("2008"))
                .filter(campo -> !Objects.equals(campo.getVencedor(), "-"))
                .collect(Collectors.groupingBy(Campeonato::getVencedor, Collectors.counting()));

        Long maxVitorias = vencedores2008.values().stream()
                .max(Long::compare)
                .orElse(0L);

        return vencedores2008.entrySet().stream()
                .filter(entrada -> entrada.getValue().equals(maxVitorias))
                .collect(Collectors.toList());
    }

    // ESTADO COM MENOS JOGOS
    public static Map.Entry<String, Long> getEstadoComMenosJogos() {
        List<Campeonato> campeonatos = campeonato();
        if (campeonatos.isEmpty()) return null;

        return campeonatos.stream()
                .filter(jogo -> {
                    String data = jogo.getData();
                    if (data != null) {
                        String[] dataAno = data.split("/");
                        int ano = Integer.parseInt(dataAno[2]);
                        return ano >= 2003 && ano <= 2022;
                    }
                    return false;
                })
                .collect(Collectors.groupingBy(Campeonato::getMandante_Estado, Collectors.counting()))
                .entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .orElse(null);
    }

    // ARTILHEIRO
    public static Map.Entry<String, Long> getJogadorQueMaisFezGols(boolean isPenalty, String tipoGol) {
        List<Gols> listaGols = gols();
        if (listaGols.isEmpty()) return null;

        return listaGols.stream()
                .filter(gol -> Objects.equals(gol.getTipo_de_gol(), tipoGol) == isPenalty)
                .collect(Collectors.groupingBy(Gols::getAtleta, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);
    }

    // CARTÕES E COR
    public static Map.Entry<String, Long> getJogadorQueMaisRecebeuCartoes(String cor) {
        List<Cartoes> listaCartoes = cartoes();
        if (listaCartoes.isEmpty()) return null;

        return listaCartoes.stream()
                .filter(cartao -> Objects.equals(cartao.getCartao(), cor))
                .collect(Collectors.groupingBy(Cartoes::getAtleta, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);
    }

    // PARTIDA COM MAIS GOLS
    public static List<Campeonato> getPartidaComMaisGols() {
        List<Gols> listaGols = gols();
        if (listaGols.isEmpty()) return List.of();

        var idPartidaComMaisGols = listaGols.stream()
                .collect(Collectors.groupingBy(Gols::getPartida_id, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        if (idPartidaComMaisGols == null) return List.of();

        return campeonato().stream()
                .filter(entrada -> Objects.equals(entrada.getID(), idPartidaComMaisGols))
                .collect(Collectors.toList());
    }
}