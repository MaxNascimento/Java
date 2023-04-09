package collections;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos1 {

	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("lab POO");
		conjunto.add(1);
		conjunto.add('w');
		
		//System.out.println(conjunto.size());
		
		Set numero = new HashSet();
		
		numero.add(1);
		numero.add(2);
		numero.add(3);
		numero.add(5);
		numero.add(10);
		
		System.out.println(numero);
		
		//conjunto.addAll(numero);
		
		//System.out.println(conjunto)
	

		
	}

}
