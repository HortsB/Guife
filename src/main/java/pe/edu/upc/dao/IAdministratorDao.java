package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.Administrator;

public interface IAdministratorDao {
	public void insert(Administrator ad);
	
	public List<Administrator> list();
	
	public void delete(int idPerson);
	public void update(Administrator ad);
}
