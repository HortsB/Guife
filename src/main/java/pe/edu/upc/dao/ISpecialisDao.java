package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.Specialist;

public interface ISpecialisDao {
public void insert(Specialist sp);
	
	public List<Specialist> list();
	
	public void delete(int idSpecialist);
	public void update(Specialist sp);
}
