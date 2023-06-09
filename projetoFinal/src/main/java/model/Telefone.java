package model;

import java.util.Objects;

import javax.persistence.*;

@Entity
public class Telefone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigoTelefone; //codigo unico gerado aleatoriamente
	
	@Column(nullable = false)
	private String numeroTelefone; //numero que deverá ser informado no formulario
	
	@Column(nullable = false)
	private String observacaoTelefone; //observacao de quem e esse telefone
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Usuario usuario; //objeto do tipo usuario, tenho que referencialo do outro lado

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

	@Override
	public int hashCode() {
		return Objects.hash(codigoTelefone, numeroTelefone, observacaoTelefone, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		return codigoTelefone == other.codigoTelefone && Objects.equals(numeroTelefone, other.numeroTelefone)
				&& Objects.equals(observacaoTelefone, other.observacaoTelefone)
				&& Objects.equals(usuario, other.usuario);
	}
	
}
