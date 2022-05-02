package com.github.ledandre.backtothefuture;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class DeLoreanTests {

	@Test
	public void deveCriarUmVeiculoEquipadoComCapacitorDeFluxoEPainelDeCircuitos() {
		Equipamento capacitorDeFluxo = new CapacitorDeFluxo();
		Equipamento painelDeCircuitos = new PainelDeCircuitos();
		Veiculo delorean = new Veiculo("DeLorean", asList(capacitorDeFluxo, painelDeCircuitos));

		assertEquals("DeLorean", delorean.getName());
		assertTrue(delorean.getEquips().get(0) instanceof CapacitorDeFluxo);
		assertTrue(delorean.getEquips().get(1) instanceof PainelDeCircuitos);
	}

	@Test
	public void deveAcelerarAoReceberUmaVelocidade() {
		Equipamento capacitorDeFluxo = new CapacitorDeFluxo();
		Equipamento painelDeCircuitos = new PainelDeCircuitos();
		Veiculo delorean = new Veiculo("DeLorean", asList(capacitorDeFluxo, painelDeCircuitos));

		assertEquals(0, delorean.getVelocidade());
		delorean.acelerar(141);
		assertEquals(141, delorean.getVelocidade());
	}
}
