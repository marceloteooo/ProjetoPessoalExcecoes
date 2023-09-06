
public class Atv4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 4. Que tipo de exceção ocorrerá no trecho de código abaixo?
			Object obj = new Integer(42);
			try {
			String str = (String) obj;
			System.out.println("String value: " + str);
			} catch (ClassCastException e) {
				System.out.println("Conversação de classes inválida");
			}
	}

}
