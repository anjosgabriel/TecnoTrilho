package br.com.fiap.beans;


public class Instalacao {
    private int codigoInstalacao;
    private String tipoInstalacao;
    private String statusInstalacao;
    private String ultimaManutencao;
    private Manutencao manutencao;
    private Estacao estacao;

    public Instalacao() {
        super();
    }

    public Instalacao(int codigoInstalacao, String tipoInstalacao, String statusInstalacao, String ultimaManutencao) {
        super();
        this.codigoInstalacao = codigoInstalacao;
        this.tipoInstalacao = tipoInstalacao;
        this.statusInstalacao = statusInstalacao;
        this.ultimaManutencao = ultimaManutencao;
    }

    public int getCodigoInstalacao() {
        return codigoInstalacao;
    }

    public void setCodigoInstalacao(int codigoInstalacao) {
        this.codigoInstalacao = codigoInstalacao;
    }

    public String getTipoInstalacao() {
        return tipoInstalacao;
    }

    public void setTipoInstalacao(String tipoInstalacao) {
        this.tipoInstalacao = tipoInstalacao;
    }

    public String getStatusInstalacao() {
        return statusInstalacao;
    }

    public void setStatusInstalacao(String statusInstalacao) {
        this.statusInstalacao = statusInstalacao;
    }

    public String getUltimaManutencao() {
        return ultimaManutencao;
    }

    public void setUltimaManutencao(String ultimaManutencao) {
        this.ultimaManutencao = ultimaManutencao;
    }

    public Manutencao getManutencao() {
        return manutencao;
    }

    public void setManutencao(Manutencao manutencao) {
        this.manutencao = manutencao;
    }

    public Estacao getEstacao() {
        return estacao;
    }

    public void setEstacao(Estacao estacao) {
        this.estacao = estacao;
    }

	@Override
	public String toString() {
		return "Instalacao [codigoInstalacao=" + codigoInstalacao + ", tipoInstalacao=" + tipoInstalacao
				+ ", statusInstalacao=" + statusInstalacao + ", ultimaManutencao=" + ultimaManutencao + ", manutencao="
				+ manutencao + ", estacao=" + estacao + "]";
	}

  
}
