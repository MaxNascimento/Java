package abstrato;

public class StreamerComissionado extends Streamer {

	public float vendas;
	public double percentual;
	
	public StreamerComissionado(String nome, float salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void CalcularProventos() {
		salario += CalcularComissao();
		
	}
	
	public double CalcularComissao() {
		double comissao = vendas + (vendas*percentual);
		return comissao;
	}
	
	
	}



