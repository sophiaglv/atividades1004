package estruturaCondicional3;
import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int ano;

		System.out.println("Informe o ano: ");
		ano = ler.nextInt();

		String msg = ano %4 == 0 && ano %100 != 0 || ano %400 == 0 ? "O ano é bissexto." : "O ano não é bissexto";
		System.out.println(msg);

		ler.close();
	}

}
