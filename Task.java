package pe.edu.upc.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Task")
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTask;
	
	@Column(name = "tittleTask", nullable = false, length = 50)
	private String tittleTask;
	@Column(name = "descriptionTask", nullable = true, length = 50)
	private String descriptionTask;
	@Column(name = "statusTask", nullable = false, length = 15)
	private String statusTask;
	@Column(name = "dateTask", nullable = false)
	private Date dateTask;
	
	public Task() {
		super();
		//TODO Auto-generated constructor stub
	}
	public Task(int idTask,String tittleTask,String descriptionTask,String statusTask,Date dateTask) {
		super();
		this.idTask=idTask;
		this.tittleTask=tittleTask;
		this.descriptionTask=descriptionTask;
		this.statusTask=statusTask;
		this.dateTask=dateTask;
	}
	public int getIdTask() {
		return idTask;
	}
	public void setIdTask(int idTask) {
		this.idTask = idTask;
	}
	public String getTittleTask() {
		return tittleTask;
	}
	public void setTittleTask(String tittleTask) {
		this.tittleTask = tittleTask;
	}
	public String getDescriptionTask() {
		return descriptionTask;
	}
	public void setDescriptionTask(String descriptionTask) {
		this.descriptionTask = descriptionTask;
	}
	public String getStatusTask() {
		return statusTask;
	}
	public void setStatusTask(String statusTask) {
		this.statusTask = statusTask;
	}
	public Date getDateTask() {
		return dateTask;
	}
	public void setDateTask(Date dateTask) {
		this.dateTask = dateTask;
	}
	
}
