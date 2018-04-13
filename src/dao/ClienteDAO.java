package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Cliente;

public class ClienteDAO {
	//atributo
	private Connection conexao;
	
	//Metodo construtor
	public ClienteDAO(Connection conexao) {
		this.conexao = conexao;
	}
	
	//metodo que verifica se o cliente existe com cpf e senha corretos
	
	public boolean isCliente(String cpfCliente, String senhaCliente) {
		
		//Instanciar os objetos
		PreparedStatement ps;
		ResultSet rs;
		boolean resultado = false;
		
		
		//Verificar se o cliente existe no BD
		try {
			//Preparar o SQL
			ps = conexao.prepareStatement("SELECT idcliente FROM cliente WHERE cpfcliente = ? AND senhacliente = ?");
			//Setar os parametros do SQL
			ps.setString(1, cpfCliente);
			ps.setString(2, senhaCliente);
			
			//Executar o SQL
			rs = ps.executeQuery();
			
			//Verificar se o rs retornou resultado
			resultado = rs.first();
			
			//fechando rs e ps
			rs.close();
			ps.close();
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return resultado;
		
	}
	//metodo que retorna um cliente
	public Cliente getCliente(String cpfCliente, String senhaCliente) {
		
		//Instanciar os objetos
				PreparedStatement ps= null;
				ResultSet rs = null;
				Cliente resultado = null;
				
				
				//retornar o cliente do BD
				try {
					//Preparar o SQL
					ps = conexao.prepareStatement("SELECT idcliente, cpfcliente, nomecliente, senhacliente FROM cliente WHERE cpfcliente = ? AND senhacliente = ?");
					//Setar os parametros do SQL
					ps.setString(1, cpfCliente);
					ps.setString(2, senhaCliente);
					
					//Executar o SQL
					rs = ps.executeQuery();
					
					//criar um cliente com base no rs
					rs.first();
					
					resultado = new Cliente(rs.getInt("idcliente"), rs.getString("cpfcliente"), rs.getString("nomecliente"), rs.getString("senhacliente"));
					
					rs.close();
					ps.close();
					
				}catch(SQLException e){
					e.printStackTrace();
				}
				
				return resultado;
		
	}

}
