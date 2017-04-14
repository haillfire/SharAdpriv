
public class Opiniao {
		private String data;
		private int id;
		private String postador;
		private int ranking;
		
		public Opiniao(String data, int id, String postador, int ranking) {
			this.data = data;
			this.id = id;
			this.postador = postador;
			this.ranking = ranking;
		}
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getPostador() {
			return postador;
		}
		public void setPostador(String postador) {
			this.postador = postador;
		}
		public int getRanking() {
			return ranking;
		}
		public void setRanking(int ranking) {
			this.ranking = ranking;
		}
	
	
}
