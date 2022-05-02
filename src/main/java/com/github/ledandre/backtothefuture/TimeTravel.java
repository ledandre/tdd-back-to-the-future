package com.github.ledandre.backtothefuture;

import java.time.LocalDateTime;

public class TimeTravel {

	private LocalDateTime actualTime = LocalDateTime.now();

	public void iniciar(Veiculo delorean) {
		CapacitorDeFluxo capacitor = (CapacitorDeFluxo) delorean.getEquips().get(0);
		PainelDeCircuitos painel = (PainelDeCircuitos) delorean.getEquips().get(1);
		if (delorean.getVelocidade() == 141 && capacitor.getGigawatts() == 1.21 && painel.getDataAlvo() != null) {
			actualTime = painel.getDataAlvo();
		}
	}

	public LocalDateTime whatTimeIsIt() {
		return actualTime;
	}
}
