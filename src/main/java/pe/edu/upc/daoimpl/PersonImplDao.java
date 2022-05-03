package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPersonDao;
import pe.edu.upc.entidades.Person;

public class PersonImplDao implements IPersonDao {

	@PersistenceContext(unitName = "Guife")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Person p) {
		try {
			em.persist(p);
		} catch (Exception e) {
			System.out.println("Error al insertar persona");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> list() {
		List<Person> listaPersonas = new ArrayList<Person>();

		try {
			Query jpql = em.createQuery("from Person p");
			listaPersonas = (List<Person>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar personas");
		}
		return listaPersonas;
	}

	@Transactional
	@Override
	public void delete(int idPerson) {
		try {
			Person pe = em.find(Person.class, idPerson);

			em.remove(pe);
		} catch (Exception e) {
			System.out.println("Error al eliminar persona");
		}
	}

}
