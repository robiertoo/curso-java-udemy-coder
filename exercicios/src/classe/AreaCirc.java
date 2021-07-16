package classe;

public class AreaCirc {
	double raio;
	final static double PI = 3.1415;
	
	AreaCirc(double raio) {
		this.raio = raio;
	}
	
	double area() {
		return Math.pow(this.raio, 2) * PI;
	}
	
	static double area(double raio) {
		return Math.pow(raio, 2) * PI;
	}
}
