package org.eric.study.patterns.bridge;

/**
 * 咖啡的抽象 其实现由大杯咖啡，中杯咖啡
 * 
 * @author eric.zhang
 * 
 */
public abstract class Coffee {

	CoffeeImp coffeeImp;

	public abstract void pourCoffee();

	public void setCoffeeImp(CoffeeImp coffeeImp) {
		this.coffeeImp = coffeeImp;
	}

	public CoffeeImp getCoffeeImp() {
		return coffeeImp;
	}
}
