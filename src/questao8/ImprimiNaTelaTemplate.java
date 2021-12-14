package questao8;

import java.util.Scanner;

public abstract class ImprimiNaTelaTemplate {
	public ImprimiNaTelaTemplate() {
		System.out.println("digitte a frase a ser tratada");
		String string = new Scanner(System.in).next();
		printarNaTela(tratarString(string));
	}
	


protected abstract String tratarString (String string);
protected abstract void printarNaTela(String string);



}


//Exercite o padr�o Template Method criando uma classe abstrata que l�
//uma String do console,transforma-a e imprime-a transformada. 