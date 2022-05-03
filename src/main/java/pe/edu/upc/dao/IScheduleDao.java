package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.Schedule;

public interface IScheduleDao {
	
	public void insert(Schedule s);

	public List<Schedule> list();
	
	public void delete(int idSchedule);
	
	public void update(Schedule s);
	
	public List<Schedule> findByNameSchedule(Schedule s);
}
