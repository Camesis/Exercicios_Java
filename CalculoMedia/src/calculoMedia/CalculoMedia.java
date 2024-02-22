
package calculoMedia;

import java.util.Scanner;


public class CalculoMedia {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite o valor da nota 1: ");
		nota1 = input.nextDouble();
		
		System.out.println("Digite o valor da nota 2: ");
		nota2 = input.nextDouble();
		
		System.out.println("Digite o valor da nota 3: ");
		nota3 = input.nextDouble();
		
		System.out.println("Digite o valor da nota 4: ");
		nota4 = input.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Sua média é de: " + media);
		
		if(media >= 6) {
			System.out.println("Você passou de ano!");
			}else{
				System.out.println("Você reprovou!");
			};
	}

}
