package arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class avaliacao {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		ArrayList<Integer> positions = new ArrayList<Integer>();
		System.out.println("[-----POSI��ES_PERSEVERANCE-----]");

		 for(int i = 0; i < 20; i++){
			 System.out.print("Informe a "+(i+1)+"� posi��o : ");
			 int x = (read.nextInt());
			 if (positions.contains(x)) {
				 System.out.println(" Posi��o repetida, informe outra posi��o");
				 i= i-1;
			 }else {
				 positions.add(x);
				 System.out.println(" Posi��o guardada.");
			 }			 
		 }	
		 System.out.println("[--------FIM--------]");		
	}
}
