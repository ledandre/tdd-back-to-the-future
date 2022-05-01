package com.github.ledandre.feecalculator;

public class FeeCalculator {

	public static Fee calculate(Salary salary) {
		final double salaryValue = salary.value();
		if (salaryValue <= 1000) {
			return new Fee(salary.value() * 0.05);

		} else if (salaryValue >= 1000 && salaryValue < 2000) {
			return new Fee(salary.value() * 0.10);
		}

		return new Fee(salary.value() * 0.15);
	}
}
