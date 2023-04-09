package arrays;

import java.util.Arrays;

public class TrabalhandoArrays {

	public static void main(String[]args) {
		
		double[] notasAluno = new double[5];
		notasAluno[0] = 8.0;
		notasAluno[1] = 5.9;
		notasAluno[2] = 7;
		notasAluno[3] = 1.9;
		notasAluno[4] = 9.1;
		

	    System.out.println(Arrays.toString(notasAluno));
		
	    double total = 0;
	    for (int i = 0; i < notasAluno.length; i++) {
	    	total += notasAluno[i];
			
		}
	    
	    System.out.println(total / notasAluno.length);
	}
}
