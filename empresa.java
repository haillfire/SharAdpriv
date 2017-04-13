
public class empresa {
    private int id;
    private String cnpj;
    private String nome;
    private String area;
    private boolean vip;
    private int telefone;
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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
    
    public empresa(){}
    
    public empresa(int id, String cnpj, String nome, String area, boolean vip, int telefone){ 
        this.id = id;       
        this.cnpj = cnpj; 
        this.nome = nome;
        this.area = area;
        this.vip = vip;
        this.telefone = telefone;
        
    }
}
