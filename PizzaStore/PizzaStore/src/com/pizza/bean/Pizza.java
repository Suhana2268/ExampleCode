package com.pizza.bean;

public class Pizza {
	
	  private String pizzaName; 
	  private int sizeInCms; 
	  private String majorIngredientOne; 
	  private String majorIngredientTwo; 
	  private String majorIngredientThree; 
	  private float weight; 
	  private float price;

	  /**
	 * @return the pizzaName
	 */
	public String getPizzaName() {
		return pizzaName;
	}


	/**
	 * @return the sizeInCms
	 */
	public int getSizeInCms() {
		return sizeInCms;
	}


	/**
	 * @return the majorIngredientOne
	 */
	public String getMajorIngredientOne() {
		return majorIngredientOne;
	}


	/**
	 * @return the majorIngredientTwo
	 */
	public String getMajorIngredientTwo() {
		return majorIngredientTwo;
	}


	/**
	 * @return the majorIngredientThree
	 */
	public String getMajorIngredientThree() {
		return majorIngredientThree;
	}


	/**
	 * @return the weight
	 */
	public float getWeight() {
		return weight;
	}


	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}


	/**
	 * @param pizzaName the pizzaName to set
	 */
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}


	/**
	 * @param sizeInCms the sizeInCms to set
	 */
	public void setSizeInCms(int sizeInCms) {
		this.sizeInCms = sizeInCms;
	}


	/**
	 * @param majorIngredientOne the majorIngredientOne to set
	 */
	public void setMajorIngredientOne(String majorIngredientOne) {
		this.majorIngredientOne = majorIngredientOne;
	}


	/**
	 * @param majorIngredientTwo the majorIngredientTwo to set
	 */
	public void setMajorIngredientTwo(String majorIngredientTwo) {
		this.majorIngredientTwo = majorIngredientTwo;
	}


	/**
	 * @param majorIngredientThree the majorIngredientThree to set
	 */
	public void setMajorIngredientThree(String majorIngredientThree) {
		this.majorIngredientThree = majorIngredientThree;
	}


	/**
	 * @param weight the weight to set
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}


	public void preparation() { 
		  
		  
	  }


	public Pizza(String pizzaName, int sizeInCms, String majorIngredientOne, String majorIngredientTwo,
			String majorIngredientThree, float weight, float price) {
		super();
		this.pizzaName = pizzaName;
		this.sizeInCms = sizeInCms;
		this.majorIngredientOne = majorIngredientOne;
		this.majorIngredientTwo = majorIngredientTwo;
		this.majorIngredientThree = majorIngredientThree;
		this.weight = weight;
		this.price = price;
	}


	public Pizza() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Pizza [pizzaName=" + pizzaName + ", sizeInCms=" + sizeInCms + ", majorIngredientOne="
				+ majorIngredientOne + ", majorIngredientTwo=" + majorIngredientTwo + ", majorIngredientThree="
				+ majorIngredientThree + ", weight=" + weight + ", price=" + price + "]";
	}
	
	


}
