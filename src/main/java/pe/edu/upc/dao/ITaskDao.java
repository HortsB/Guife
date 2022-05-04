package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.Task;

public interface ITaskDao {

	public void insert(Task ta);
	public List<Task> list();
	public void delete(int idTask);
	public void update(Task ta);
	
}
