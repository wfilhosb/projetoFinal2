package projetoFinal.projetoFinal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
	public static EntityManagerFactory factory = null;

	static {
		init();
	}

	private static void init() {
		try {
			if (factory == null) {
				factory = Persistence.createEntityManagerFactory("projetoFinal"); // aqui se coloca o nome do projeto
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static EntityManager getEntityManager() {
		return factory.createEntityManager(); /* Prove a parte de persistencia */
	}

	public static Object getPrimaryKey(Object entity) { // Retorna a primay key
		return factory.getPersistenceUnitUtil().getIdentifier(entity);
	}

}
