package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IAppointmentDao;
import pe.edu.upc.entidades.Appointment;
import pe.edu.upc.service.IAppointmentService;

@Named
public class AppointmentServicelmpl implements IAppointmentService{

	@Inject
	private IAppointmentDao aDao;

	@Override
	public void insert(Appointment a) {
		aDao.insert(a);
	}

	@Override
	public List<Appointment> list() {
		// TODO Auto-generated method stub
		return aDao.list();
	}
	
	@Override
	public void delete(int idAppointment) {
		// TODO Auto-generated method stub
		aDao.delete(idAppointment);
	}
}
