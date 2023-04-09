package heranca;

public class Monstro extends Jogador{
	
	@Override
	boolean atacar(Jogador oponente) {
		int deltaY = Math.abs(y - oponente.y);
		int deltaX = Math.abs(x - oponente.x);
		
		if(deltaX == 0 && deltaY ==1) {
			oponente.vida -= 15;
			return true;
		}else if (deltaX == 1 && deltaY ==0) {
			oponente.vida -= 15;
			return true;
		}else {
			return false;
		}
	}

	
		
		
	}