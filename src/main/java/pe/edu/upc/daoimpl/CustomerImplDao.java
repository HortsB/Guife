package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICustomerDao;
import pe.edu.upc.entidades.Customer;

public class CustomerImplDao implements ICustomerDao {
	@PersistenceContext(unitName = "Guife")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Customer cu) {
		try {
			em.persist(cu);
		} catch (Exception e) {
			System.out.println("Error al insertar un registro de cliente");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> list() {
		List<Customer> listaClientes = new ArrayList<Customer>();
		try {
			Query jpql = em.createQuery("from Customer cu");
			listaClientes = (List<Customer>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en clientes");
		}

		return listaClientes;
	}

	@Transactional
	@Override
	public void update(Customer cu) {
		try {
			em.merge(cu);
		} catch (Exception e) {
			System.out.println("Error al modificar en el dao clientes");
		}
	}

	@Transactional
	@Override
	public void delete(int idCustomer) {
		// TODO Auto-generated method stub
		try {
			Customer cu = em.find(Customer.class, idCustomer);

			em.remove(cu);
		} catch (Exception e) {
			System.out.println("Error al eliminar persona");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> findByNameCustomer(Customer cu) {
		// TODO Auto-generated method stub
		List<Customer> lista = new ArrayList<Customer>();
		try {
			Query q = em.createQuery("from Customer cu where cu.descriptionCustomer like ?1");
			q.setParameter(1, "%" + cu.getDescriptionCustomer() + "%");
			lista = (List<Customer>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al buscar vacunas");

		}
		return lista;
	}

}
