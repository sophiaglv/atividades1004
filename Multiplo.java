package estruturaCondicional3;
import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double a;

		System.out.println("Informe um valor: ");
		a = ler.nextDouble();

		String msg = a % 5 == 0 ? "O número " + a + " é multiplo de 5" : "O número " + a + " não é multiplo de 5";
		System.out.println(msg);

		ler.close();
	}

}
