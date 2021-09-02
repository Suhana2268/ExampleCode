package com.pizza.storage;

public class PizzaStoreFactory {
	public static PizzaStoreImpl getPizzaStorage() {
		return new PizzaStoreImpl();
	}
}
