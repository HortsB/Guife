package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entidades.Specialist;

public interface ISpecialistService {
	public void insert(Specialist sp);
	public List<Specialist> list();
	public void delete(int idSpecialist);
	public void update(Specialist sp);
}
