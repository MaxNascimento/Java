package heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador j1 = new Heroi();
		
		j1.x = 10;
		j1.y = 15;
		
		j1.andar(Direcao.SUL);
		j1.andar(Direcao.SUL);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.NORTE);
		
		
		Jogador j2 = new Monstro();
		
		j2.x = 12;
		j2.y = 17;
		
		System.out.println("Vida do Inimigo: "  + j2.vida + " || Vida do Heroi: "  + j1.vida);
		j1.atacar(j2);
		System.out.println("Ataque espada!!!");
		System.out.println("Vida do Inimigo: "  + j2.vida + " || Vida do heroi: "  + j1.vida);
		j2.atacar(j1);
		System.out.println("Ataque do Monstro!!!");
		System.out.println("Vida do Inimigo: "  + j2.vida + " || Vida do heroi: "  + j1.vida);
		j1.atacar(j2);
		System.out.println("Ataque Espada!!!");
		System.out.println("Vida do Inimigo: "  + j2.vida + " || Vida do heroi: "  + j1.vida);
		j2.atacar(j1);
		System.out.println("Ataque do Monstro!!!");
		System.out.println("Vida do Inimigo: "  + j2.vida + " || Vida do heroi: "  + j1.vida);
		j1.atacar(j2);
		System.out.println("Ataque espada!!!");
		System.out.println("Vida do Inimigo: "  + j2.vida + " || Vida do heroi: "  + j1.vida);
		
		if (j2.vida<=0) {
			System.out.println("O Herói venceu o combate!");
		}else {
			System.out.println("O Inimigo venceu o combate!");
		}
		
	}

}
