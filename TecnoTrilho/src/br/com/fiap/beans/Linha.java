package br.com.fiap.beans;

public class Linha {
    private int idLinha;
    private String corLinha;
    private Estacao estacoes;

    public Linha() {
        super();
    }

    public Linha(int idLinha, String corLinha) {
        super();
        this.idLinha = idLinha;
        this.corLinha = corLinha;
    }

    public int getIdLinha() {
        return idLinha;
    }

    public void setIdLinha(int idLinha) {
        this.idLinha = idLinha;
    }

    public String getCorLinha() {
        return corLinha;
    }

    public void setCorLinha(String corLinha) {
        this.corLinha = corLinha;
    }

    public Estacao getEstacoes() {
        return estacoes;
    }

    public void setEstacoes(Estacao estacoes) {
        this.estacoes = estacoes;
    }

	@Override
	public String toString() {
		return "Linha [idLinha=" + idLinha + ", corLinha=" + corLinha + ", estacoes=" + estacoes + "]";
	}

 
}
