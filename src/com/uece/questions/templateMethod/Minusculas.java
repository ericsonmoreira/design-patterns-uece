package com.uece.questions.templateMethod;

public class Minusculas extends ImprimiNaTelaTemplate {

	@Override
	protected String tratarString(String string) {
		return string.toLowerCase();
	}

	@Override
	protected void printarNaTela(String string) {
		System.out.println(string);
	}
}