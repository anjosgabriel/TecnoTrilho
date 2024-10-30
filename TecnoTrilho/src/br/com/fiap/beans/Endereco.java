package br.com.fiap.beans;

public class Endereco {
    private String logradouro;
    private String cep;
    private String bairro;
    private int numero;
    private String cidade;

    public Endereco() {
        super();
    }

    public Endereco(String logradouro, String cep, String bairro, int numero, String cidade) {
        super();
        this.logradouro = logradouro;
        this.cep = cep;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setRua(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", cep=" + cep + ", bairro=" + bairro + ", numero=" + numero
				+ ", cidade=" + cidade + "]";
	}

 }
