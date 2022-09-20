package br.edu.senai.conexao;

import java.sql.Connection;

public class TesteConexao {

	public static void main(String[] args) {
		
		Connection connection = new ConnectionFactory().getConecction();
		
	}

}
