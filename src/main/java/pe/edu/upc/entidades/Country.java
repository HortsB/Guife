package pe.edu.upc.entidades;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Country")
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCountry;
	
	@Column(name = "nameCountry", nullable = false, length = 40)
	private String nameCountry;

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(int idCountry, String nameCountry) {
		super();
		this.idCountry = idCountry;
		this.nameCountry = nameCountry;
	}

	public int getIdCountry() {
		return idCountry;
	}

	public void setIdCountry(int idCountry) {
		this.idCountry = idCountry;
	}

	public String getNameCountry() {
		return nameCountry;
	}

	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCountry);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return idCountry == other.idCountry;
	}
	
	
}
