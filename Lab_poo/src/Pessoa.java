//criação da classe jogador com os atributos
class Jogador { 
    String nome;
    String pais;

//constutor da classe
    Jogador(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }
//retorno toString
    @Override
    public String toString() {
        return nome;
    }
}

