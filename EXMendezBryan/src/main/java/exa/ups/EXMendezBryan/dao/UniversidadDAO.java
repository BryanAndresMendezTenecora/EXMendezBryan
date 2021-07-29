package exa.ups.EXMendezBryan.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import exa.ups.EXMendezBryan.modelo.Universidad;

@Stateless
public class UniversidadDAO {

	@PersistenceContext
	private EntityManager em;

	public void insert(Universidad universidad) {
		em.persist(universidad);
	}

	public void update(Universidad universidad) {
		em.merge(universidad);
	}

	public Universidad read(int codigo) {
		Universidad p = em.find(Universidad.class, codigo);
		return p;
	}

	public Universidad readNombre(String nombre) {
		Universidad p = em.find(Universidad.class, nombre);
		return p;
	}

	public void delete(int codigo) {
		Universidad p = em.find(Universidad.class, codigo);
		em.remove(p);
	}

	public List<Universidad> getUniversidades(String nombre) {

		String jpql2 = "SELECT p FROM Universidad p" + " WHERE nombre LIKE ?1";

		nombre = "%" + nombre + "%";
		Query query = em.createQuery(jpql2, Universidad.class);
		query.setParameter(1, nombre);

		List<Universidad> universidades = query.getResultList();
		return universidades;

	}

	public List<Universidad> getTodasUniversidades() {

		String jpql2 = "SELECT p FROM Universidad p";// + " WHERE nombre LIKE ?1";

		//nombre = "%" + nombre + "%";
		Query query = em.createQuery(jpql2, Universidad.class);
		//query.setParameter(1, nombre);

		List<Universidad> universidades = query.getResultList();
		return universidades;

	}

	// public Li
}
