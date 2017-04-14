import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class adminDAO {

    private Connection conn;

    public adminDAO() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/projeto", "root", "");
        } catch (SQLException e) {
            System.out.println("Erro na conexÃ£o com o Banco de Dados");
        }
    }

    public List<admin> obterTodosAdmin() {
        String sql = "SELECT * FROM tb_admin";
        List<usuario> listaadmin = new ArrayList<admin>();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                admin oo = new admin(result.getInt("id"), result.getString("permissoesgerais"));
                listaadmin.add(oo);
            }
        } catch (SQLException erro) {
            System.out.println("Erro de conexÃ£o com o banco!");
        }
        return listaadmin;
    }

    public void adiciona(admin x) {
        String sql = "INSERT INTO tb_admin(id, permissoesgerais) 
        VALUES(?, ?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, p.getId());
            stmt.setString(2, p.getPermissoesgerais());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erro de conexÃ£o com o banco!");
        }

    }

    public admin consultaAdmin(int id) {
        String sql = "SELECT id, permissoes gerais FROM tb_admin WHERE id = ?";
        admin u = null;
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            u = new admin(result.getInt(1), result.getString(2));
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro de conexÃ£o com o banco!");
        }
        return u;
    }

    public void removeAdmin(int id){
        String sql = "DELETE from tb_admin WHERE id = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            stmt.close();
        } catch(SQLException e){
            System.out.println("Erro de conexÃ£o com o Banco de Dados");
        }
    }
}
