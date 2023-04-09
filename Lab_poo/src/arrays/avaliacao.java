package arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class avaliacao {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		ArrayList<Integer> positions = new ArrayList<Integer>();
		System.out.println("[-----POSIÇÕES_PERSEVERANCE-----]");

		 for(int i = 0; i < 20; i++){
			 System.out.print("Informe a "+(i+1)+"º posição : ");
			 int x = (read.nextInt());
			 if (positions.contains(x)) {
				 System.out.println(" Posição repetida, informe outra posição");
				 i= i-1;
			 }else {
				 positions.add(x);
				 System.out.println(" Posição guardada.");
			 }			 
		 }	
		 System.out.println("[--------FIM--------]");		
	}
}
