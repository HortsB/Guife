package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Customer;
import pe.edu.upc.entidades.Schedule;
import pe.edu.upc.service.ICustomerService;
import pe.edu.upc.service.IScheduleService;

@Named
@RequestScoped
public class ScheduleController {
	@Inject
	private ICustomerService cuService;
	@Inject
	private IScheduleService sService;

	private Schedule s;
	List<Customer> listaClientes;
	List<Schedule> listaCalendario;

	@PostConstruct
	public void init() {
		this.s = new Schedule();
		this.listaClientes = new ArrayList<Customer>();
		this.listaCalendario = new ArrayList<Schedule>();
		this.listCustomers();
		this.list();
	}

	public void insert() {
		try {
			sService.insert(s);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controlador de calendario");
		}
	}

	public void list() {
		try {
			listaCalendario = sService.list();
		} catch (Exception e) {
			System.out.println("Error al listar calendario");
		}
	}

	public void listCustomers() {
		try {
			listaClientes = cuService.list();
		} catch (Exception e) {
			System.out.println("Error al listar personas en el controlador de calendario");
		}
	}

	public String updatePre(Schedule calendario) {
		this.setS(calendario);

		return "updateSchedule.xhtml";
	}

	public void update() {
		try {
			sService.update(this.s);
		} catch (Exception e) {
			System.out.println("Error al listar vacunas en el controlador de calendario");
		}
	}

	public void delete(Schedule s) {
		try {
			sService.delete(s.getIdSchedule());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en controller calendario");
		}
	}

	public void findByNameSchedule() {
		try {
			listaCalendario = sService.findByNameSchedule(this.getS());
		} catch (Exception e) {
			System.out.println("Error al buscar vacuna en el controlador");
		}
	}

	public Schedule getS() {
		return s;
	}

	public void setS(Schedule s) {
		this.s = s;
	}

	public List<Customer> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Customer> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public List<Schedule> getListaCalendario() {
		return listaCalendario;
	}

	public void setListaCalendario(List<Schedule> listaCalendario) {
		this.listaCalendario = listaCalendario;
	}

}
