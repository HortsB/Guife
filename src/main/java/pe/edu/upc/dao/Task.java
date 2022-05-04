package pe.edu.upc.entidades;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Task")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTask;
	
	@Column(name="descriptionTask", nullable=false, length = 100)
	private String descriptionTask;
	
	@Column(name="statusTask" ,nullable=false, length = 2)
	private String statusTask;
	
	@Column(name="dateTask" ,nullable=false)
	private Date dateTask;
	
	@Column(name="activityTask" ,nullable=false, length = 10)
	private String activityTask;
	
	
	
	public Task() {
		super();
	}



	public Task(int idTask, String descriptionTask, String statusTask, Date dateTask, String activityTask) {
		super();
		this.idTask = idTask;
		this.descriptionTask = descriptionTask;
		this.statusTask = statusTask;
		this.dateTask = dateTask;
		this.activityTask = activityTask;
	}



	public int getIdTask() {
		return idTask;
	}



	public void setIdTask(int idTask) {
		this.idTask = idTask;
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



	public String getActivityTask() {
		return activityTask;
	}



	public void setActivityTask(String activityTask) {
		this.activityTask = activityTask;
	}
	
	
	
	
}
