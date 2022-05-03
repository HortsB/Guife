package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ICustomerDao;
import pe.edu.upc.entidades.Customer;
import pe.edu.upc.service.ICustomerService;

@Named
public class CustomerServiceImpl implements ICustomerService{
	@Inject
	private ICustomerDao cuDao;
	
	@Override
	public void insert(Customer cu) {
		// TODO Auto-generated method stub
		cuDao.insert(cu);
	}

	@Override
	public List<Customer> list() {
		// TODO Auto-generated method stub
		return cuDao.list();
	}

	@Override
	public void update(Customer cu) {
		// TODO Auto-generated method stub
		cuDao.update(cu);
	}

	@Override
	public void delete(int idCustomer) {
		// TODO Auto-generated method stub
		cuDao.delete(idCustomer);
	}

	@Override
	public List<Customer> findByNameCustomer(Customer cu) {
		// TODO Auto-generated method stub
		return cuDao.findByNameCustomer(cu);
	}

}
