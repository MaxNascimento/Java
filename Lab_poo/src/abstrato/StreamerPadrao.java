package abstrato;

public class StreamerPadrao extends Streamer {
	
	public float view;

	public StreamerPadrao(String nome, float salario) {
		super(nome, salario);
		
	}

	@Override
	public void CalcularProventos() {
		salario+=view;
		
	}


		
	}
	

