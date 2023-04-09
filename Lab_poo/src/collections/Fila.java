package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {
			
		   Queue<Integer> filaNormal = new LinkedList<>();   
		   Queue<Integer> filaPrior = new LinkedList<>();
		  
		   Scanner read = new Scanner(System.in);
		    
		   int contPrior = 1;
		   int contNormal = 1;
		     int opcao = 0;
		     int senha = 0;
		     int prior = 0;

		   do{
		       System.out.println("1- Retirar Senha Convencional");
		       System.out.println("2- Retira Senha Prioritária");
		       System.out.println("3- Chamar Senha");
		       System.out.println("4- Sair");
		      
		       opcao = read.nextInt();

		   switch (opcao) {
				   
		   		case 1:
		               senha++;
		               filaNormal.add(senha);
		               System.out.println("Sua senha é: C00" + senha);
		               System.out.println("");
		               break;
		        
		   		case 2:
		             prior++;
		             filaPrior.add(prior);
		             System.out.println("Sua Senha é: P00" + prior);
		             System.out.println("");
		             break;
		   		
		   		case 3:
		        	
		        	if(contPrior <= filaPrior.size()) {
		        		System.out.println("Atendendo agora: P00"+ contPrior);
		        		contPrior++;
		        	}
		        	else if(contNormal <= filaNormal.size()){
		        		System.out.println("Atendendo agora: C00" + contNormal);
		        		contNormal++;
		        	}
		        	else {
		        		System.out.println("Nao ha ninguem na fila!");
		        	}

		        	System.out.println("");
		        	
		             break;
		             
     
		        case 4:	
		            System.out.println("Finalizado"); 
		            break; 
		             
		       default:
		             System.out.println("Opção Invalida"); 
		                
		   }
		        
		 }while (opcao != 4);
		 read.close();
		 
		 if(contPrior <= filaPrior.size()) {
     		System.out.println("Atendendo agora: P00"+ contPrior);
     		contPrior++;
     	}
     	else if(contNormal <= filaNormal.size()){
     		System.out.println("Atendendo agora: C00" + contNormal);
     		contNormal++;
     	}
     	else {
     		System.out.println("Nao ha ninguem na fila!");
     	}

     	System.out.println("");
     	
	}
	
}