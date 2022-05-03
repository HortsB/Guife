package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entidades.Customer;

public interface ICustomerService {
	public void insert(Customer cu);

	public List<Customer> list();
	
	public List<Customer> findByNameCustomer(Customer cu);
	
	public void delete(int idCustomer);
	
	public void update(Customer cu);
}
