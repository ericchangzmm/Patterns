package org.eric.study.patterns.bridge;

/**
 * 不加奶
 * @author eric.zhang
 *
 */
public class FragrantCoffeeImp extends CoffeeImp {

	@Override
	public void pourCoffeeImp() {
		System.out.println("什么也没加,清香");
	}

}
