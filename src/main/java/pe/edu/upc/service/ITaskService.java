package pe.edu.upc.service;
import java.util.List;

import pe.edu.upc.entidades.Task;
public interface ITaskService {

	public void insert(Task ta);
	public List<Task> list();
	public void delete(int idTask);
	public void update(Task ta);
}
