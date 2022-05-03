package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entidades.Schedule;

public interface IScheduleService {
	public void insert(Schedule s);

	public List<Schedule> list();
	
	public void delete(int idSchedule);
	
	public List<Schedule> findByNameSchedule(Schedule s);
	
	public void update(Schedule s);
}
