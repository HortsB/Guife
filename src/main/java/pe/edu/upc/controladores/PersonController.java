package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Person;
import pe.edu.upc.service.IPersonService;

@Named
@RequestScoped
public class PersonController {
	@Inject
	private IPersonService pService;

	private Person p;
	List<Person> listaPersonas;

	// constructor
	@PostConstruct
	public void init() {
		this.listaPersonas = new ArrayList<Person>();
		this.p = new Person();
		this.list();
	}

	// métodos

	public String newPerson() {

		this.setP(new Person());
		return "persona.xhtml";
	}

	public void insert() {
		try {
			pService.insert(p);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller persona");
		}
	}

	public void list() {
		try {
			listaPersonas = pService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller persona");
		}
	}
	
	public void delete(Person per) {
		try {
			pService.delete(per.getIdPerson());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en controller persona");
		}
	}
	// getters and setters
	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	public List<Person> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(List<Person> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

}
