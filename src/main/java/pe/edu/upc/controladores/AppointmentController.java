package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Appointment;
import pe.edu.upc.service.IAppointmentService;


@Named
@RequestScoped
public class AppointmentController {
	@Inject
	private IAppointmentService aService;
	
	private Appointment a;
	List<Appointment> listAppointment;
	
	// constructor
	@PostConstruct
	public void init() {
		this.listAppointment = new ArrayList<Appointment>();
		this.a = new Appointment();
		this.list();
	}
	
	
	// métodos
	public String newAppointment() {

		this.setA(new Appointment());
		return "Citas.xhtml";
	}

	public void insert() {
		try {
			aService.insert(a);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller cita");
		}
	}

	public void list() {
		try {
			listAppointment = aService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller cita");
		}
	}
	
	public void delete(Appointment ap) {
		try {
			aService.delete(ap.getIdAppointment());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en controller cita");
		}
	}
	
	// getters and setters
	public Appointment getA() {
		return a;
	}

	public void setA(Appointment a) {
		this.a = a;
	}

	public List<Appointment> getListAppointment() {
		return listAppointment;
	}

	public void setListAppointment(List<Appointment> listAppointment) {
		this.listAppointment = listAppointment;
	}
	
	
}
