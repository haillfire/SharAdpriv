import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpresaDAO {

    private Connection conn;

    public EmpresaDAO() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/bdadx", "root", "");
        } catch (SQLException e) {
            System.out.println("Erro na conexÃ£o com o Banco de Dados");
        }
    }

    public List<empresa> obterTodasEmpresas() {
        String sql = "SELECT * FROM tb_empresa";
        List<empresa> listaempresa = new ArrayList<empresa>();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                empresa o = new empresa(result.getInt ("id"), result.getString("cnpj"), result.getString("nome"), result.getString("area"), result.getBoolean("vip"), result.getInt("telefone"));
                listaempresa.add(o);
            }
        } catch (SQLException erro) {
            System.out.println("Erro de conexÃ£o com o banco!");
        }
        return listaempresa;
    }

    public void adiciona(empresa p) {
        String sql = "INSERT INTO tb_empresa(id, cnpj, nome, area, vip, telefone) VALUES(?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, p.getId());
            stmt.setString(2, p.getCnpj());
            stmt.setString(3, p.getNome());
            stmt.setString(4, p.getArea());
            stmt.setBoolean(5, p.isVip());           
            stmt.setInt(6, p.getTelefone());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erro de conexÃ£o com o banco!");
        }

    }

    public empresa consultaEmpresa(int id) {
        String sql = "SELECT id, cnpj, nome, area, vip, telefone FROM tb_empresa WHERE id = ?";
        empresa u = null;
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            u = new empresa(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getBoolean(5), result.getInt(6));
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro de conexÃ£o com o banco!");
        }
        return u;
    }

    public void removeEmpresa(int id){
        String sql = "DELETE from tb_empresa WHERE id = ?";
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
