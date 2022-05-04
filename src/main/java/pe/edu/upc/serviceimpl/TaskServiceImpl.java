package pe.edu.upc.serviceimpl;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITaskDao;
import pe.edu.upc.entidades.Task;
import pe.edu.upc.service.ITaskService;

@Named
public class TaskServiceImpl implements ITaskService {
	
	@Inject
	private ITaskDao tDao;

	@Override
	public void insert(Task ta) {
		tDao.insert(ta);
		
	}

	@Override
	public List<Task> list() {
		
		return tDao.list();
	}

	@Override
	public void delete(int idTask) {
		tDao.delete(idTask);
		
	}

	@Override
	public void update(Task ta) {
		tDao.update(ta);
		
	}

	
}
