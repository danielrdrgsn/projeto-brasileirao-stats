package Dados;

public class Gols {
    private String partida_id;
    private String rodata;
    private String clube;
    private String atleta;
    private String minuto;
    private String tipo_de_gol;

    // GETTERS
    public String getPartida_id() {
        return partida_id;
    }

    public String getRodata() {
        return rodata;
    }

    public String getClube() {
        return clube;
    }

    public String getAtleta() {
        return atleta;
    }

    public String getMinuto() {
        return minuto;
    }

    public String getTipo_de_gol() {
        return tipo_de_gol;
    }

    // SETTERS
    public void setPartida_id(String partida_id) {
        this.partida_id = partida_id;
    }

    public void setRodata(String rodata) {
        this.rodata = rodata;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public void setAtleta(String atleta) {
        this.atleta = atleta;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    public void setTipo_de_gol(String tipo_de_gol) {
        this.tipo_de_gol = tipo_de_gol;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(partida_id)
                .append(rodata)
                .append(clube)
                .append(atleta)
                .append(minuto)
                .append(tipo_de_gol)
                .toString();
    }
}
