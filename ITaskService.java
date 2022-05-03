package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entidades.Task;

public interface ITaskService {
public void insert(Task t);
public List<Task>list();
public void delete(int idTask);
<<<<<<< HEAD
=======
public void update(Task t);
>>>>>>> 5bb18c4 (Se agrega la entidad Task)
}
