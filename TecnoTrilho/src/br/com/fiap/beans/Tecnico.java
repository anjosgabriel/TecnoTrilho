package br.com.fiap.beans;

public class Tecnico {

    private String nome;
    private String cpf;
    private int idTecnico;
    private String especialidade;
    private Endereco endereco;

    public Tecnico() {
        super();
    }

    public Tecnico(String nome, String cpf, int idTecnico, String especialidade) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.idTecnico = idTecnico;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

	@Override
	public String toString() {
		return "Tecnico [nome=" + nome + ", cpf=" + cpf + ", idTecnico=" + idTecnico + ", especialidade="
				+ especialidade + ", endereco=" + endereco + "]";
	}

}
