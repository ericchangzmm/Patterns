package org.eric.study.patterns.bridge;

/**
 * 中杯咖啡
 * @author eric.zhang
 *
 */
public class MediumCoffee extends Coffee {

	public MediumCoffee(CoffeeImp coffeeImp) {
		setCoffeeImp(coffeeImp);
	}

	@Override
	public void pourCoffee() {
		//我们以重复次数来说明是冲中杯还是大杯 ,重复2次是中杯,重复5次是大杯
		for (int i = 0; i < 2; i++) {
			coffeeImp.pourCoffeeImp();
		}
	}

}
