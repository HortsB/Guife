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

	@Inject
	private ITaskService tService;
	private Task ta;
	List<Task> listaTareas;
	
	@PostConstruct
	public void init() {
		this.listaTareas=new ArrayList<Task>();
		this.ta=new Task();
		this.list();
	}
	
	public String newTask() {
		this.setTa(new Task());
		return "task.xhtml";
	}
	
	public void insert() {
		try {
			tService.insert(ta);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller tarea");
		}
	}
	
	public void list() {
		try {
			listaTareas=tService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller tarea");
		}
	}
	
	public void delete(Task tas) {
		try {
			tService.delete(tas.getIdTask());
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller tarea");
		}
	}
	
	public String updatePree(Task ta) {
		this.setTa(ta);
		return "updateTask.xhtml";
	}
	
	public void update() {
		try {
			tService.update(this.ta);
		} catch (Exception e) {
			System.out.println("Error al modificar en el controller tarea");
		}
	}
	

	public ITaskService gettService() {
		return tService;
	}

	public void settService(ITaskService tService) {
		this.tService = tService;
	}

	public Task getTa() {
		return ta;
	}

	public void setTa(Task ta) {
		this.ta = ta;
	}

	public List<Task> getListaTareas() {
		return listaTareas;
	}

	public void setListaTareas(List<Task> listaTareas) {
		this.listaTareas = listaTareas;
	}
	
	
	
}
