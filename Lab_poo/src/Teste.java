//importações
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Teste {

	public static void main(String[] args) {
		//lista do tipo jogador e criação dos elementos da lista            
		List<Jogador> pessoas =
			    Arrays.asList(
			        new Jogador("Neymar", "Brasil"),
			        new Jogador("Messi", "Argentina"),
			        new Jogador("Pelé", "Brasil"),
			        new Jogador("Cristiano Ronaldo", "Portugal"),
			        new Jogador("Ronaldinho", "Brasil"));
		
		
		List<Jogador> filtered = //filtrar elemento especifico da lista
			    pessoas
			        .stream()
			        .filter(p -> p.pais.equals("Brasil"))//busca de jogadores do Brasil
			        .collect(Collectors.toList());//adiciona na lista

			System.out.println(filtered);//imprime a busca
}
	
	
}

