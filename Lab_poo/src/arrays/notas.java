package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n;
		double total = 0;
		System.out.print("Quantas notas deseja informar? ");
		n = read.nextInt();
		
		double notas[] = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("informe a nota "+(i+1)+":");
			notas[i] = read.nextInt();}
		
		System.out.println("Notas: "+Arrays.toString(notas));
		
		for (double d : notas) {
			total += d;	}
		
		System.out.println("Total: "+total);
		System.out.println("A média é: "+total/n);	
	}

}
