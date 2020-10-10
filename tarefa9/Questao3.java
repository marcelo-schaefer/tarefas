package br.com.tarefa9;

public class Questao3 {

	private Double altura;
	private Double peso;

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double IMC(Double altura, Double peso) {
		Double imc = altura * altura;
		imc = peso / imc;
		return imc;
	}


}
