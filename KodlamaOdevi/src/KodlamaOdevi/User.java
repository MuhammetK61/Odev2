package KodlamaOdevi;

public class User {
	int id;
	String firstname;
	String lastname;
	String username;

	public User(){
		
	}
	
	public User(int id, String firsname, String lastname, String username) {
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.username=username;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}




