package com.mtheus.vetores.teste;

import com.mtheus.vetores.Vetor;

public class Aula6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Vetor vetor  = new Vetor(5);// instacia um vetor com 5 elementos 



		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		vetor.adiciona("elemento 4");
		vetor.adiciona("elemento 5");
	
		
		System.out.println(vetor.busca("elemento 2"));
		System.out.println(vetor.busca("elemento 8"));

	}

}
