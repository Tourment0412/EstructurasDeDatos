package co.edu.uniquindio.estructuras.repasorecursividad;

public class HallaMayorDivideVenceras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {8,6,7,3,2,7,9,9};
		int mayor= hallarMayor(array);
		System.out.println(mayor);

	}
	
	public static int hallarMayor(int []array) {
		return hallarMayorAux(0,array.length-1,array);
	}

	private static int hallarMayorAux(int inicio, int fin, int[] array) {
		if (inicio==fin) {
			return array[inicio];
		}else {
			int mitad= (inicio+fin)/2;
			int x= hallarMayorAux(inicio,mitad,array);
			int y= hallarMayorAux(mitad+1,fin,array);
			if(x<y) {
				return y;
			}else {
				return x;
			}
		}
	}

}
