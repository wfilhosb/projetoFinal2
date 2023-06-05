package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import projetoFinal.projetoFinal.HibernateUtil;

public class DaoGenerico<E> {
	private EntityManager entityManager = HibernateUtil.getEntityManager();
	
	public void salvar(E entidade) { //ele tanto SALVA um novo registro quanto ALTERA um registro já existente
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entidade);
		transaction.commit();
	}
	
	//esse listar trás tudo que existe cadastrado para essa classe
	public List<E> listar(Class<E> entidade){
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		List<E> lista = entityManager.createQuery("from "+entidade.getName()).getResultList();
		transaction.commit();
		return lista;
	}
	
	public void excluir(E entidade) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.remove(entidade);
		transaction.commit();
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
}
