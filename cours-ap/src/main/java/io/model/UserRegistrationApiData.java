package io.model;

public class UserRegistrationApiData {
	private String username;
    private String password;
    private String email;
    private char userRole;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getUserRole() {
		return userRole;
	}
	public void setUserRole(char userRole) {
		this.userRole = userRole;
	}
	
    
    
}
