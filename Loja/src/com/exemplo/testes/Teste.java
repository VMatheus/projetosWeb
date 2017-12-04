package com.exemplo.testes;

import java.util.List;

import com.exemplo.entidade.Cliente;
import com.exemplo.repositorio.RepositorioCliente;

public class Teste {

	public static void main(String[] args) {


		RepositorioCliente repositorioCliente = new RepositorioCliente();




		
		/*listar(repositorioCliente);*/
	/*	atualizar(repositorioCliente, 1);*/
	/*	novoCliente(repositorioCliente);*/
		remover(repositorioCliente, 3);


	}


	private static void novoCliente(RepositorioCliente repositorioCliente) {
		Cliente cliente = new Cliente();
		cliente.setNome("Juana");
		cliente.setIdade(12);

		repositorioCliente.salvar(cliente);



	}
	private static void listar(RepositorioCliente repositorioCliente) {

		List<Cliente> clientes = repositorioCliente.listarTodos();


		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());

		}
	}
	
	private static void atualizar(RepositorioCliente repositorioCliente, Integer id ) {
		
		Cliente cliente = repositorioCliente.obterPorId(id);
		cliente.setNome("JJJackson");
		
		repositorioCliente.salvar(cliente);
		
		
		System.out.println(cliente.getNome());
	}
	
	private static void remover(RepositorioCliente repositorioCliente, Integer id) {
		Cliente cliente = repositorioCliente.obterPorId(id);
		repositorioCliente.remover(cliente);
		listar(repositorioCliente);
		
		
	}
	
	
	
	

}
