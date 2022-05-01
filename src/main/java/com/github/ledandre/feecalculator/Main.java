package com.github.ledandre.feecalculator;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main implements QuarkusApplication {

	@Override
	public int run(String... args) throws Exception {
		final double value = Double.parseDouble(args[0]);
		System.out.println("=== Calculadora de impostos ===");
		System.out.println("Salário do funcionário: " + value);
		Fee fee = FeeCalculator.calculate(new Salary(value));
		System.out.println("Imposto: R$" + fee.value());
		return 0;
	}
}
