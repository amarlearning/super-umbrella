package com.monotonic;

public enum CoffeeType {
	Espresso(7, 0), Latte(7, 10), FilterCoffee(10, 0);

	private final int requiredBeans;
	private final int requiredMilk;

	private CoffeeType(int requiredBeans, int requiredMilk) {
		this.requiredBeans = requiredBeans;
		this.requiredMilk = requiredMilk;
	}

	public int getRequiredBeans() {
		return requiredBeans;
	}

	public int getRequiredMilk() {
		return requiredMilk;
	}
}
