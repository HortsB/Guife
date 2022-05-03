package pe.edu.upc.serviceimpl;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IAdministratorDao;
import pe.edu.upc.entidades.Administrator;
import pe.edu.upc.service.IAdministratorService;

@Named
public class AdministratorServicImpl implements IAdministratorService{

	@Inject
	private IAdministratorDao aDao;
	
	@Override
	public void insert(Administrator ad) {
		aDao.insert(ad);
	}

	@Override
	public List<Administrator> list() {
		return aDao.list();
	}

	@Override
	public void delete(int idPerson) {
		aDao.delete(idPerson);
	}

	@Override
	public void update(Administrator ad) {
		// TODO Auto-generated method stub
		aDao.update(ad);
	}

}
