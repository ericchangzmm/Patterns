package org.eric.study.patterns.bridge;

/**
 * 制作中杯加奶， 大杯加奶
 * @author eric.zhang
 *
 */
public class Main {

	public static void main(String[] args) {

		MilkCoffeeImp coffeeImp = new MilkCoffeeImp();
		
		MediumCoffee mediumCoffee = new MediumCoffee(coffeeImp);
		mediumCoffee.pourCoffee();
		
		System.out.println();
		
		SuperSizeCoffee superSizeCoffee = new SuperSizeCoffee(coffeeImp);
		superSizeCoffee.pourCoffee();
		
	}

}
