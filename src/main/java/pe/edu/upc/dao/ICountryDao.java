package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.Country;

public interface ICountryDao {
	public void insert(Country c);

	public List<Country> list();
	
	public void delete(int idCountry);
	public void update(Country c);
}
