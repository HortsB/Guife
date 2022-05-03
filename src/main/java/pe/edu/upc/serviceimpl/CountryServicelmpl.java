package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Country;
import pe.edu.upc.dao.ICountryDao;
import pe.edu.upc.service.ICountryService;

@Named
public class CountryServicelmpl implements ICountryService{
	
	@Inject
	private ICountryDao cDao;

	@Override
	public void insert(Country c) {
		cDao.insert(c);
	}

	@Override
	public List<Country> list() {
		// TODO Auto-generated method stub
		return cDao.list();
	}
	
	@Override
	public void delete(int idCountry) {
		// TODO Auto-generated method stub
		cDao.delete(idCountry);
	}

	@Override
	public void update(Country c) {
		// TODO Auto-generated method stub
		cDao.update(c);
	}
}
