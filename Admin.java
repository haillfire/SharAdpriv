
public class Admin {
	public class admin {
	    private int id;
	    private String permissoesgerais;
	    
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getPermissoesgerais() {
	        return permissoesgerais;
	    }

	    public void setPermissoesgerais(String permissoesgerais) {
	        this.permissoesgerais = permissoesgerais;
	    }

	        
	    public admin(){}
	    
	    public admin (int id, String permissoesgerais){
	        this.id = id; 
	        this.permissoesgerais = permissoesgerais;
	    }
	}
	
}
