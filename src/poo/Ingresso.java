package poo;

public class Ingresso {
        private String show;
        private double data;
        private double hora;
        private String tipo;
        private String lugar;
		public Ingresso(String show, double data, double hora, String tipo, String lugar) {
			super();
			this.show = show;
			this.data = data;
			this.hora = hora;
			this.tipo = tipo;
			this.lugar = lugar;
		}
		public String getShow() {
			return show;
		}
		public void setShow(String show) {
			this.show = show;
		}
		public double getData() {
			return data;
		}
		public void setData(double data) {
			this.data = data;
		}
		public double getHora() {
			return hora;
		}
		public void setHora(double hora) {
			this.hora = hora;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public String getLugar() {
			return lugar;
		}
		public void setLugar(String lugar) {
			this.lugar = lugar;
		}
        
        public void visualizar() {
        	System.out.println("O show do "+show+" será no dia "+data);
        }
}
