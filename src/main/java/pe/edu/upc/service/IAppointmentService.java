package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entidades.Appointment;

public interface IAppointmentService {
	public void insert(Appointment a);

	public List<Appointment> list();
	
	public void delete(int idAppointment);
}
