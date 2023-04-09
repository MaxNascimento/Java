package lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListaProduto {

	public static void main(String[] args) {
		
		ArrayList<Produto> listaProdutos =  new ArrayList<>();
		

		listaProdutos.add(new Produto("Arroz"));
		listaProdutos.add(new Produto("Feijão"));
		listaProdutos.add(new Produto("Café"));
		listaProdutos.add(new Produto("Leite"));
		listaProdutos.add(new Produto("Açucar"));
	
		listaProdutos.remove(1);
		listaProdutos.remove(0);
		
		Collections.sort(listaProdutos);

		for (Produto produto : listaProdutos) {
			System.out.println(produto.nome);
		}
		

}
	


}