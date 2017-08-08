package io.model;

public class UserRegistrationResource {

	private String username; 
	private String email; 

	protected UserRegistrationResource() {
    }

	public UserRegistrationResource(UserRegistrationApiData userRegistration) {
        this.username = userRegistration.getUsername();
        this.email = userRegistration.getEmail();
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	


}
