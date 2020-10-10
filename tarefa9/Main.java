package br.com.tarefa9;

import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) {

		Questao1 q1 = new Questao1();

		LocalDate dia = LocalDate.of(2002, 4, 27);

		System.out.println(q1.idade(dia));

		Questao2 q2 = new Questao2();

		LocalDate data = LocalDate.of(1997, 9, 30);
		System.out.println(q2.fase(data));

		Questao3 q3 = new Questao3();

		System.out.println(q3.IMC(1.83, 75.0));

		Questao4 q4 = new Questao4();
		System.out.println(q4.classificacao(q3.IMC(1.83, 75.0)));

		Questao5 q5 = new Questao5();
		q5.primos(13);

		Questao6 q6 = new Questao6();
		String nome = "Carlos Drummond de Andrade";
		q6.abrevicao(nome);

	}

}
