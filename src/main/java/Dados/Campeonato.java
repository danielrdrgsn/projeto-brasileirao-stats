package Dados;

public class Campeonato {
    private String ID;
    private String rodata;
    private String data;
    private String hora;
    private String mandante;
    private String visitante;
    private String formacao_mandante;
    private String formacao_visitante;
    private String tecnico_mandante;
    private String tecnico_visitante;
    private String vencedor;
    private String arena;
    private String mandante_Placar;
    private String visitante_Placar;
    private String mandante_Estado;
    private String visitante_Estado;

    // GETTERS
    public String getID() {
        return ID;
    }

    public String getRodata() {
        return rodata;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public String getMandante() {
        return mandante;
    }

    public String getVisitante() {
        return visitante;
    }

    public String getFormacao_mandante() {
        return formacao_mandante;
    }

    public String getFormacao_visitante() {
        return formacao_visitante;
    }

    public String getTecnico_mandante() {
        return tecnico_mandante;
    }

    public String getTecnico_visitante() {
        return tecnico_visitante;
    }

    public String getVencedor() {
        return vencedor;
    }

    public String getArena() {
        return arena;
    }

    public String getMandante_Placar() {
        return mandante_Placar;
    }

    public String getVisitante_Placar() {
        return visitante_Placar;
    }

    public String getMandante_Estado() {
        return mandante_Estado;
    }

    public String getVisitante_Estado() {
        return visitante_Estado;
    }

    // SETTERS
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setRodata(String rodata) {
        this.rodata = rodata;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setMandante(String mandante) {
        this.mandante = mandante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public void setFormacao_mandante(String formacao_mandante) {
        this.formacao_mandante = formacao_mandante;
    }

    public void setFormacao_visitante(String formacao_visitante) {
        this.formacao_visitante = formacao_visitante;
    }

    public void setTecnico_mandante(String tecnico_mandante) {
        this.tecnico_mandante = tecnico_mandante;
    }

    public void setTecnico_visitante(String tecnico_visitante) {
        this.tecnico_visitante = tecnico_visitante;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }

    public void setArena(String arena) {
        this.arena = arena;
    }

    public void setMandante_Placar(String mandante_Placar) {
        this.mandante_Placar = mandante_Placar;
    }

    public void setVisitante_Placar(String visitante_Placar) {
        this.visitante_Placar = visitante_Placar;
    }

    public void setMandante_Estado(String mandante_Estado) {
        this.mandante_Estado = mandante_Estado;
    }

    public void setVisitante_Estado(String visitante_Estado) {
        this.visitante_Estado = visitante_Estado;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(mandante).append(" ").append(mandante_Placar)
                .append(" x ").append(visitante_Placar).append(" ").append(visitante)
                .toString();
    }
}
