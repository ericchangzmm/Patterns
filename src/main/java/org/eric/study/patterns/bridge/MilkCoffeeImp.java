package org.eric.study.patterns.bridge;

/**
 * 加奶
 * 
 * @author eric.zhang
 * 
 */
public class MilkCoffeeImp extends CoffeeImp {

	@Override
	public void pourCoffeeImp() {
		System.out.println("加了美味的牛奶");
	}

}
