package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entidades.Country;

public interface ICountryService {
	public void insert(Country c);

	public List<Country> list();
	
	public void delete(int idCountry);
	public void update(Country c);
}
