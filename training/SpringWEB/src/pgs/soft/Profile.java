package pgs.soft;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Profile {
	private String name;
	private String lastname;
	
	@PostConstruct
	public void init(){
		name = "Adrian";
		lastname = "Kulinski";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String toString(){
		return "Imie: " + name + ", Nazwisko: " + lastname;
	}

}
