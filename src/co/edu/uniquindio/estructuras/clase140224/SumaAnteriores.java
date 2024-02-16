package co.edu.uniquindio.estructuras.clase140224;

public class SumaAnteriores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int suma= sumar(n, 0);
		System.out.println(suma);

	}
	
	
	
	public static int sumar(int n, int suma) {
		if(n==0) {
			return suma;
		}
		else {
			return sumar(n-1,suma+n);
		}
	}

}
