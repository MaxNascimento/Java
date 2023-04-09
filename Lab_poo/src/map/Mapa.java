package map;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
	
		usuarios.put(1, "Lara");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Igor");
		usuarios.put(5, "Pedro");
		usuarios.put(6, "Larissa");
		
		System.out.println(usuarios.size());
	}

}
