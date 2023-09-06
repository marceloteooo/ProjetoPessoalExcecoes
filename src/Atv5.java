
public class Atv5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5. Qual exceção será lançada durante a execução do código a seguir?
		
		String text = null;
		try {
		int length = text.length();
		System.out.println("Length of text: " + length);
		} catch (NullPointerException e) {
			System.out.println("O objeto é nulo");
		}
	} 

}
