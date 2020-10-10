package br.com.tarefa9;

public class Questao5 {

	private Integer numero;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public void primos(Integer numero) {
		if ((numero % 2) != 0 && (numero % 3) != 0) {
			System.out.println("e um numero primo");
		}
		if (numero == 2 || numero == 3) {
			System.out.println("e um numero primo");
		}
		if ((numero % 2) == 0 || (numero % 3) == 0) {
			System.out.println("nao e um numero primo");
		}
	}

}
