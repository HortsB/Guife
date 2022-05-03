package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.Person;

public interface IPersonDao {
	
	
	public void insert(Person p);

	public List<Person> list();
	
	public void delete(int idPerson);

}
