package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITaskDao;
import pe.edu.upc.entidades.Task;

public class TaskImplDao implements ITaskDao {
	@PersistenceContext(unitName = "Guife")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Task t) {
		try {
			em.persist(t);
		} catch (Exception e) {
			System.out.println("Error al insertar una tarea");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Task> list() {
		List<Task> listaTareas = new ArrayList<Task>();
		try {
			Query jpql = em.createQuery("from Task t");
			listaTareas = (List<Task>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar las tareas");
		}
		return listaTareas;
	}

	@Transactional
	@Override
	public void delete(int idTask) {
		try {
			Task t = em.find(Task.class, idTask);

			em.remove(t);
		} catch (Exception e) {
			System.out.println("Error al eliminar una tarea");
		}

	}
	@Transactional
	@Override
	public void update(Task t) {
		try {
			em.merge(t);
		}catch(Exception e) {
			System.out.println("Error al modificar una tarea ");

		}
		
	}
}

