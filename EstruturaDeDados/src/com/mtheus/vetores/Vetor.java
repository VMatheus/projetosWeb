package com.mtheus.vetores;

import java.util.Arrays;

import org.omg.PortableServer.ThreadPolicyOperations;

public class Vetor {
	private String[] elementos ; 
	private int tamanho ;


	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;



	}
	/*public void adiciona(String elemento) {
		for (int i=0; i< this.elementos.length; i++) {
			// for para literação, buscando campos null para adiçao de elementos 
			if (this.elementos[i]== null) {
				this.elementos[i] = elemento;
				break;

			}

		}



	}*/

	/*public void adiciona(String elemento) throws Exception {

		//verificação de tamanho 
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;

		}else {
			throw new Exception("Vetor já esta cheio, não é possivel adicionar mais itens!");
		}


	}*/
	public boolean adiciona(String elemento) {

		//verificação de tamanho 
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;

			return true;

		}
		return false;




	}

	//retorna o tamanho do vetor
	public int tamanho() {
		return this.tamanho;

	}
	//imprime itens contidos no vetor 
	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");


		for (int i=0; i<this.tamanho-1 ; i++) {
			s.append(this.elementos[i]);
			s.append(",");

		}
		if (this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);

		}
		s.append("]");
		return Arrays.toString(elementos);
	}


	//busca por posicao

	public String busca(int posicao) {
		if(!(posicao >=0 && posicao <this.tamanho)) {
			throw new IllegalArgumentException("Posicao Invalida");
		}
		return this.elementos[posicao];


	}
	//verificar se o elemento ja existe no vetor 
	public int busca(String elemento) {
		//busca sequencial
		for (int i=0 ; i< this.tamanho; i ++) {
			if (this.elementos[i].equals(elemento)) {//equalsIgnoreCase , ignora letras maiusculas
				return i;
			}
		}
		return -1;

	}

	// 0 1 2 3 4 5 6 =tamano 5
	// B C E F G + +
	//Adicionar elemento em qualquer posição
	public boolean adiciona( int posicao, String elemento) {
		//verificar posicao valida
		if(!(posicao >=0 && posicao <this.tamanho)) {
			throw new IllegalArgumentException("Posicao Invalida");
		}
		//mover todos os elementos 
		for (int i =this.tamanho-1 ; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];

		}
		this.elementos[posicao] = elemento;
		this.tamanho ++;
		return true;







	
	}



}

