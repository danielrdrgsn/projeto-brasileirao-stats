package Dados;

public class Cartoes {
    private String partida_id;
    private String rodata;
    private String clube;
    private String cartao;
    private String atleta;
    private String num_camisa;
    private String posicao;
    private String minuto;

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

    public String getCartao() {
        return cartao;
    }

    public String getAtleta() {
        return atleta;
    }

    public String getNum_camisa() {
        return num_camisa;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getMinuto() {
        return minuto;
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

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public void setAtleta(String atleta) {
        this.atleta = atleta;
    }

    public void setNum_camisa(String num_camisa) {
        this.num_camisa = num_camisa;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        return new StringBuilder("Cartoes{")
                .append("partida_id='").append(partida_id).append('\'')
                .append(", rodata='").append(rodata).append('\'')
                .append(", clube='").append(clube).append('\'')
                .append(", cartao='").append(cartao).append('\'')
                .append(", atleta='").append(atleta).append('\'')
                .append(", num_camisa='").append(num_camisa).append('\'')
                .append(", posicao='").append(posicao).append('\'')
                .append(", minuto='").append(minuto).append('\'')
                .append('}')
                .toString();
    }
}
