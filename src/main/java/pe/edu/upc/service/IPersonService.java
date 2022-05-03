package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entidades.Person;

public interface IPersonService {

	public void insert(Person p);

	public List<Person> list();
	
	public void delete(int idPerson);
}
