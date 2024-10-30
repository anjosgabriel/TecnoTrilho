package br.com.fiap.beans;

public class Estacao {
    private String nome;
    private int idEstacao;
    private Endereco endereco;
    private Linha linhas;

    public Estacao() {
        super();
    }

    public Estacao(String nome, int idEstacao) {
        super();
        this.nome = nome;
        this.idEstacao = idEstacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdEstacao() {
        return idEstacao;
    }

    public void setIdEstacao(int idEstacao) {
        this.idEstacao = idEstacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Linha getLinhas() {
        return linhas;
    }

    public void setLinhas(Linha linhas) {
        this.linhas = linhas;
    }

	@Override
	public String toString() {
		return "Estacao [nome=" + nome + ", idEstacao=" + idEstacao + ", endereco=" + endereco + ", linhas=" + linhas
				+ "]";
	}


}
