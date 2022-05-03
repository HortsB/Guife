package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPersonDao;
import pe.edu.upc.entidades.Person;
import pe.edu.upc.service.IPersonService;

@Named
public class PersonServiceImpl implements IPersonService {

	@Inject
	private IPersonDao pDao;

	@Override
	public void insert(Person p) {
		pDao.insert(p);
	}

	@Override
	public List<Person> list() {
		// TODO Auto-generated method stub
		return pDao.list();
	}

	@Override
	public void delete(int idPerson) {
		// TODO Auto-generated method stub
		pDao.delete(idPerson);
	}

}
