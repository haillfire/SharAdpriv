import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class comentsDAO {

	private Connection conn;
	
	public comentsDAO() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/bdadx", "root", "");
        } catch (SQLException e) {
            System.out.println("Erro na conexao com o Banco de Dados");
        }
    }
	
	public List<coments> obterTodosComents() {
        String sql = "SELECT * FROM tb_coments";
        List<coments> listacoments = new ArrayList<coments>();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
            	coments o = new coments(result.getInt("id_coment"), result.getInt("id_usuario"), result.getString("texto"));
            	coments.add(o);
            }
        } catch (SQLException erro) {
            System.out.println("Erro de conexao com o banco!");
        }
        return listacoments;
    }
	
	public void adicionaComents(coments p) {
        String sql = "INSERT INTO tb_coments(id_coment, id_usuario, texto) VALUES(?, ?, ?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, p.getId_coment());
            stmt.setInt(2, p.getId_usuario());
            stmt.setString(3, p.getTexto());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erro de conexao com o banco!");
        }

    }
	
	 public coments consultaComents(int id) {
	        String sql = "SELECT id_coment, id_usuario, texto FROM tb_coments WHERE id = ?";
	        coments u = null;
	        try {
	            PreparedStatement stmt = conn.prepareStatement(sql);
	            stmt.setInt(1, id);
	            ResultSet result = stmt.executeQuery();
	            u = new coments(result.getInt(1), result.getInt(2), result.getString(3));
	            stmt.close();
	        } catch (SQLException erro) {
	            System.out.println("Erro de conexao com o banco!");
	        }
	        return u;
	    }
	 
	 public void removeComents(int id){
	        String sql = "DELETE from tb_coments WHERE id = ?";
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
