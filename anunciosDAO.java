import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class anunciosDAO {

private Connection conn;
	
	public anunciosDAO() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/bdadx", "root", "");
        } catch (SQLException e) {
            System.out.println("Erro na conexao com o Banco de Dados");
        }
    }
	
	public List<anuncios> obterTodosAnuncios() {
        String sql = "SELECT * FROM tb_anuncios";
        List<anuncios> listaanuncios = new ArrayList<anuncios>();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
            	anuncios o = new anuncios(result.getInt ("id"), result.getString("data"), result.getString("anunciante"), result.getString("area"));
                listaanuncios.add(o);
            }
        } catch (SQLException erro) {
            System.out.println("Erro de conexao com o banco!");
        }
        return listaanuncios;
    }
	
	public void adicionaAnuncios(anuncios p) {
        String sql = "INSERT INTO tb_anuncios(id, data, anunciante, area) VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, p.getId());
            stmt.setString(2, p.getData());
            stmt.setString(3, p.getAnunciante());
            stmt.setString(4, p.getArea());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erro de conexao com o banco!");
        }

    }
	
	 public anuncios consultaAnuncios(int id) {
	        String sql = "SELECT id, data, anunciante, area FROM tb_anuncios WHERE id = ?";
	        anuncios u = null;
	        try {
	            PreparedStatement stmt = conn.prepareStatement(sql);
	            stmt.setInt(1, id);
	            ResultSet result = stmt.executeQuery();
	            u = new anuncios(result.getInt(1), result.getString(2), result.getString(3), result.getString(4));
	            stmt.close();
	        } catch (SQLException erro) {
	            System.out.println("Erro de conexao com o banco!");
	        }
	        return u;
	    }
	 
	 public void removeAnuncios(int id){
	        String sql = "DELETE from tb_anuncios WHERE id = ?";
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
