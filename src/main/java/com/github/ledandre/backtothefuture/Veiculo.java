package com.github.ledandre.backtothefuture;

import java.util.List;

public class Veiculo {

	private String name;
	private List<Equipamento> equips;
	private int velocidade;

	public Veiculo(String name, List<Equipamento> equips) {
		this.name = name;
		this.equips = equips;
	}

	public String getName() {
		return name;
	}

	public List<Equipamento> getEquips() {
		return equips;
	}

	public Integer getVelocidade() {
		return velocidade;
	}

	public void acelerar(int kmh) {
		velocidade = kmh;
	}
}
