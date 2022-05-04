package pe.edu.upc.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Specialist")
public class Specialist {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idSpecialist;

	@Column(name = "fullNameSpecialist", nullable = false, length = 45)
	private String fullNameSpecialist;

	@Column(name = "nickNameSpecialist", nullable = false, length = 45)
	private String nickNameSpecialist;

	@Column(name = "phoneSpecialist", nullable = false, length = 45)
	private String phoneSpecialist;
	@Column(name = "typeSpecialist", nullable = false, length = 45)
	private String typeSpecialist;
	@Column(name = "passwordSpecialist", nullable = false, length = 45)
	private String passwordSpecialist;

	@Column(name = "descriptionSpecialist", nullable = false, length = 45)
	private String descriptionSpecialist;

	public Specialist(int idSpecialist, String fullNameSpecialist, String nickNameSpecialist, String phoneSpecialist,
			String typeSpecialist, String passwordSpecialist, String descriptionSpecialist) {
		super();
		this.idSpecialist = idSpecialist;
		this.fullNameSpecialist = fullNameSpecialist;
		this.nickNameSpecialist = nickNameSpecialist;
		this.phoneSpecialist = phoneSpecialist;
		this.typeSpecialist = typeSpecialist;
		this.passwordSpecialist = passwordSpecialist;
		this.descriptionSpecialist = descriptionSpecialist;
	}

	public Specialist() {
		super();
	}

	public int getIdSpecialist() {
		return idSpecialist;
	}

	public void setIdSpecialist(int idSpecialist) {
		this.idSpecialist = idSpecialist;
	}

	public String getFullNameSpecialist() {
		return fullNameSpecialist;
	}

	public void setFullNameSpecialist(String fullNameSpecialist) {
		this.fullNameSpecialist = fullNameSpecialist;
	}

	public String getNickNameSpecialist() {
		return nickNameSpecialist;
	}

	public void setNickNameSpecialist(String nickNameSpecialist) {
		this.nickNameSpecialist = nickNameSpecialist;
	}

	public String getPhoneSpecialist() {
		return phoneSpecialist;
	}

	public void setPhoneSpecialist(String phoneSpecialist) {
		this.phoneSpecialist = phoneSpecialist;
	}

	public String getTypeSpecialist() {
		return typeSpecialist;
	}

	public void setTypeSpecialist(String typeSpecialist) {
		this.typeSpecialist = typeSpecialist;
	}

	public String getPasswordSpecialist() {
		return passwordSpecialist;
	}

	public void setPasswordSpecialist(String passwordSpecialist) {
		this.passwordSpecialist = passwordSpecialist;
	}

	public String getDescriptionSpecialist() {
		return descriptionSpecialist;
	}

	public void setDescriptionSpecialist(String descriptionSpecialist) {
		this.descriptionSpecialist = descriptionSpecialist;
	}

}
