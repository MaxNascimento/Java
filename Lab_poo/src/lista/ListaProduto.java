package lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListaProduto {

	public static void main(String[] args) {
		
		ArrayList<Produto> listaProdutos =  new ArrayList<>();
		

		listaProdutos.add(new Produto("Arroz"));
		listaProdutos.add(new Produto("Feij�o"));
		listaProdutos.add(new Produto("Caf�"));
		listaProdutos.add(new Produto("Leite"));
		listaProdutos.add(new Produto("A�ucar"));
	
		listaProdutos.remove(1);
		listaProdutos.remove(0);
		
		Collections.sort(listaProdutos);

		for (Produto produto : listaProdutos) {
			System.out.println(produto.nome);
		}
		

}
	


}