package br.com.fiap.beans;


public class AgendaManutencao {

    private String dataPrevista;
    private String descricao;
    private int idAgenda;
    private Manutencao manutencao;
    private Tecnico tecnicoResponsavel;

    public AgendaManutencao() {
        super();
    }

    public AgendaManutencao(String dataPrevista, String descricao, int idAgenda) {
        super();
        this.dataPrevista = dataPrevista;
        this.descricao = descricao;
        this.idAgenda = idAgenda;
    }

    public String getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(String dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }

    public Manutencao getManutencao() {
        return manutencao;
    }

    public void setManutencao(Manutencao manutencao) {
        this.manutencao = manutencao;
    }

    public Tecnico getTecnicoResponsavel() {
        return tecnicoResponsavel;
    }

    public void setTecnicoResponsavel(Tecnico tecnicoResponsavel) {
        this.tecnicoResponsavel = tecnicoResponsavel;
    }

	@Override
	public String toString() {
		return "AgendaManutencao [dataPrevista=" + dataPrevista + ", descricao=" + descricao + ", idAgenda=" + idAgenda
				+ ", manutencao=" + manutencao + ", tecnicoResponsavel=" + tecnicoResponsavel + "]";
	}

    
}
