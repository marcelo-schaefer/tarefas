package br.com.tarefa9;

public class Questao6 {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void abrevicao(String nome) {
		nome.trim();
		String[] array = nome.split(" ");

		for (int i = 0; i < array.length; i++) {
			if (array[i].length() > 3) {
				System.out.print(array[i].substring(0, 1) + ".");
			} else {
				System.out.print(array[i] + " ");
			}
		}

	}
}
