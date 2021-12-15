package com.uece.questions.templateMethod;

public class Duplica extends ImprimiNaTelaTemplate {

	@Override
	protected String tratarString(String string) {
		return string.repeat(2);
	}

	@Override
	protected void printarNaTela(String string) {
		System.out.println(string);
	}
}