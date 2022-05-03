package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.Appointment;

public interface IAppointmentDao {
	public void insert(Appointment a);

	public List<Appointment> list();
	
	public void delete(int idAppointment);
}
