package br.edu.senai.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private String urlConexao = "jdbc:postgresql://localhost:5432/aula_jdbc";
	private String usuario = "postgres";
	private String senha = "88888";
	private Connection connection;

	public Connection getConecction() {
		try {
			System.out.println("Conectando ao banco de dados");
			connection = DriverManager.getConnection(urlConexao, usuario, senha);
			
			if(connection !=null) {
				System.out.println("Conectado com sucesso");
			}else {
				System.out.println("Não foi possível conectar!");
			}
			
		} catch (Exception e) {
			System.out.println("Erro! Driver não encontrado");
		}
		return connection;
	}
}
