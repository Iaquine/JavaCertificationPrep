import java.util.Locale;
import java.util.Scanner;

public class Conversao {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println
		("Digite o primeiro salario: ");
		String primeiroSalario = sc.nextLine().replace(",", ".");
		
		System.out.println
		("Digite o segundo salario: ");
		String segundoSalario = sc.nextLine().replace(",", ".");
		
		System.out.println
		("Digite o terceiro salario: ");
		String terceiroSalario = sc.nextLine().replace(",", ".");
		
		System.out.println((Double.parseDouble(primeiroSalario)+
				Double.parseDouble(segundoSalario)+
				Double.parseDouble(terceiroSalario))/3);
		
		sc.close();
	}

}
