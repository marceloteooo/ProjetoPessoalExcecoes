
public class Atv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Qual é a exceção que será lançada pelo programa abaixo?
		int numerator = 10;
		int denominator = 0;
		try {
			int result = numerator/denominator;
			System.out.println("Result: "+result);
		} catch (ArithmeticException e) {
			System.out.println("Impossível divisão por zero");
		}
	}

}
