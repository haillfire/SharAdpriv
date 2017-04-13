public class funcionario {
	private int id;
	private String nome;
	private int ranking;
	
	public funcionario(int id, String nome, int ranking) {
		this.id = id;
		this.nome = nome;
		this.ranking = ranking;
	}
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
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	
}
