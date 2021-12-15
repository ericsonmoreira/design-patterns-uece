package com.uece.questions.templateMethod;

public class Inverte extends ImprimiNaTelaTemplate {

	@Override
	protected String tratarString(String string) {
		return new StringBuilder(string).reverse().toString();
	}

	@Override
	protected void printarNaTela(String string) {
		System.out.println(string);
	}
}