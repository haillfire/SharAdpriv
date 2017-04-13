import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class grupoDAO {

	private Connection conn;
	
	public grupoDAO() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/bdadx", "root", "");
        } catch (SQLException e) {
            System.out.println("Erro na conexao com o Banco de Dados");
        }
    }
	
	public List<grupo> obterTodosGrupos() {
        String sql = "SELECT * FROM tb_grupo";
        List<grupo> listagrupo = new ArrayList<grupo>();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
            	grupo o = new grupo(result.getInt ("id"), result.getString("nome"));
                listagrupo.add(o);
            }
        } catch (SQLException erro) {
            System.out.println("Erro de conexao com o banco!");
        }
        return listagrupo;
    }
	
	public void adicionaGrupo(grupo p) {
        String sql = "INSERT INTO tb_grupo(id, nome) VALUES(?, ?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, p.getId());
            stmt.setString(2, p.getNome());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erro de conexao com o banco!");
        }

    }
	
	public grupo consultaGrupo(int id) {
        String sql = "SELECT id, nome FROM tb_grupo WHERE id = ?";
        grupo u = null;
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            u = new grupo(result.getInt(1), result.getString(2));
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro de conexao com o banco!");
        }
        return u;
    }
	
	 public void removeGrupo(int id){
	        String sql = "DELETE from tb_grupo WHERE id = ?";
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
