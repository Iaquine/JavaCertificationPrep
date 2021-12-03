import java.util.Locale;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Quantas notas você quer inserir? ");
		int quantidadeDeNotas = (Integer.parseInt(sc.nextLine()));
		
		double notas[] = new double [quantidadeDeNotas];
		
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a "+
					(i+1)+"ª "+"nota: ");
			notas[i] = sc.nextDouble();
		}
		
		double total = 0;
		for (double nota: notas) {
			total += nota;
		}
		
		System.out.println(
				"A média do aluno é: "+total/notas.length);
		
		sc.close();
	}

}
