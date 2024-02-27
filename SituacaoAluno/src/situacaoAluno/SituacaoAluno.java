package situacaoAluno;
import java.util.*;

public class SituacaoAluno {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String matricula, nome, situacao, turma;
		double atividade, prova, media;
	
		System.out.println("Digite a turma: ");
		turma = teclado.next();
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Digite a matricula: ");
			matricula = teclado.next();
			
			System.out.println("Digite o nome: ");
			nome = teclado.next();
			
			System.out.println("Digite a nota da atividade: ");
			atividade = teclado.nextDouble();
			
			System.out.println("Digite a nota da prova: ");
			prova = teclado.nextDouble();
			
			media = (atividade + prova) / 2;
			
			System.out.println("Matricula: " + matricula);
			System.out.println("Aluno: " + nome + " possui a média de: " + media);
	}
		
	}
}
