package model;

public class Telefone {
	private int codigoTelefone; //codigo unico gerado aleatoriamente
	private String numeroTelefone; //numero que deverá ser informado no formulario
	private String observacaoTelefone; //observacao de quem e esse telefone
	private Usuario usuario; //objeto do tipo usuario

	public int getCodigoTelefone() {
		return codigoTelefone;
	}

	public void setCodigoTelefone(int codigoTelefone) {
		this.codigoTelefone = codigoTelefone;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public String getObservacaoTelefone() {
		return observacaoTelefone;
	}

	public void setObservacaoTelefone(String observacaoTelefone) {
		this.observacaoTelefone = observacaoTelefone;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
