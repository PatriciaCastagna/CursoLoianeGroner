import java.util.Scanner;

public class ExerOito {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Qual valor reais/hora que ganhas?: ");
		double reaisHora = scan.nextDouble();
		
		System.out.println("Quantas horas trabalhaste no m�s?: ");
		double horas = scan.nextDouble();
		
		double salario = reaisHora * horas;
		System.out.println("O seu sal�rio �: " + salario);
		
		
		
		
		

	}

}
