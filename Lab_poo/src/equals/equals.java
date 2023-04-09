package equals;

public class equals {

	public static void main(String[] args) {
		 
		usuario u1 = new usuario();
		u1.nome = "jao siva";
		u1.email = "jaosilva@gmail.com";
		
		usuario u2 = new usuario();
		u2.nome = "jao siva";
		u2.email = "jaosilva@gmail.com";

		System.out.println(u1.equals(u2));	}

}
