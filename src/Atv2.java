
public class Atv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2. Qual é o tipo de exceção que ocorrerá no código abaixo?
		
		String input = "abc";
		
		try {
		int number = Integer.parseInt(input);
		System.out.println("Number: " + number);
		} catch(NumberFormatException e) {
			System.out.println("Erro de conversão String para Int");
		}
	}

}
