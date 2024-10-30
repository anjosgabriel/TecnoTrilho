package br.com.fiap.beans;


public class Manutencao {

    private int idManutencao;
    private String tipoManutencao;
    private String descricao;
    private String dataManutencao;
    private Tecnico tecnicoResponsavel;
    private Equipamentos equipamentosUtilizados;

    public Manutencao() {
        super();
    }

    public Manutencao(int idManutencao, String tipoManutencao, String descricao, String dataManutencao) {
        super();
        this.idManutencao = idManutencao;
        this.tipoManutencao = tipoManutencao;
        this.descricao = descricao;
        this.dataManutencao = dataManutencao;
    }

    public int getIdManutencao() {
        return idManutencao;
    }

    public void setIdManutencao(int idManutencao) {
        this.idManutencao = idManutencao;
    }

    public String getTipoManutencao() {
        return tipoManutencao;
    }

    public void setTipoManutencao(String tipoManutencao) {
        this.tipoManutencao = tipoManutencao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataManutencao() {
        return dataManutencao;
    }

    public void setDataManutencao(String dataManutencao) {
        this.dataManutencao = dataManutencao;
    }

    public Tecnico getTecnicoResponsavel() {
        return tecnicoResponsavel;
    }

    public void setTecnicoResponsavel(Tecnico tecnicoResponsavel) {
        this.tecnicoResponsavel = tecnicoResponsavel;
    }

    public Equipamentos getEquipamentosUtilizados() {
        return equipamentosUtilizados;
    }

    public void setEquipamentosUtilizados(Equipamentos equipamentosUtilizados) {
        this.equipamentosUtilizados = equipamentosUtilizados;
    }

	@Override
	public String toString() {
		return "Manutencao [idManutencao=" + idManutencao + ", tipoManutencao=" + tipoManutencao + ", descricao="
				+ descricao + ", dataManutencao=" + dataManutencao + ", tecnicoResponsavel=" + tecnicoResponsavel
				+ ", equipamentosUtilizados=" + equipamentosUtilizados + "]";
	}

   
}
