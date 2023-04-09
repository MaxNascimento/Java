package abstrato;

public class teste {

	public static void main(String[] args) {
		
		System.out.println("-------Streamer Padrao------------");
		StreamerPadrao s1 = new StreamerPadrao("Gaules", 10000f);
		s1.view = 27000;
		s1.CalcularProventos();
		System.out.println("O Stremer " + s1.nome + " ganhou U$"+s1.salario);
		
		System.out.println("\n-------Streamer Comissionado-------");
		StreamerComissionado s2 = new StreamerComissionado("Alanzoka", 10000f);
		s2.vendas = 20000;
		s2.percentual = 0.03;
		s2.CalcularProventos();
		System.out.println("O Stremer " + s2.nome + " ganhou U$"+s2.salario);
		
		System.out.println("\n-------Streamer Produtividade-------");
		StreamerProdutividade s3 = new StreamerProdutividade("Edu", 10000f);
		s3.producao = 45;
		s3.valor = 400;
		s3.CalcularProventos();
		System.out.println("O Stremer " + s3.nome + " ganhou U$"+s3.salario);


	}

}
