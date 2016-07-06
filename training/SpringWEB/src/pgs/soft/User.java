package pgs.soft;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
	private String username;
	private String password;
	
	@Autowired
	private Profile profile;
	
	@PostConstruct
	public void init(){
		username="akulinski";
		password="pass";
	}
	
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
	
	public String toString(){
		return "Username: " + username + ", Password: " + password + ", " + profile;
	}
	
}
