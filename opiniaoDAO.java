import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class opiniaoDAO {

	private Connection conn;

    public opiniaoDAO() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/bdadx", "root", "");
        } catch (SQLException e) {
            System.out.println("Erro na conexao com o Banco de Dados");
        }
    }

    public List<Opiniao> obterTodasOpin() {
        String sql = "SELECT * FROM tb_opiniao";
        List<Opiniao> listaOpiniao = new ArrayList<Opiniao>();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                Opiniao o = new Opiniao(result.getString ("data"), result.getInt("id"), result.getString("postador"), result.getInt("ranking"));
                listaOpiniao.add(o);
            }
        } catch (SQLException erro) {
            System.out.println("Erro de conexao com o banco!");
        }
        return listaOpiniao;
    }

    public void adiciona(Opiniao o) {
        String sql = "INSERT INTO tb_opiniao(data, id, postador, ranking) VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, o.getData());
            stmt.setInt(2, o.getId());
            stmt.setString(3, o.getPostador());
            stmt.setInt(4, o.getRanking());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erro de conexao com o banco!");
        }

    }

    public Opiniao consultaOpiniao(int id) {
        String sql = "SELECT data, id, postador, ranking FROM tb_opinao WHERE id = ?";
        Opiniao o = null;
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            o = new Opiniao(result.getString(1), result.getInt(2), result.getString(3), result.getInt(4));
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro de conexao com o banco!");
        }
        return o;
    }

    public void removeOpiniao(int id){
        String sql = "DELETE from tb_opiniao WHERE id = ?";
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
