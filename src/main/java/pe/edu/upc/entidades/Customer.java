package pe.edu.upc.entidades;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCustomer;

	@OneToOne
	@JoinColumn(name = "idPerson", nullable = false)
	private Person person;

	@Column(name = "descriptionCustomer", nullable = false, length = 100)
	private String descriptionCustomer;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int idCustomer, Person person, String descriptionCustomer) {
		super();
		this.idCustomer = idCustomer;
		this.person = person;
		this.descriptionCustomer = descriptionCustomer;
	}

	public int getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getDescriptionCustomer() {
		return descriptionCustomer;
	}

	public void setDescriptionCustomer(String descriptionCustomer) {
		this.descriptionCustomer = descriptionCustomer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCustomer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return idCustomer == other.idCustomer;
	}

	
}
