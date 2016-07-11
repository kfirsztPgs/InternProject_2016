package com.pgs.soft.DTO;


public class UserDTO {

	private Integer idUser;
	private String email;
	private String password;
	
	
	
	public UserDTO() {
		super();
	}

	public UserDTO(Integer idUser, String email, String password) {
		super();
		this.idUser = idUser;
		this.email = email;
		this.password = password;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
