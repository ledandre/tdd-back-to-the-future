package com.github.ledandre.backtothefuture;

import static java.util.Arrays.asList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main implements QuarkusApplication {
	private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	private static TimeTravel timeTravel = new TimeTravel();
	@Override
	public int run(String... args) throws Exception {
		
		CapacitorDeFluxo capacitorDeFluxo = new CapacitorDeFluxo();
		capacitorDeFluxo.consumirPlutonio(121);

		PainelDeCircuitos painelDeCircuitos = new PainelDeCircuitos();
		String nascimentoDoPedro = "04/04/1997 14:02";
		painelDeCircuitos.configurarViagemPara(nascimentoDoPedro);

		Veiculo delorean = new Veiculo("DeLorean", asList(capacitorDeFluxo, painelDeCircuitos));
		delorean.acelerar(141);

		System.out.println("INICIANDO VIAGEM NO TEMPO!");
		System.out.println(">>> Configuração do painel de circuitos do tempo:");
		System.out.printf("- Data da última viagem: %s \n", "-");
		System.out.printf("- Data atual: %s \n", timeTravel.whatTimeIsIt().format(DATE_FORMATTER));
		System.out.printf("- Data de destino: %s \n", painelDeCircuitos.getDataAlvo().format(DATE_FORMATTER));
		System.out.println(">>> Parâmetros de viagem:");
		System.out.printf("- Capacitor de fluxo gerando " + capacitorDeFluxo.getGigawatts() + " gigawatts de energia \n");
		System.out.printf("- Velocidade do DeLorean: %d km/h \n", delorean.getVelocidade());
		timeTravel.iniciar(delorean);
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
		System.out.printf("=============> AGORA ESTAMOS EM: %s \n", timeTravel.whatTimeIsIt().format(DATE_FORMATTER));
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
