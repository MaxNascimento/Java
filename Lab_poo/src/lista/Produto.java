package lista;

public class Produto implements Comparable<Produto>  {
     String nome;


	public Produto(String nome) {
		this.nome = nome;
	}	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}




	@Override
	public int compareTo(Produto other) {
		int compareInt = this.nome.compareTo(other.nome);
		if (compareInt < 0) return - 1;
		if (compareInt > 0) return 1;
		return 0;
	}


	
     
	
	}

