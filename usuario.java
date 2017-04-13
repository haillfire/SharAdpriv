
public class usuario {
	private int id;
    private String nome;
    private String email;
    private String senha;
    private boolean vip;
    private int telefone;
    private String area;
	


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    public usuario(){}
    
    public usuario(int id, String nome, String email, String senha, boolean vip, int telefone, String area){
        this.id = id; 
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.vip = vip;
        this.telefone = telefone;
        this.area = area;
    }
}
