import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private Connection conn;

    public UsuarioDAO() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/projeto", "root", "");
        } catch (SQLException e) {
            System.out.println("Erro na conexão com o Banco de Dados");
        }
    }

    public List<usuario> obterTodosUsuarios() {
        String sql = "SELECT * FROM tb_usuario";
        List<usuario> listauser = new ArrayList<usuario>();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                usuario o = new usuario(result.getInt("id"), result.getString("nome"), result.getString("email"), result.getString("senha"), result.getBoolean("vip"), result.getInt("telefone"), result.getString("area"));
                listauser.add(o);
            }
        } catch (SQLException erro) {
            System.out.println("Erro de conexão com o banco!");
        }
        return listauser;
    }

    public void adiciona(usuario p) {
        String sql = "INSERT INTO tb_usuario(id, nome, email, senha, vip, telefone, area) VALUES(?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, p.getId());
            stmt.setString(2, p.getNome());
            stmt.setString(3, p.getEmail());
            stmt.setString(4, p.getSenha());
            stmt.setBoolean(5, p.isVip());
            stmt.setInt(6, p.getTelefone());
            stmt.setString(7, p.getArea());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erro de conexão com o banco!");
        }

    }

    public usuario consultaUser(int id) {
        String sql = "SELECT id, nome, email, senha, vip, telefone, area FROM tb_usuario WHERE id = ?";
        usuario u = null;
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            u = new usuario(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getBoolean(5), result.getInt(6), result.getString(7));
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro de conexão com o banco!");
        }
        return u;
    }

    public void removeUser(int id){
        String sql = "DELETE from tb_usuario WHERE id = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            stmt.close();
        } catch(SQLException e){
            System.out.println("Erro de conexão com o Banco de Dados");
        }
    }
}
