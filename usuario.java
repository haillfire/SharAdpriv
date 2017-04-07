import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;

public class usuario {
	String area;
	String email;
	int id;
	String nome;
	String pass;
	int telefone;
	
	//CONECTANDO AO BD
	public void Abrirb() throws SQLException, ClassNotFoundException{
	Driver meuDriver = new com.mysql.jdbc.Driver();
	DriverManager.registerDriver(meuDriver);
	String usuario = "root";
	String senha = "";
	String url = "jdbc:mysql://localhost/bdadx";
	try{
		System.out.println("Abrindo conexão com o banco de dados");
		Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
		System.out.println("Conectado");
		conn.close();
	} catch(SQLException erro){
		System.out.println("Erro de conexão com o banco2");
			
		}
}
	//CONECTADO
	
	public String getArea() {
		Statement stmt = (Statement) conn.createStatement();
		String sql = "SELECT nome, cnpj, telefone FROM tb_empresa";
		ResultSet resultado = stmt.executeQuery(sql);
		while(resultado.next()){
			String nome = resultado.getString("nome");
			String cnpj = resultado.getString("cnpj");
			int telefone = resultado.getInt("telefone");
			System.out.println("Nome:"+nome+", CNPJ:"+cnpj+", Telefone:"+telefone);
		}
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
}
