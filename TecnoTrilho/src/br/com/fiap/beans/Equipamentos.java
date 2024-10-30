package br.com.fiap.beans;

public class Equipamentos {
    private int idEquipamento;
    private String tipoEquipamento;
    private String statusEquipamento;

    public Equipamentos() {
        super();
    }

    public Equipamentos(int idEquipamento, String tipoEquipamento, String statusEquipamento) {
        super();
        this.idEquipamento = idEquipamento;
        this.tipoEquipamento = tipoEquipamento;
        this.statusEquipamento = statusEquipamento;
    }

    public int getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(int idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public String getTipoEquipamento() {
        return tipoEquipamento;
    }

    public void setTipoEquipamento(String tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }

    public String getStatusEquipamento() {
        return statusEquipamento;
    }

    public void setStatusEquipamento(String statusEquipamento) {
        this.statusEquipamento = statusEquipamento;
    }

	@Override
	public String toString() {
		return "Equipamentos [idEquipamento=" + idEquipamento + ", tipoEquipamento=" + tipoEquipamento
				+ ", statusEquipamento=" + statusEquipamento + "]";
	}

   
}
