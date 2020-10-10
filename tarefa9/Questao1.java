package br.com.tarefa9;

import java.time.LocalDate;

public class Questao1 {

	private LocalDate data;

	public LocalDate getData() {
		return getData();
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public static Integer idade(LocalDate data) {

		LocalDate agora = LocalDate.now();
		Integer idade = 0;

		idade = agora.compareTo(data);

		return idade;
	}
}
