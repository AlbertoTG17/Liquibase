package netgloo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


	
	@Entity
	@Table(name = "cabessas")
	public class Cabessa {

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  
	  @NotNull
	  private String email;
	   
	  @NotNull
	  private String name;
	  
	  public Cabessa() {}

	  
	  public Cabessa(long id, @NotNull String email, @NotNull String name) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
	}

	// Getter and setter methods
	  public long getId() {
	    return id;
	  }

	  public void setId(long value) {
	    this.id = value;
	  }

	  public String getEmail() {
	    return email;
	  }
	  
	  public void setEmail(String value) {
	    this.email = value;
	  }
	  
	  public String getName() {
	    return name;
	  }

	  public void setName(String value) {
	    this.name = value;
	  }
	  


}
