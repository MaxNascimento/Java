package abstrato;

public class StreamerProdutividade extends Streamer{
	
	public int producao;
	public float valor;

	public StreamerProdutividade(String nome, float salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void CalcularProventos() {
		salario+= producao*valor;
	}

}
