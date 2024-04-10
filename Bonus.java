package estruturaCondicional3;
import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int bonus;

		System.out.println("Informe o tempo em que está na empresa em anos: ");
		bonus = ler.nextInt();

		String msg = bonus <= 3 ? "Seu bônus é de 5%" : "Seu bônus é de 7%";
		System.out.println(msg);

		ler.close();
	}

}
