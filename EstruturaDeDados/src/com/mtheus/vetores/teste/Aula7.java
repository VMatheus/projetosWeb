package com.mtheus.vetores.teste;

import com.mtheus.vetores.Vetor;

public class Aula7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vetor vetor = new Vetor(10);
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");

		System.out.println(vetor);
		vetor.adiciona(0, "A");

		System.out.println(vetor);
		
		vetor.adiciona(3, "D");
		System.out.println(vetor);
	}

}
