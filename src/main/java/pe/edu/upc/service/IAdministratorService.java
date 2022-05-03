package pe.edu.upc.service;
import java.util.List;

import pe.edu.upc.entidades.Administrator;
public interface IAdministratorService {
	public void insert(Administrator ad);
	public List<Administrator> list();
	public void delete(int idPerson);
	public void update(Administrator ad);
}
