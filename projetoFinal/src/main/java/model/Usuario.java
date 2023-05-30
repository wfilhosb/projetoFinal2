package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cod;

	@Column(nullable = false)
	private String nomeCompleto;

	@Column(nullable = false)
	private String endCompleto;

	@OneToMany(mappedBy = "usuario")
	private List<Telefone> telefones;

	@OneToMany(mappedBy = "usuario")
	private List<Email> emails;

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEndCompleto() {
		return endCompleto;
	}

	public void setEndCompleto(String endCompleto) {
		this.endCompleto = endCompleto;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod, emails, endCompleto, nomeCompleto, telefones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return cod == other.cod && Objects.equals(emails, other.emails)
				&& Objects.equals(endCompleto, other.endCompleto) && Objects.equals(nomeCompleto, other.nomeCompleto)
				&& Objects.equals(telefones, other.telefones);
	}
	
}
