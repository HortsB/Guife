package pe.edu.upc.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPerson;

	@Column(name = "fullNamePerson", nullable = false, length = 45)
	private String fullNamePerson;

	@Column(name = "nickNamePerson", nullable = false, length = 20)
	private String nickNamePerson;

	@Column(name = "mailPerson", nullable = false, length = 20)
	private String mailPerson;

	@Column(name = "phonePerson", nullable = false, length = 9)
	private String phonePerson;

	@Column(name = "passwordPerson", nullable = false, length = 40)
	private String passwordPerson;

	@Column(name = "cityPerson", nullable = false, length = 15)
	private String cityPerson;

	public Person(int idPerson, String fullNamePerson, String nickNamePerson, String mailPerson, String phonePerson,
			String passwordPerson, String cityPerson) {
		super();
		this.idPerson = idPerson;
		this.fullNamePerson = fullNamePerson;
		this.nickNamePerson = nickNamePerson;
		this.mailPerson = mailPerson;
		this.phonePerson = phonePerson;
		this.passwordPerson = passwordPerson;
		this.cityPerson = cityPerson;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	public String getFullNamePerson() {
		return fullNamePerson;
	}

	public void setFullNamePerson(String fullNamePerson) {
		this.fullNamePerson = fullNamePerson;
	}

	public String getNickNamePerson() {
		return nickNamePerson;
	}

	public void setNickNamePerson(String nickNamePerson) {
		this.nickNamePerson = nickNamePerson;
	}

	public String getMailPerson() {
		return mailPerson;
	}

	public void setMailPerson(String mailPerson) {
		this.mailPerson = mailPerson;
	}

	public String getPhonePerson() {
		return phonePerson;
	}

	public void setPhonePerson(String phonePerson) {
		this.phonePerson = phonePerson;
	}

	public String getPasswordPerson() {
		return passwordPerson;
	}

	public void setPasswordPerson(String passwordPerson) {
		this.passwordPerson = passwordPerson;
	}

	public String getCityPerson() {
		return cityPerson;
	}

	public void setCityPerson(String cityPerson) {
		this.cityPerson = cityPerson;
	}

}
