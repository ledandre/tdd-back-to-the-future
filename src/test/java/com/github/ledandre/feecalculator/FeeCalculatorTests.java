package com.github.ledandre.feecalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FeeCalculatorTests {

	@Test
	@DisplayName("Deve retornar imposto de 5% quando o salário for menor que R$1000")
	public void shouldReturn10PercentWhenSalaryIsLowerThan1000() {
		Fee fee = FeeCalculator.calculate(new Salary(900));
		assertEquals(45, fee.value());
	}

	@Test
	@DisplayName("Deve retornar imposto de 10% quando o salário for entre R$1000 e R$1999")
	public void shouldReturn15PercentWhenSalaryIsBetween1000And1999() {
		Fee fee = FeeCalculator.calculate(new Salary(1500));
		assertEquals(150, fee.value());
	}

	@Test
	@DisplayName("Deve retornar imposto de 15% quando o salário for maior ou igual que R$2000")
	public void shouldReturn15PercentWhenSalaryIsGreaterOrEqualsThan2000() {
		Fee fee = FeeCalculator.calculate(new Salary(1500));
		assertEquals(150, fee.value());
	}
}
