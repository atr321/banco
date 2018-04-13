package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	//Metodo para retornar uma conexao ao BD
	public static Connection getConexao() {
		
		//criando objeto de conexao
		Connection conexao = null;
		
		//Conectar no banco de dados
		
				try {
					//referenciar o driver JDBC
					Class.forName("com.mysql.jdbc.Driver");
					
					//Criar String de conexao
					String url = "jdbc:mysql://localhost/banco";
					String username = "root";
					String password = "root";
					
					//Realizar conexao com o BD
					conexao = DriverManager.getConnection(url, username, password);
					
					
				} catch (ClassNotFoundException | SQLException e) {
					//mostrar o erro
					e.printStackTrace();
				}
					return conexao;
	}
				

}
