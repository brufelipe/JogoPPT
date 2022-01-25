package jogosPPT;

import java.util.Random;
import java.util.Scanner;

public class jogoPPT {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Random comp = new Random();
		String elementos[] = { "Pedra", "Papel", "Tesoura" };
		// System.out.println(comp.nextInt(2)); //visualizar opção do computador para
		// teste
		// System.out.println("o computador escolheu "+elementos[computador]);
		// //visualizar opção do computador para teste
		int escolha = 0;
		int pvida = 0;
		int cvida = 0;

		while (pvida != 3 && cvida != 3) {
			// inicio display
			System.out.println("#######################\n" + "Escolha sua jogada \n" + "[1] Pedra\n" + "[2] Papel\n"
					+ "[3] Tesoura\n" + "#######################");
			int computador = comp.nextInt(2);
			int escolha1 = ent.nextInt();
			escolha = escolha1 - 1;
			// System.out.println("o computador escolheu " + elementos[computador]);
			System.out.println(
					"Você escolheu " + elementos[escolha] + " e o computador escolheu " + elementos[computador]);

			// fim display
			if (escolha == computador) {
				System.out.println("Jogo Empatado");
			} else if (escolha == 0 && computador == 1) {
				System.out.println("Você Perdeu!!!!!!!!!!!!");
				cvida = cvida + 1;
			} else if (escolha == 0 && computador == 2) {
				System.out.println("Você Ganhou!!!!!!!!!!!!");
				pvida = pvida + 1;

				// fim 0
			} else if (escolha == 1 && computador == 0) {
				System.out.println("Você Ganhou!!!!!!!!!!!!");
				pvida = pvida + 1;
			} else if (escolha == 1 && computador == 2) {
				System.out.println("Você Perdeu!!!!!!!!!!!!");
				cvida = cvida + 1;
				// fim 1
			} else if (escolha == 2 && computador == 0) {
				System.out.println("Você Perdeu!!!!!!!!!!!!");
				cvida = cvida + 1;
			} else if (escolha == 2 && computador == 1) {
				System.out.println("Você Ganhou!!!!!!!!!!!!");
				pvida = pvida + 1;
//fim2
			} else {
				System.out.println("Jogada invalida");
			}
			System.out.println("############ Resumo ############");
			System.out.println("Seus ponto : " + pvida);
			System.out.println("Ponto do computador : " + cvida);

		}
		System.out.println("############ Fim do Jogo ############");
	}
}