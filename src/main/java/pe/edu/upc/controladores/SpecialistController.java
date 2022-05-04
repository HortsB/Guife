package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Specialist;
import pe.edu.upc.service.ISpecialistService;

@Named
@RequestScoped
public class SpecialistController {

	@Inject
	private ISpecialistService spService;
	private Specialist sp;
	List<Specialist> listaEspecialistas;

	@PostConstruct
	public void init() {
		this.listaEspecialistas = new ArrayList<Specialist>();
		this.sp = new Specialist();
		this.list();
	}

	public String newSpecialist() {
		this.setSp(new Specialist());
		return "especialista.xhtml";
	}

	public void insert() {
		try {
			spService.insert(sp);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller specialist");
		}
	}

	private void list() {
		try {
			listaEspecialistas = spService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller specialist");
		}
	}

	public void delete(Specialist sp) {
		try {
			spService.delete(sp.getIdSpecialist());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en controller specialist");
		}
	}

	public String updateSpeci(Specialist sp) {
		this.setSp(sp);
		return "updateSpecialist.xhtml";
	}

	public void update() {
		try {
			spService.update(this.sp);
		} catch (Exception e) {
			System.out.println("Error al actualizar en controller specialist");
		}
	}

	public Specialist getSp() {
		return sp;
	}

	public void setSp(Specialist sp) {
		this.sp = sp;
	}

	public List<Specialist> getListaEspecialistas() {
		return listaEspecialistas;
	}

	public void setListaEspecialistas(List<Specialist> listaEspecialistas) {
		this.listaEspecialistas = listaEspecialistas;
	}
}
