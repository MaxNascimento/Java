package arrays;

import java.util.Scanner;

public class aaa {
	 public static void main(String[] args){
		 
		 int numero[] = new int[20];
		 boolean repetiu = false;
		 Scanner read = new Scanner(System.in);
		 
		 for(int i = 0; i < numero.length; i++){
			 System.out.println("informe o valor : ");
			 numero[i] = read.nextInt();
			 
			
			 
		 }
		 for(int i=0;i<numero.length-1;i++){
			  for(int j = i+1; j <numero.length;j++){
				if (numero[j] == numero[i]) {
				  repetiu = true;
				  System.out.println("O elemento" +numero[j] + "se repete \n");
				}
			  }
}
	 }
}
