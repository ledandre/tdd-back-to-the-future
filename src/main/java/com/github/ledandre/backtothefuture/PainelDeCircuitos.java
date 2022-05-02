package com.github.ledandre.backtothefuture;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PainelDeCircuitos implements Equipamento {
	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	private LocalDateTime dataAtual;
	private LocalDateTime dataAlvo;

	public PainelDeCircuitos() {
		this.dataAtual = LocalDateTime.now();
	}

	public LocalDateTime getDataAtual() {
		return dataAtual;
	}

	public LocalDateTime getDataAlvo() {
		return dataAlvo;
	}

	public void configurarViagemPara(String dataString) throws ParseException {
		this.dataAlvo = LocalDateTime.parse(dataString, FORMATTER);
	}}
