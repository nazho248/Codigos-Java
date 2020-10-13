package oct13;

public class Edificio {


			public int pisos;
			public float area;
			public int inquilinos;
			public float areaxpersona;

		
		public  Edificio() {
			this.pisos=10;
			this.area=100;
			this.inquilinos=50;
			this.areaxpersona = this.area/this.inquilinos;
		}
		
		public Edificio (int valor) {
			this.pisos = valor;
		}
		
		public int getPisos() {
			return pisos;
		}

		public void setPisos(int pisos) {
			if (pisos >=3 && pisos <= 15) {
			
			this.pisos = pisos;}
		 else {
			 System.out.println("pisos invalidos");
			this.pisos=0;
			}
		}

		public float getArea() {
			return area;
		}

		public void setArea(float area) {
			this.area = area;
		}

		public int getInquilinos() {
			return inquilinos;
		}

		public void setInquilinos(int inquilinos) {
			this.inquilinos = inquilinos;
		}

		public float getAreaxpersona() {
			return areaxpersona;
		}

		public void setAreaxpersona(float areaxpersona) {
			this.areaxpersona = areaxpersona;
		}

		public Edificio ( int p, float a, int i) {
			this.pisos = p ;
			this.area = a ;
			this.inquilinos = i;
			this.areaxpersona = area/inquilinos;

		}
		
		
		

	}