package com.github.ledandre.backtothefuture;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Test;

public class TimeTravelTests {
	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

	@Test
	public void deveViajarNoTempoQuandoOsParametrosEstaoCorretos() throws ParseException {
		CapacitorDeFluxo capacitorDeFluxo = new CapacitorDeFluxo();
		capacitorDeFluxo.consumirPlutonio(121);

		PainelDeCircuitos painelDeCircuitos = new PainelDeCircuitos();
		String nascimentoDoPedro = "04/04/1997 14:02";
		painelDeCircuitos.configurarViagemPara(nascimentoDoPedro);

		Veiculo delorean = new Veiculo("DeLorean", asList(capacitorDeFluxo, painelDeCircuitos));
		delorean.acelerar(141);

		TimeTravel timeTravel = new TimeTravel();
		timeTravel.iniciar(delorean);

		assertEquals(nascimentoDoPedro, timeTravel.whatTimeIsIt().format(FORMATTER));
	}

	@Test
	public void naoDeveViajarNoTempoQuandoACargaDoCapacitorNaoForSuficiente() throws ParseException {
		CapacitorDeFluxo capacitorDeFluxo = new CapacitorDeFluxo();
		capacitorDeFluxo.consumirPlutonio(120);

		PainelDeCircuitos painelDeCircuitos = new PainelDeCircuitos();
		String nascimentoDoPedro = "04/04/1997 14:02";
		painelDeCircuitos.configurarViagemPara(nascimentoDoPedro);

		Veiculo delorean = new Veiculo("DeLorean", asList(capacitorDeFluxo, painelDeCircuitos));
		delorean.acelerar(141);

		TimeTravel timeTravel = new TimeTravel();
		timeTravel.iniciar(delorean);

		assertEquals(LocalDateTime.now().format(FORMATTER), timeTravel.whatTimeIsIt().format(FORMATTER));
	}
}
