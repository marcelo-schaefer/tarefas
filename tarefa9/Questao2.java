package br.com.tarefa9;

import java.time.LocalDate;

public class Questao2 {

	private LocalDate data;

	public LocalDate getData() {
		return getData();
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public static String fase(LocalDate data) {
		String faseDaVida = "";
		LocalDate agora = LocalDate.now();
		Questao2 q = new Questao2();
		Integer idade = agora.compareTo(data);

		if (q.crianca(idade)) {
			faseDaVida = "e uma crianca";
		}
		if (q.adolecente(idade)) {
			faseDaVida = "e um adolecente";
		}
		if (q.adulto(idade)) {
			faseDaVida = "e um adulto";
		}
		if (q.idoso(idade)) {
			faseDaVida = "e um idoso";
		}

		return faseDaVida;
	}

	private static boolean crianca(Integer idade) {
		boolean correto = false;
		if (idade <= 12) {
			correto = true;
		}
		return correto;

	}

	private static boolean adolecente(Integer idade) {
		boolean correto = false;

		if (idade > 12 && idade <= 18) {
			correto = true;
		}
		return correto;
	}

	private static boolean adulto(Integer idade) {
		boolean correto = false;

		if (idade > 18 && idade <= 60) {
			correto = true;
		}
		return correto;
	}

	private static boolean idoso(Integer idade) {
		boolean correto = false;

		if (idade > 60) {
			correto = true;
		}
		return correto;
	}

}
