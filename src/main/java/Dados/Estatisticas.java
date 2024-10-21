package Dados;

public class Estatisticas {
    private String partida_id;
    private String rodata;
    private String clube;
    private String chutes;
    private String chutes_no_alvo;
    private String posse_de_bola;
    private String passes;
    private String precisao_passes;
    private String faltas;
    private String cartao_amarelo;
    private String cartao_vermelho;
    private String impedimentos;
    private String escanteios;

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

    public String getChutes() {
        return chutes;
    }

    public String getChutes_no_alvo() {
        return chutes_no_alvo;
    }

    public String getPosse_de_bola() {
        return posse_de_bola;
    }

    public String getPasses() {
        return passes;
    }

    public String getPrecisao_passes() {
        return precisao_passes;
    }

    public String getFaltas() {
        return faltas;
    }

    public String getCartao_amarelo() {
        return cartao_amarelo;
    }

    public String getCartao_vermelho() {
        return cartao_vermelho;
    }

    public String getImpedimentos() {
        return impedimentos;
    }

    public String getEscanteios() {
        return escanteios;
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

    public void setChutes(String chutes) {
        this.chutes = chutes;
    }

    public void setChutes_no_alvo(String chutes_no_alvo) {
        this.chutes_no_alvo = chutes_no_alvo;
    }

    public void setPosse_de_bola(String posse_de_bola) {
        this.posse_de_bola = posse_de_bola;
    }

    public void setPasses(String passes) {
        this.passes = passes;
    }

    public void setPrecisao_passes(String precisao_passes) {
        this.precisao_passes = precisao_passes;
    }

    public void setFaltas(String faltas) {
        this.faltas = faltas;
    }

    public void setCartao_amarelo(String cartao_amarelo) {
        this.cartao_amarelo = cartao_amarelo;
    }

    public void setCartao_vermelho(String cartao_vermelho) {
        this.cartao_vermelho = cartao_vermelho;
    }

    public void setImpedimentos(String impedimentos) {
        this.impedimentos = impedimentos;
    }

    public void setEscanteios(String escanteios) {
        this.escanteios = escanteios;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("partida_id='").append(partida_id).append('\'')
                .append(", rodata='").append(rodata).append('\'')
                .append(", clube='").append(clube).append('\'')
                .append(", chutes='").append(chutes).append('\'')
                .append(", chutes_no_alvo='").append(chutes_no_alvo).append('\'')
                .append(", posse_de_bola='").append(posse_de_bola).append('\'')
                .append(", passes='").append(passes).append('\'')
                .append(", precisao_passes='").append(precisao_passes).append('\'')
                .append(", faltas='").append(faltas).append('\'')
                .append(", cartao_amarelo='").append(cartao_amarelo).append('\'')
                .append(", cartao_vermelho ='").append(cartao_vermelho).append('\'')
                .append(", impedimentos='").append(impedimentos).append('\'')
                .append(", escanteios='").append(escanteios).append('\'')
                .toString();
    }
}
