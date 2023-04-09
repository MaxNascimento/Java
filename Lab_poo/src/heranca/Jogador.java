package heranca;

public class Jogador {
	
	int x;
	int y;
	int vida = 100;
	
	boolean atacar(Jogador oponente) {
		int deltaY = Math.abs(y - oponente.y);
		int deltaX = Math.abs(x - oponente.x);
		
		if(deltaX == 0 && deltaY ==1) {
			oponente.vida -= 10;
			return true;
		}else if (deltaX == 1 && deltaY ==0) {
			oponente.vida -= 10;
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
	
	boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case SUL:
			y++;
			break;	
		case LESTE:
			x++;
			break;
		case OESTE:
			x--;
			break;	
			
			
		default:
			break;
		}
		
		return true;
	}




	void atacar() {
		
		
	}

}
