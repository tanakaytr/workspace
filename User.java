public class User{
	String lastname;
	String firstname;
	String id;
	String password;
	
	public User(String lastname, String firstname) {
		this.lastname = lastname;
		this.firstname = firstname;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return this.lastname + this.firstname;
	}
}