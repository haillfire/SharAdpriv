import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class funcionarioDAO {

	private Connection conn;
	
	public funcionarioDAO() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/bdadx", "root", "");
        } catch (SQLException e) {
            System.out.println("Erro na conexao com o Banco de Dados");
        }
    }
	
	public List<funcionario> obterTodosFunc() {
        String sql = "SELECT * FROM tb_funcionario";
        List<funcionario> listafuncionario = new ArrayList<funcionario>();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
            	funcionario o = new funcionario(result.getInt ("id"), result.getString("nome"), result.getInt("ranking"));
                listafuncionario.add(o);
            }
        } catch (SQLException erro) {
            System.out.println("Erro de conexao com o banco!");
        }
        return listafuncionario;
    }
	
	public void adicionaFunc(funcionario p) {
        String sql = "INSERT INTO tb_funcionario(id, nome, ranking) VALUES(?, ?, ?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, p.getId());
            stmt.setString(2, p.getNome());
            stmt.setInt(3, p.getRanking());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erro de conexao com o banco!");
        }

    }
	
	 public funcionario consultafuncionario(int id) {
	        String sql = "SELECT id, nome, ranking FROM tb_funcionario WHERE id = ?";
	        funcionario u = null;
	        try {
	            PreparedStatement stmt = conn.prepareStatement(sql);
	            stmt.setInt(1, id);
	            ResultSet result = stmt.executeQuery();
	            u = new funcionario(result.getInt(1), result.getString(2), result.getInt(3));
	            stmt.close();
	        } catch (SQLException erro) {
	            System.out.println("Erro de conexao com o banco!");
	        }
	        return u;
	    }
	 
	 public void removefuncionario(int id){
	        String sql = "DELETE from tb_funcionario WHERE id = ?";
	        try {
	            PreparedStatement stmt = conn.prepareStatement(sql);
	            stmt.setInt(1, id);
	            stmt.execute();
	            stmt.close();
	        } catch(SQLException e){
	            System.out.println("Erro de conexao com o Banco de Dados");
	        }
	    }

}
