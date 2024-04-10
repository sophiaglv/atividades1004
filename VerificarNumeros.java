package estruturaCondicional3;
import java.util.Scanner;

public class VerificarNumeros {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero;

		System.out.println("Escolha um número entre 1 a 3");
		numero = ler.nextInt();

		switch (numero) {
		case 1:
			System.out.println("O número escolhido foi: 1");
			break;
		case 2:
			System.out.println("O número escolhido foi: 2");
			break;
		case 3:
			System.out.println("O número escolhido foi: 3");
			break;
		default:
			System.out.println("O número é inválido! Digite um número entre 1 a 3.");
		}
		ler.close();
	}

}
