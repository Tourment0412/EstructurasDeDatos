package co.edu.uniquindio.estructuras.clase140224;

public class SumaElementosArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array= {2,4,5,3};
		int suma= sumarElementosArreglo(array, 0);
		System.out.println(suma);
	}
	
	public static int sumarElementosArreglo(int[]array,int indice) {
		if(indice==array.length-1)
			return array[indice];
		return array[indice]+sumarElementosArreglo(array,indice+1);
			
	}

}
