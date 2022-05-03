package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IAppointmentDao;
import pe.edu.upc.entidades.Appointment;

public class AppointmentlmplDao implements IAppointmentDao {
	@PersistenceContext(unitName = "Guife")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Appointment a) {
		try {
			em.persist(a);
		} catch (Exception e) {
			System.out.println("Error al insertar cita");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Appointment> list() {
		List<Appointment> listCitas = new ArrayList<Appointment>();

		try {
			Query jpql = em.createQuery("from Appointment a");
			listCitas = (List<Appointment>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar Citas");
		}
		return listCitas;
	}

	@Transactional
	@Override
	public void delete(int idAppointment) {
		try {
			Appointment ap = em.find(Appointment.class, idAppointment);

			em.remove(ap);
		} catch (Exception e) {
			System.out.println("Error al eliminar Cita");
		}
	}
}
