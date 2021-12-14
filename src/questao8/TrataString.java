package questao8;

import java.util.Scanner;

public class TrataString {
	String tipo;
	ImprimiNaTelaTemplate imprimiNaTelaTemplate;
	
	public TrataString() {
		System.out.println("escolha 1 p maiusculas");
		System.out.println("escolha 2 p minusculas");
		System.out.println("escolha 3 p duplicar");
		System.out.println("escolha 4 p inverter");
		
		Scanner scanner = new Scanner(System.in);
		int caso = scanner.nextInt();
		setTipo(caso);
	}
	
	public void setTipo (int caso) {
		switch (caso) {
		case 1 :
			imprimiNaTelaTemplate = new Maiusculas();
		break;
		case 2 : 
			imprimiNaTelaTemplate = new Minusculas();
		break;
		case 3 : 
			imprimiNaTelaTemplate = new Duplica();
		break;
		case 4 : 
			imprimiNaTelaTemplate = new Inverte();
		break;
		default:
			System.out.println("opção invalida");
		}
	}
	

}

//8. Template Method: Exercite o padrão Template Method criando uma classe abstrata que lê
//uma String do console,transforma-a e imprime-a transformada. 
//A transformação é delegada às subclasses. Implemente quatro subclasses, 
//uma que transforme a string toda para maiúsculo
//outra que transforme em tudo minúsculo
//uma que duplique a string 
//e a última que inverta a string.