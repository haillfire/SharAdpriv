import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class msgDAO {

	private Connection conn;

    public msgDAO() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/bdadx", "root", "");
        } catch (SQLException e) {
            System.out.println("Erro na conexao com o Banco de Dados");
        }
    }

    public List<msg> obterTodasMsg() {
        String sql = "SELECT * FROM tb_msg";
        List<msg> listamsg = new ArrayList<msg>();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                msg o = new msg(result.getInt ("id_envia"), result.getInt("idmsg"), result.getInt("idrecebe"), result.getString("texto"));
                listamsg.add(o);
            }
        } catch (SQLException erro) {
            System.out.println("Erro de conexao com o banco!");
        }
        return listamsg;
    }

    public void adiciona(msg m) {
        String sql = "INSERT INTO tb_msg(id_envia, idmsg, idrecebe, texto) VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, m.getId_envia());
            stmt.setInt(2, m.getIdmsg());
            stmt.setInt(3, m.getIdrecebe());
            stmt.setString(4, m.getTexto());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erro de conexao com o banco!");
        }

    }

    public msg consultaMsg(int id_envia) {
        String sql = "SELECT id_envia, idmsg, idrecebe, texto FROM tb_msg WHERE id_envia = ?";
        msg m = null;
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id_envia);
            ResultSet result = stmt.executeQuery();
            m = new msg(result.getInt(1), result.getInt(2), result.getInt(3), result.getString(4));
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro de conexao com o banco!");
        }
        return m;
    }

    public void removeMsg(int id_envia){
        String sql = "DELETE from tb_msg WHERE id_envia = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id_envia);
            stmt.execute();
            stmt.close();
        } catch(SQLException e){
            System.out.println("Erro de conexao com o Banco de Dados");
        }
    }
}
