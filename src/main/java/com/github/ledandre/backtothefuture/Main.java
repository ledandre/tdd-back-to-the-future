package com.github.ledandre.backtothefuture;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main implements QuarkusApplication {
	private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

	@Override
	public int run(String... args) throws Exception {
		System.out.println("INICIANDO VIAGEM NO TEMPO!");
		System.out.println(">>> Configuração do painel de circuitos do tempo:");
		System.out.printf("- Data da última viagem: %s \n", "-");
		System.out.printf("- Data atual: %s \n", LocalDateTime.now().format(DATE_FORMATTER));
		System.out.printf("- Data de destino: %s \n", "-");
		System.out.println(">>> Parâmetros de viagem:");
		System.out.printf("- Capacitor de fluxo gerando %d gigawatts de energia \n", 0);
		System.out.printf("- Velocidade do DeLorean: %d km/h \n", 0);
		startTimeTravel();
		return 0;
	}

	private static void startTimeTravel() throws InterruptedException {
		final int markerSize = 50;
		int count = 0;
		System.out.println("3");
		wait(1000);
		System.out.println("2");
		wait(1000);
		System.out.println("1");
		wait(1000);
		System.out.println("INICIANDO VIAGEM NO TEMPO!!");
		printMarkers(markerSize, count);
		System.out.println("VIAGEM FINALIZADA!");
		System.out.printf("=============> AGORA ESTAMOS EM: %s \n", LocalDateTime.now().format(DATE_FORMATTER));
	}

	private static void printMarkers(final int markerSize, int count) throws InterruptedException {
		while (count < markerSize) {
			System.out.print("=");
			wait(200);
			count++;
		}
		System.out.print("\n");
	}

	private static void wait(int millisseconds) throws InterruptedException {
		Thread.sleep(millisseconds);
	}
}
