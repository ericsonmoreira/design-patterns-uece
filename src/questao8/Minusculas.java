package questao8;

public class Minusculas extends ImprimiNaTelaTemplate{

	@Override
	protected String tratarString(String string) {
		return string.toLowerCase();
	}

	@Override
	protected void printarNaTela(String string) {
		System.out.println(string);
	}
}