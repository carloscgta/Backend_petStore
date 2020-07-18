package br.com.pestore.pojos;

import com.google.gson.annotations.SerializedName;

public class Category {

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@SerializedName("id")
	private String id;
	
	@SerializedName("name")
	private String name;
	
}
