package br.com.fiap.beans;


public class Via {
    private int idVia;
    private double extensao;
    private String ultimaManutencao;
    private Manutencao manutencoes;
    private Estacao estacao;

    public Via() {
        super();
    }

    public Via(int idVia, double extensao, String ultimaManutencao) {
        super();
        this.idVia = idVia;
        this.extensao = extensao;
        this.ultimaManutencao = ultimaManutencao;
    }

    public int getIdVia() {
        return idVia;
    }

    public void setIdVia(int idVia) {
        this.idVia = idVia;
    }

    public double getExtensao() {
        return extensao;
    }

    public void setExtensao(double extensao) {
        this.extensao = extensao;
    }

    public String getUltimaManutencao() {
        return ultimaManutencao;
    }

    public void setUltimaManutencao(String ultimaManutencao) {
        this.ultimaManutencao = ultimaManutencao;
    }

    public Manutencao getManutencoes() {
        return manutencoes;
    }

    public void setManutencoes(Manutencao manutencoes) {
        this.manutencoes = manutencoes;
    }

    public Estacao getEstacao() {
        return estacao;
    }

    public void setEstacao(Estacao estacao) {
        this.estacao = estacao;
    }

	@Override
	public String toString() {
		return "Via [idVia=" + idVia + ", extensao=" + extensao + ", ultimaManutencao=" + ultimaManutencao
				+ ", manutencoes=" + manutencoes + ", estacao=" + estacao + "]";
	}

  
}
