package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Customer;
import pe.edu.upc.entidades.Person;
import pe.edu.upc.service.ICustomerService;
import pe.edu.upc.service.IPersonService;

@Named
@RequestScoped
public class CustomerController {

	@Inject
	private ICustomerService cuService;
	@Inject
	private IPersonService pService;

	private Customer cu;
	List<Customer> listaClientes;
	List<Person> listaPersonas;

	@PostConstruct
	public void init() {
		this.cu = new Customer();
		this.listaClientes = new ArrayList<Customer>();
		this.listaPersonas = new ArrayList<Person>();
		this.listPersons();
		this.list();
	}

	// métodos transacciones

	public void insert() {
		try {
			cuService.insert(cu);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controlador de clientes");
		}
	}

	public void list() {
		try {
			listaClientes = cuService.list();
		} catch (Exception e) {
			System.out.println("Error al listar clientes");
		}
	}

	public void delete(Customer cu) {
		try {
			cuService.delete(cu.getIdCustomer());
			
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller persona");
		}
	}

	public void listPersons() {
		try {
			listaPersonas = pService.list();
		} catch (Exception e) {
			System.out.println("Error al listar personas en el controlador de clientes");
		}
	}

	// modificar

	public String updatePre(Customer cliente) {
		this.setCu(cliente);
		return "updateCustomer.xhtml";
	}

	public void update() {
		try {
			cuService.update(this.cu);
		} catch (Exception e) {
			System.out.println("Error al listar vacunas en el controlador de cliente");
		}
	}
	
	//Busqueda
	public void findByNameCustomer() {
		try {
			listaClientes = cuService.findByNameCustomer(this.getCu());
		} catch (Exception e) {
			System.out.println("Error al buscar vacuna en el controlador");
		}
	}

	// getters - setters
	public Customer getCu() {
		return cu;
	}

	public void setCu(Customer cu) {
		this.cu = cu;
	}

	public List<Customer> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Customer> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public List<Person> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(List<Person> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

	public ICustomerService getCuService() {
		return cuService;
	}

	public void setCuService(ICustomerService cuService) {
		this.cuService = cuService;
	}

	public IPersonService getpService() {
		return pService;
	}

	public void setpService(IPersonService pService) {
		this.pService = pService;
	}

}
