package com.uece.questions.templateMethod;

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