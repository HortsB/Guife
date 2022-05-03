package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IScheduleDao;
import pe.edu.upc.entidades.Schedule;
import pe.edu.upc.service.IScheduleService;

public class ScheduleServiceImpl implements IScheduleService{
	@Inject
	private IScheduleDao sDao;
	
	@Override
	public void insert(Schedule s) {
		// TODO Auto-generated method stub
		sDao.insert(s);
	}

	@Override
	public List<Schedule> list() {
		// TODO Auto-generated method stub
		return sDao.list();
	}

	@Override
	public void delete(int idSchedule) {
		// TODO Auto-generated method stub
		sDao.delete(idSchedule);
	}

	@Override
	public void update(Schedule s) {
		// TODO Auto-generated method stub
		sDao.update(s);
	}

	@Override
	public List<Schedule> findByNameSchedule(Schedule s) {
		// TODO Auto-generated method stub
		return sDao.findByNameSchedule(s);
	}

}
