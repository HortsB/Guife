package pe.edu.upc.controladores;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Administrator;
import pe.edu.upc.service.IAdministratorService;

@Named
@RequestScoped
public class AdministratorController {

	@Inject
	private IAdministratorService adService;
	private Administrator ad;
	List<Administrator> listaAdministradores;
	
	@PostConstruct
	public void init() {
		this.listaAdministradores= new ArrayList<Administrator>();
		this.ad=new Administrator();
		this.list();
	}

	
	public String newAdministrator() {
		this.setAd(new Administrator());
		return "administrador.xhtml";
	}
	
	public void insert() {
		try {
			adService.insert(ad);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller administrador");
		}
	}
	
	private void list() {
		try {
			listaAdministradores=adService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller administrador");
		}
	}
	
	public void delete(Administrator adm) {
		try {
			adService.delete(adm.getIdPerson());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en controller administrador");
		}
	}
	
	public String updatePree(Administrator ad) {
		this.setAd(ad);
		return "updateAdministrator.xhtml";
	}
	
	public void update() {
		try {
			adService.update(this.ad);
		} catch (Exception e) {
			System.out.println("Error al actualizar en controller administrador");
		}
	}


	public Administrator getAd() {
		return ad;
	}


	public void setAd(Administrator ad) {
		this.ad = ad;
	}


	public List<Administrator> getListaAdministradores() {
		return listaAdministradores;
	}


	public void setListaAdministradores(List<Administrator> listaAdministradores) {
		this.listaAdministradores = listaAdministradores;
	}
	
	
	
}
