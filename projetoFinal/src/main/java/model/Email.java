package model;

import javax.persistence.*;

@Entity
public class Email {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigoEmail; //codigo unico gerado aleatoriamente
	
	@Column(nullable = false)//significa que não pode ser anulavel, ou seja, campo obrigatorio
	private String enderecoEmail; //endereco de email fornecido no formulario
	
	@Column(nullable = false)
	private String decricaoEmail; //descricao do email informado no formulario
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER) //muitos (MANY) emails podem/devem ter um (ONE) usuário
	private Usuario usuario; // objeto do tipo usuario

	public int getCodigoEmail() {
		return codigoEmail;
	}

	public void setCodigoEmail(int codigo) {
		this.codigoEmail = codigo;
	}

	public String getEnderecoEmail() {
		return enderecoEmail;
	}

	public void setEnderecoEmail(String endereco_email) {
		this.enderecoEmail = endereco_email;
	}

	public String getDecricaoEmail() {
		return decricaoEmail;
	}

	public void setDecricaoEmail(String descricao_email) {
		this.decricaoEmail = descricao_email;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
