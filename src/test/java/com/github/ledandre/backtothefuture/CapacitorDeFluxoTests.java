package com.github.ledandre.backtothefuture;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CapacitorDeFluxoTests {

	@Test
	@DisplayName("Deve gerar 0.01 gigawatts quando abastecido com 1g de plutônio")
	public void deveGerar001gigawattsPorGramaDePlutonio() {
		double gramasDePlutonio = 1;
		CapacitorDeFluxo capacitor = new CapacitorDeFluxo();
		capacitor.consumirPlutonio(gramasDePlutonio);
		double gigawatts = capacitor.getGigawatts();
		assertEquals(0.01, gigawatts);
	}

	@Test
	@DisplayName("Deve gerar 1.21 gigawatts quando abastecido com 121g de plutônio")
	public void deveGerar1ponto21gigawattsQuandoAbastecidoCom121GramasDePlutonio() {
		double gramasDePlutonio = 121;
		CapacitorDeFluxo capacitor = new CapacitorDeFluxo();
		capacitor.consumirPlutonio(gramasDePlutonio);
		double gigawatts = capacitor.getGigawatts();
		assertEquals(1.21, gigawatts);
	}
}
