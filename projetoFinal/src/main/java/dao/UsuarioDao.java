package dao;

import java.util.List;

import javax.persistence.Query;

import model.Usuario;

public class UsuarioDao<E> extends DaoGenerico<Usuario> {
	
	public List<Usuario> pesquisarPeloNome(String campoPesquisa) {
		Query query = super.getEntityManager().createQuery("from Usuario where nomeCompleto like '%"+campoPesquisa+"%' order by nomeCompleto asc");
		return query.getResultList();
	}
	
}
