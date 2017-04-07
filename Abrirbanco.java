
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;

public class Abrirbanco {
    
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
        Driver meuDriver = new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(meuDriver);
 
		String usuario = "root";
		String senha = "";
		String url = "jdbc:mysql://localhost/bdadx";
		try{
			System.out.println("Abrindo conexão com o banco de dados");
			Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conectado");
			try{
				Statement stmt = (Statement) conn.createStatement();
				String sql = "SELECT nome, cnpj, telefone FROM tb_empresa";
				ResultSet resultado = stmt.executeQuery(sql);
				while(resultado.next()){
					String nome = resultado.getString("nome");
					String cnpj = resultado.getString("cnpj");
					int telefone = resultado.getInt("telefone");
					System.out.println("Nome:"+nome+", CNPJ:"+cnpj+", Telefone:"+telefone);
				}
			} catch(SQLException erro){
				System.out.println("Erro de consulta com o banco");
			}
			
			conn.close();
		} catch(SQLException erro){
			System.out.println("Erro de conexão com o banco2");
				
			}
    }
}
