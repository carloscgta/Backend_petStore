package br.com.pestore.pojos;

import com.google.gson.annotations.SerializedName;

public class Order {

//	  "id": 1, 
//	    "petId": 9999004, 
//	    "quantity": 1, 
//	    "shipDate": "2020-07-10T23:02:27.390Z", 
//	    
//	    "status": "placed", 
//	    
//	    "complete": true
	
	@SerializedName("id")
	private Integer id;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the petId
	 */
	public Integer getPetId() {
		return petId;
	}

	/**
	 * @param petId the petId to set
	 */
	public void setPetId(Integer petId) {
		this.petId = petId;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the complete
	 */
	public boolean isComplete() {
		return complete;
	}

	/**
	 * @param complete the complete to set
	 */
	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	@SerializedName("petId")
	private Integer petId;
	
	@SerializedName("quantity")
	private Integer quantity;
	
	@SerializedName("status")
	private String status;
	
	@SerializedName("complete")
	private boolean complete;
	
	

}
