
public class Atv3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3. Qual será o resultado da execução do código abaixo?
		
			int[] numbers = { 1, 2, 3 };
			try {
			System.out.println("Number at index 3: " + numbers[3]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Índice inválido para o array");
			}
	}

}
