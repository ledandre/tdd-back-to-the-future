package com.github.ledandre.backtothefuture;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Test;

public class PainelDeCircuitosTest {
	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

	@Test
	public void deveConfigurarADataAlvoDoPainel() throws ParseException {
		PainelDeCircuitos painelDeCircuitos = new PainelDeCircuitos();
		painelDeCircuitos.configurarViagemPara("25/04/1790 10:00");
		assertEquals("25/04/1790 10:00", painelDeCircuitos.getDataAlvo().format(FORMATTER));
	}

	@Test
	public void deveMostrarADataAtualAoCriarOPainel() {
		PainelDeCircuitos painelDeCircuitos = new PainelDeCircuitos();
		String agora = LocalDateTime.now().format(FORMATTER);
		assertEquals(agora, painelDeCircuitos.getDataAtual().format(FORMATTER));
	}
}
