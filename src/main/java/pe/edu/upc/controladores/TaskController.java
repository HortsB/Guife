package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Task;
import pe.edu.upc.service.ITaskService;

@Named
@RequestScoped
public class TaskController {
	
	@SuppressWarnings("cdi-ambiguous-dependency")
	@Inject
	private ITaskService tService;

	private Task t;
	List<Task> listaTareas;

	@PostConstruct
	public void init() {
		this.listaTareas = new ArrayList<Task>();
		this.t = new Task();
		this.list();
	}

	public String newTask() {
		this.setT(new Task());
		return "task.xhtml";
	}

	public void insert() {
		try {
			tService.insert(t);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller task");
		}
	}

	public void list() {
		try {
			listaTareas = tService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller tareas");
		}
	}

	public void delete(Task t) {
		try {
			tService.delete(t.getIdTask());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en controller task");
		}
	}

	public Task getT() {
		return t;
	}

	public void setT(Task t) {
		this.t = t;
	}

	public List<Task> getListaTareas() {
		return listaTareas;
	}

	public void setListaTareas(List<Task> listaTareas) {
		this.listaTareas = listaTareas;
	}
}
