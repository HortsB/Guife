package pe.edu.upc.daoimpl;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IAdministratorDao;
import pe.edu.upc.entidades.Administrator;

public class AdministratorImplDao implements IAdministratorDao {

	@PersistenceContext(unitName = "Guife")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Administrator ad) {
		try {
			em.persist(ad);
		} catch (Exception e) {
			System.out.println("Error al insertar administrador");
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Administrator> list() {
		List<Administrator> listaAdministradores = new ArrayList<Administrator>();
		try {
			Query jpql=em.createQuery("from Administrator ad");
			listaAdministradores=(List<Administrator>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar administradores");
		}
		return listaAdministradores;
	}

	@Transactional
	@Override
	public void delete(int idPerson) {
		try {
			Administrator ad=em.find(Administrator.class, idPerson);
			em.remove(ad);
		} catch (Exception e) {
			System.out.println("Error al eliminar administrador");
		}
		
	}

	@Transactional
	@Override
	public void update(Administrator ad) {
		// TODO Auto-generated method stub
		try {
			em.merge(ad);
		} catch (Exception e) {
			System.out.println("Error al modificar administrador ");
		}
		
	}
	

}
