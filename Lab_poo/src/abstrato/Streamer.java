package abstrato;

public abstract class Streamer {
	
	public String nome;
	public float salario;
	
	public Streamer(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
		
	}
	
	public abstract void CalcularProventos();

}
