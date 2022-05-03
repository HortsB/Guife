package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IScheduleDao;
import pe.edu.upc.entidades.Schedule;

public class ScheduleImplDao implements IScheduleDao{
	@PersistenceContext(unitName = "Guife")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Schedule s) {
		// TODO Auto-generated method stub
		try {
			em.persist(s);
		} catch (Exception e) {
			System.out.println("Error al insertar un registro de calendario");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Schedule> list() {
		// TODO Auto-generated method stub
		List<Schedule> listaCalendarios = new ArrayList<Schedule>();
		try {
			Query jpql = em.createQuery("from Schedule s");
			listaCalendarios = (List<Schedule>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en calendario");
		}
		return listaCalendarios;
	}

	@Transactional
	@Override
	public void delete(int idSchedule) {
		// TODO Auto-generated method stub
		try {
			Schedule s = em.find(Schedule.class, idSchedule);

			em.remove(s);
		} catch (Exception e) {
			System.out.println("Error al eliminar calendario");
		}
	}

	@Transactional
	@Override
	public void update(Schedule s) {
		// TODO Auto-generated method stub
		try {
			em.merge(s);
		} catch (Exception e) {
			System.out.println("Error al modificar en el dao calendario");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Schedule> findByNameSchedule(Schedule s) {
		List<Schedule> lista = new ArrayList<Schedule>();
		try {
			Query q = em.createQuery("from Customer cu where cu.descriptionCustomer like ?1");
			q.setParameter(1, "%" + s.getCustomer() + "%");
			lista = (List<Schedule>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al buscar vacunas");

		}
		return lista;
	}

}
