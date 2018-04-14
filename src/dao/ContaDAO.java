package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Cliente;
import model.Conta;

public class ContaDAO {
	//atributo
	private Connection conexao;
	
	public ContaDAO (Connection conexao) {
		this.conexao = conexao;
	}
	
	//metodo que verifica se o cliente existe com cpf e senha corretos
	
	/*public boolean isCliente(String idConta, String idCliente) {
		
		//Instanciar os objetos
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean resultado = false;
		
		
		//Verificar se o cliente existe no BD
		try {
			//Preparar o SQL
			ps = conexao.prepareStatement("SELECT idcliente FROM cliente WHERE cpfcliente = ? AND senhacliente = ?");
			//Setar os parametros do SQL
			ps.setString(1, idConta);
			ps.setString(2, idCliente);
			
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
	*/
	//metodo que retorna um cliente
	public ArrayList<Conta> getConta(int idCliente) {
		
		String query = "SELECT idconta, idcliente, numeroconta, agenciaconta, tipoconta FROM conta WHERE idcliente = ?";
		ArrayList<Conta> resultado = new ArrayList<>();
		
				PreparedStatement ps= null;
				ResultSet rs = null;

				try {

					ps = conexao.prepareStatement(query);

					ps.setInt(1, idCliente);

					rs = ps.executeQuery();

					while(rs.next()) {
					resultado.add (new Conta(rs.getInt("idconta"), rs.getInt("idcliente"), rs.getString("numeroconta"), rs.getString("agenciaconta"), rs.getString("tipoconta")));
					}
					rs.close();
					ps.close();
					
				}catch(SQLException e){
					e.printStackTrace();
				}
				
				return resultado;
		
	

}
}
