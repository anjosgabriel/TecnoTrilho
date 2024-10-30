package br.com.fiap.beans;

public class RelatorioManutencao {

    private int idRelatorio;
    private String dataRelatorio;
    private String descricao;
    private String statusRelatorio;
    private Tecnico tecnicoResponsavel;
    private Manutencao manutencao;

    public RelatorioManutencao() {
        super();
    }

    public RelatorioManutencao(int idRelatorio, String dataRelatorio, String descricao, String statusRelatorio) {
        super();
        this.idRelatorio = idRelatorio;
        this.dataRelatorio = dataRelatorio;
        this.descricao = descricao;
        this.statusRelatorio = statusRelatorio;
    }

    public int getIdRelatorio() {
        return idRelatorio;
    }

    public void setIdRelatorio(int idRelatorio) {
        this.idRelatorio = idRelatorio;
    }

    public String getDataRelatorio() {
        return dataRelatorio;
    }

    public void setDataRelatorio(String dataRelatorio) {
        this.dataRelatorio = dataRelatorio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatusRelatorio() {
        return statusRelatorio;
    }

    public void setStatusRelatorio(String statusRelatorio) {
        this.statusRelatorio = statusRelatorio;
    }

    public Tecnico getTecnicoResponsavel() {
        return tecnicoResponsavel;
    }

    public void setTecnicoResponsavel(Tecnico tecnicoResponsavel) {
        this.tecnicoResponsavel = tecnicoResponsavel;
    }

    public Manutencao getManutencao() {
        return manutencao;
    }

    public void setManutencao(Manutencao manutencao) {
        this.manutencao = manutencao;
    }

	@Override
	public String toString() {
		return "RelatorioManutencao [idRelatorio=" + idRelatorio + ", dataRelatorio=" + dataRelatorio + ", descricao="
				+ descricao + ", statusRelatorio=" + statusRelatorio + ", tecnicoResponsavel=" + tecnicoResponsavel
				+ ", manutencao=" + manutencao + "]";
	}

}
