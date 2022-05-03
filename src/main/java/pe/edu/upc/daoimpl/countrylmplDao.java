package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICountryDao;
import pe.edu.upc.entidades.Country;

public class countrylmplDao implements ICountryDao{
	@PersistenceContext(unitName = "Guife")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Country c) {
		try {
			em.persist(c);
		} catch (Exception e) {
			System.out.println("Error al insertar País");
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Country> list() {
		List<Country> listCountry = new ArrayList<Country>();

		try {
			Query jpql = em.createQuery("from Country c");
			listCountry = (List<Country>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar País");
		}
		return listCountry;
	}
	
	
	@Override
	@Transactional
	public void delete(int idCountry) {
		try {
			Country c = em.find(Country.class, idCountry);
			em.remove(c);
		} catch (Exception e) {
			System.out.println("Error al eliminar país");
		}
	}
	
	@Transactional
	@Override
	public void update(Country c) {
		try {
			em.merge(c);
		} catch (Exception e) {
			System.out.println("Error al modificar en el dao de vacunacion");
		}
		
	}
}
