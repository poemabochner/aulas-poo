package br.edu.senai.teste;

import br.edu.senai.model.Cliente;
import br.edu.senai.persistence.ClienteDao;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(4, "Roberta da Silva", "837432482", "ro@gmail.com");
		ClienteDao clienteDao = new ClienteDao();
		
		//clienteDao.inserirCliente(cliente);
		//clienteDao.atualizarCliente(cliente);
		//clienteDao.removerCliente(cliente);
		
		//System.out.println(clienteDao.listarClientes());
//		for (Cliente c : clienteDao.listarClientes()) {
//		System.out.println(c);
		//CRUD(CREATE RETRIEVE UPDATE DELETE)	
		
			System.out.println(clienteDao.listarClientes("dri"));
		}
	}

