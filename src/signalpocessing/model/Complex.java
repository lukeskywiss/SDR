package signalpocessing.model;

public class Complex {

	private double reale;
	private double immaginaria;


	public Complex(double reale, double immaginaria) {
		this.reale = reale;
		this.immaginaria = immaginaria;
	}


	public double getReale() {
		return reale;
	}


	public void setreale(double reale) {
		this.reale = reale;
	}


	public double getImmaginaria() {
		return immaginaria;
	}


	public void setimmaginaria(double immaginaria) {
		this.immaginaria = immaginaria;
	}



	//Metodi per complessi
	public void complessoCogniugato(){
		this.immaginaria= - this.immaginaria;
	}

	//Somma tra due numeri complessi
	public Complex somma(Complex b){
		Complex result = new Complex((this.reale+b.getReale()),
				(this.immaginaria+b.getImmaginaria()));
		return result;
	}

	//Differenza tra 2 numeri complessi
	public Complex differenza(Complex b){
		Complex result = new Complex((this.reale -  b.getReale()),
				(this.immaginaria - b.getImmaginaria()));
		return result;
	}


	//Prodotto tra 2 numeri complessi
	public Complex prodotto(Complex b){
		double reale = this.reale * b.getReale() - this.getImmaginaria() * b.getImmaginaria();
		double immag = this.reale * b.getImmaginaria() + b.getReale() * this.immaginaria;
		return new Complex(reale, immag);
	}

	public double phase(){
		return Math.atan2(this.immaginaria, this.reale);
	}


	@Override
	public String toString() {
		return "Complex [reale=" + reale + ", immaginaria="
				+ immaginaria + "]";
	}

	//Copia e incolla la convoluzione

	public static void main (String []args){

		Complex c1= new Complex(1,2);
		Complex c2= new Complex(1,2);
		Complex c3= new Complex(0,0);

	}
}
