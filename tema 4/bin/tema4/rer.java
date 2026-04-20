package tema4;
		public class p {
			 private double x; 
			 private double y;			
			 public Punto(){ } 
	     	 public Punto(double x, double y){ 
			 this.x=x;

			 this.y=y;

			 }


			 public double getX() {

			 return x;

			 }

			 public double getY() {

			 return y;

			 }

			 public void setX(double x) {

			 this.x = x;

			 }

			 public void setY(double y) {

			 this.y = y;

			 }

			 public void setXY(double x, double y) {

			 this.x = x;

			 this.y = y;

			 }

			 public void moverPunto(double abs, double ord) {

			 x = x+abs;

			 y = y+ord;

			 }

			 public String toString() {

			 return "(" + x + ", " + y + ")";

			 }



			

	}


