import java.util.Scanner;

public class ExerTres {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com o primeiro numero: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Entre com o segundo numero: ");
		int numero2 = scan.nextInt();
		
		int resultado = numero1 + numero2;
		System.out.println("A soma dos dois números é: " + resultado);
		
		

	}

}
