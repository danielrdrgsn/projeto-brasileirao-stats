package Dados;

import java.util.Optional;

public class ShowData {

    public void ShowData() {
        System.out.println("ESTATÍSTICAS DO BRASILEIRÃO (2003-2022)");

        // Exibe dados dos times vencedores de 2008
        Optional<String> timesMaisVencedores2008 = Optional.ofNullable(GetData.getTimeQueMaisVenceu2008().toString());
        timesMaisVencedores2008.ifPresentOrElse(
                dados -> System.out.print("\n  1) Times que mais venceram em 2008  ⇨  " + dados),
                () -> System.out.print("Dados sobre os times que mais venceram jogos em 2008 não disponíveis.")
        );

        // ESTADO COM MENOS JOGOS RECEBIDOS
        Optional<String> estadoComMenosJogos = Optional.ofNullable(GetData.getEstadoComMenosJogos().toString());
        estadoComMenosJogos.ifPresentOrElse(
                dados -> System.out.print("\n  2) Estado com menos jogos recebidos (2003-2022)  ⇨  " + dados),
                () -> System.out.print("Dados sobre o estado com menos jogos não disponíveis.")
        );

        // ARTILHEIRO
        Optional<String> jogadorMaisGols = Optional.ofNullable(GetData.getJogadorQueMaisFezGols(false, "Gol Contra").toString());
        jogadorMaisGols.ifPresentOrElse(
                dados -> System.out.print("\n  3) Artilheiro (2003-2022)  ⇨  " + dados),
                () -> System.out.print("Dados sobre o jogador que mais marcou gols não disponíveis.")
        );

        // ARTILHEIRO PENÂLTIS
        Optional<String> jogadorMaisPenaltis = Optional.ofNullable(GetData.getJogadorQueMaisFezGols(true, "Penalty").toString());
        jogadorMaisPenaltis.ifPresentOrElse(
                dados -> System.out.print("\n  4) Artilheiro em pênaltis  ⇨  " + dados),
                () -> System.out.print("Dados sobre o jogador que mais marcou gols de pênalti não disponíveis.")
        );

        // ARTILHEIRO DE GOL CONTRA
        Optional<String> jogadorMaisGolsContra = Optional.ofNullable(GetData.getJogadorQueMaisFezGols(true, "Gol Contra").toString());
        jogadorMaisGolsContra.ifPresentOrElse(
                dados -> System.out.print("\n  5) Artilheiro em gols contra  ⇨  " + dados),
                () -> System.out.print("Dados sobre o jogador que mais marcou gols contra não disponíveis.")
        );

        // ARTILHEIRO DE CARTÕES AMARELOS
        Optional<String> jogadorMaisAmarelos = Optional.ofNullable(GetData.getJogadorQueMaisRecebeuCartoes("Amarelo").toString());
        jogadorMaisAmarelos.ifPresentOrElse(
                dados -> System.out.print("\n  6) Craque dos cartões amarelos  ⇨  " + dados),
                () -> System.out.print("Dados sobre o jogador que mais recebeu cartões amarelos não disponíveis.")
        );

        // ARTILHEIRO DE CARTÕES VERMELHOS
        Optional<String> jogadorMaisVermelhos = Optional.ofNullable(GetData.getJogadorQueMaisRecebeuCartoes("Vermelho").toString());
        jogadorMaisVermelhos.ifPresentOrElse(
                dados -> System.out.print("\n  7) Craque dos cartões vermelhos  ⇨  " + dados),
                () -> System.out.print("Dados sobre o jogador que mais recebeu cartões vermelhos não disponíveis.")
        );

        // PARTIDA COM MAIS GOLS
        Optional<String> partidaComMaisGols = Optional.ofNullable(GetData.getPartidaComMaisGols().toString());
        partidaComMaisGols.ifPresentOrElse(
                dados -> System.out.print("\n  8) O placar da partida com mais gols  ⇨  " + dados),
                () -> System.out.print("Dados sobre a partida com mais gols não disponíveis.")
        );
    }
}
