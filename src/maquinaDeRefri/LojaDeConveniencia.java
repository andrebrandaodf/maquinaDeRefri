package maquinaDeRefri;

import java.util.Scanner;

public class LojaDeConveniencia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		MaquinaRefrigerante m = new MaquinaRefrigerante();
		int opcao, res;
		float valor;
		
		do {
			System.out.println(m.mostraInfo());
			System.out.println("Digite 99 para inserir crédito, ");
			System.out.println("Digite -1 para sair ");
			System.out.println("Ou digite o número do refrigerante para comprar de (0-4)");
			
			opcao = teclado.nextInt();
		switch(opcao) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			res = m.comprar(opcao);
			if(res == 0) {
				System.out.println("Apreciar! ");
				}
			else if(res == -1) {
				System.out.println("Saldo insufuciente. Insira mais $$");
			}
			else {
				System.out.println("Desculpe. Refrigerante em falta. Volte mais tarde.");
			}
		case 99:
				System.out.println("Digite o valor R$ :");
				valor = teclado.nextFloat();
				m.inserirCredito(valor);
				break;
		case -1:
				System.out.println("Obrigado por utilizar a máquina.");
				System.out.println("Receba seu troco "+m.solicitarTroco());
				break;
		default:
				System.out.println("Opção inválida");
				break;
		}
		
		
	} while(opcao != -1);

		teclado.close();
	}
}
