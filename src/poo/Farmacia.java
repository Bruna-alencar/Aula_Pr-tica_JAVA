package poo;

public class Farmacia {
        private String remedio;
        private int ml;
        private int estoque;
        private String sintoma;
        private int dias;
		public Farmacia(String remedio, int ml, int estoque, String sintoma, int dias) {
			super();
			this.remedio = remedio;
			this.ml = ml;
			this.estoque = estoque;
			this.sintoma = sintoma;
			this.dias = dias;
		}
		public String getRemedio() {
			return remedio;
		}
		public void setRemedio(String remedio) {
			this.remedio = remedio;
		}
		public int getMl() {
			return ml;
		}
		public void setMl(int ml) {
			this.ml = ml;
		}
		public int getEstoque() {
			return estoque;
		}
		public void setEstoque(int estoque) {
			this.estoque = estoque;
		}
		public String getSintoma() {
			return sintoma;
		}
		public void setSintoma(String sintoma) {
			this.sintoma = sintoma;
		}
		public int getDias() {
			return dias;
		}
		public void setDias(int dias) {
			this.dias = dias;
		}
        
        public void visualizar() {
        	System.out.println("O remédio "+remedio+" tem "+estoque+" no estoque");
        }
}
