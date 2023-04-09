package arrays;
import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		double total = 0;

		System.out.print("Quantas alunos deseja informar? ");
		int qtdAnlunos = read.nextInt();

		System.out.print("Quantas notas deseja informar? ");
		int qtdNotas = read.nextInt();

		double notas[][] = new double[qtdAnlunos][qtdNotas];

		for (int a = 0; a < qtdAnlunos; a++) {
			for (int n = 0; n < qtdNotas; n++) {

				System.out.printf("informe a nota %d do aluno %d: ",n+1,a+1);
				notas[a][n] = read.nextInt();
				total += notas[a][n];
			}
		
		}

		System.out.println("Total: " + total);
		System.out.println("A média é: " + total / notas.length);
	}

}
