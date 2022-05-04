package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ISpecialisDao;
import pe.edu.upc.entidades.Specialist;
import pe.edu.upc.service.ISpecialistService;

@Named
public class SpecialistServiceImpl implements ISpecialistService {
	@Inject
	private ISpecialisDao sDao;

	@Override
	public void insert(Specialist sp) {
		sDao.insert(sp);

	}

	@Override
	public List<Specialist> list() {
		return sDao.list();
	}

	@Override
	public void delete(int idSpecialist) {
		sDao.delete(idSpecialist);

	}

	@Override
	public void update(Specialist sp) {
		sDao.update(sp);

	}
}
