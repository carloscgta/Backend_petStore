package br.com.pestore.pojos;

import com.google.gson.annotations.SerializedName;

public class User {


	@SerializedName("id")
	private Integer id;
	
	@SerializedName("username")
	private String username;
		
	@SerializedName("firstName")
	private String firstName;
	
	@SerializedName("lastName")
	private String lastName;
	
	@SerializedName("email")
	private String email;
	
	@SerializedName("phone")
	private String phone;
	
	@SerializedName("password")
	private String password;
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the userStatus
	 */
	public Integer getUserStatus() {
		return userStatus;
	}

	/**
	 * @param userStatus the userStatus to set
	 */
	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

	@SerializedName("userStatus")
	private Integer userStatus;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	
	

}
