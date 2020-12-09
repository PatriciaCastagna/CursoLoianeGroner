import java.util.Scanner;

public class ExerQuatro {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com suas quatro notas: ");
		
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		double nota4 = scan.nextDouble();
		
		System.out.println("Você digitou as seguintes notas: ");
		
		System.out.println("nota1: " + nota1);
		System.out.println("nota2: " + nota2);
		System.out.println("nota3: " + nota3);
		System.out.println("nota4: " + nota4);
		
		double media= (nota1 + nota2 + nota3 + nota4) / 4 ;
		System.out.println("A sua média é:" + media);
		
		
	}

}
