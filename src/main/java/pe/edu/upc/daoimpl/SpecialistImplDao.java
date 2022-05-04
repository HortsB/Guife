package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ISpecialisDao;
import pe.edu.upc.entidades.Specialist;

public class SpecialistImplDao implements ISpecialisDao{

	@PersistenceContext(unitName = "Guife")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Specialist sp) {
		
		try {
			em.persist(sp);
		} catch (Exception e) {
			System.out.println("Error al insertar Especialista");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Specialist> list() {
		List<Specialist> listaEspecialistas = new ArrayList<Specialist>();
		try {
			Query jpql=em.createQuery("from Specialist sp");
			listaEspecialistas=(List<Specialist>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar especialistas");
		}
		return listaEspecialistas;
	}
	@Transactional
	@Override
	public void delete(int idSpecialist) {
		try {
			Specialist sp=em.find(Specialist.class, idSpecialist);
			em.remove(sp);
		} catch (Exception e) {
			System.out.println("Error al eliminar especialista");
		}
	}
	@Transactional
	@Override
	public void update(Specialist sp) {
		try {
			em.merge(sp);
		} catch (Exception e) {
			System.out.println("Error al modificar especialista ");
		}
		
	}

}
