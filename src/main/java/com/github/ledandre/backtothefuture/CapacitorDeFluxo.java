package com.github.ledandre.backtothefuture;

public class CapacitorDeFluxo implements Equipamento {
	private double gigawatts = 0;

	public CapacitorDeFluxo() {
	}

	public void consumirPlutonio(double gramasDePlutonio) {
		this.gigawatts = gramasDePlutonio / 100;
	}

	public double getGigawatts() {
		return gigawatts;
	}
}
