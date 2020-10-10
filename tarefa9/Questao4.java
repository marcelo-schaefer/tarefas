package br.com.tarefa9;

public class Questao4 extends Questao3{
	
	public String classificacao(Double imc) {
		String nivel = "";
		if (imc <= 18) {
			nivel = "magreza";
		}
		if (imc > 18 && imc <= 24.9) {
			nivel = "normal";
		}
		if (imc > 24.9 && imc <= 29.9) {
			nivel = "sobrepeso";
		}
		if (imc > 29.9 && imc <= 39.9) {
			nivel = "obesidade";
		}
		if (imc > 39.9) {
			nivel = "obesidade grave";
		}
		return nivel;
	}

}
