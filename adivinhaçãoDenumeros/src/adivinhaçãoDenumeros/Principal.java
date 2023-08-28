package adivinhaçãoDenumeros;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;
public class Principal { 

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	int sorteado, numero;
	
	sorteado = random.nextInt(200);
	System.out.println("Bem vindo ao jogo de adivinhação, o computador vai gerar um numero aleatorio de 0 até 200, tenta acertar, você tem 10 tentativas");
	
	for (int i = 0; i < 20; i++) {
		System.out.print("Tentativas numero "+ (i+1) +" Digite o numero que foi sorteado -> ");
		numero = sc.nextInt();
		System.out.println();
		
		if (numero == sorteado) {
			System.out.println("****ACERTOU******");
			break;
		}
		else if (numero > sorteado) System.out.println("um pouco menos <<<<<");
		else if (numero < sorteado) System.out.println("Um pouco mais >>>>>");
		
		if (i == 9) System.out.println("Maximo de tentativas feitas, o numeoro era o " + sorteado);	
	}	
	}
}