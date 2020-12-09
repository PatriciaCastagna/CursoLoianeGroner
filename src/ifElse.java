import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Qual sua idade: ");
		
		int idade = scan.nextInt();
		if (idade >= 18) {
			System.out.println("é maior de idade");
		}   else {
			System.out.println("não é maior de idade");
			
		}
		
		// barato <= 10
		// 10 < valor < 15 - pedir desconto 
		// 15 <= valor 17 - pesquisar mais
		// 17 <= muito caro
		
		
		System.out.println("Entre com o preço do item:");
		double valor = scan.nextDouble();
		if (valor <= 10) {
			System.out.println("está barato, pode comprar.");
		} else if (valor > 10 && valor < 15 ) {
			System.out.println("peça desconto...");
		}else if(valor >=15 && valor <17 ){
			System.out.println("Pesquisar mais!");
			
		}else {// 17 <= muito caro
			System.out.println("muito caro");
		}
		
		
		

	}

}


