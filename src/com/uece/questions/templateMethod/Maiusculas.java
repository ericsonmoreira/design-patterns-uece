package com.uece.questions.templateMethod;

public class Maiusculas extends ImprimiNaTelaTemplate {

	@Override
	protected String tratarString(String string) {
		return string.toUpperCase();
	}

	@Override
	protected void printarNaTela(String string) {
		System.out.println(string);
	}
}