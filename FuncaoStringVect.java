public class FuncaoStringVect {

	public static void main(String[] args) {
		
		String coisas = "Carro, Moto, Bicicleta, Skate.";
		String[] vect = coisas.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
	}

}