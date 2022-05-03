package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Country;
import pe.edu.upc.service.ICountryService;

@Named
@RequestScoped
public class countryController {
	@Inject
	private ICountryService cService;
	
	private Country c;
	List<Country> listCountry;
	
	// constructor
		@PostConstruct
		public void init() {
			this.listCountry = new ArrayList<Country>();
			this.c = new Country();
			this.list();
		}
		// métodos
		
		public String newCountry() {

			this.setC(new Country());
			return "Country.xhtml";
		}

		public void insert() {
			try {
				cService.insert(c);

			} catch (Exception e) {
				System.out.println("Error al insertar en el controller Country");
			}
		}

		public void list() {
			try {
				listCountry = cService.list();
			} catch (Exception e) {
				System.out.println("Error al listar en controller Country");
			}
		}
		
		public void delete(Country c) {
			try {
				cService.delete(c.getIdCountry());
				this.list();
			} catch (Exception e) {
				System.out.println("Error al eliminar en controller persona");
			}
		}
		
		public String updatePree(Country pais) {
			this.setC(pais);
			return "updateCountry.xhtml";
		}
		
		public void update() {
			try {
				cService.update(this.c);
			} catch (Exception e) {
				System.out.println("Error al modificar en el controlador pais");
			}
		}
		// getters and setters

		public ICountryService getcService() {
			return cService;
		}

		public void setcService(ICountryService cService) {
			this.cService = cService;
		}

		public Country getC() {
			return c;
		}

		public void setC(Country c) {
			this.c = c;
		}

		public List<Country> getListCountry() {
			return listCountry;
		}

		public void setListCountry(List<Country> listCountry) {
			this.listCountry = listCountry;
		}
		
		
		
		
}
