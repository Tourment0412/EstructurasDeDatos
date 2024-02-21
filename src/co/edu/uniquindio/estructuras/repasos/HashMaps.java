package co.edu.uniquindio.estructuras.repasos;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
	
	public static void main(String [] args) {
		Map <Integer,String> mapaEmpleados= new HashMap<>();
		//Este se va a basar en la busqueda Hash.
		
		//Usemos el metodo put
		
		mapaEmpleados.put(1523, "Luna");
		mapaEmpleados.put(1524, "Pepe");
		mapaEmpleados.put(1525, "Carlos");
		
		
		boolean existencia= mapaEmpleados.containsValue("Maria");
		if(existencia) {
			System.out.println("El valor buscado esta");
		}else {
			System.out.println("El valor buscado no esta");
		}
		
		boolean existenciaKey = mapaEmpleados.containsKey(1523);
		if(existenciaKey) {
			System.out.println("El valor esta");
		}else {
			System.out.println("El valor no esta");
		}
		 //Values devuelve una colection de string (Supongo por que son String los values)
		System.out.println(mapaEmpleados.values());
		
		//Al igual el keyset Devolvera integer por que las keys seran integers
		System.out.println(mapaEmpleados.keySet());
		
	
		//Obtengamos valores por key, para guardarla con variable del tipo del valor de las keys
		//Con ids que no existen se devolveran nulls
		String nombre =mapaEmpleados.get(1523);
		System.out.println("Empleado buscado: "+nombre);
		
		//Para el remove tambien se hace con la clave, si la clave no existe no producira exception
		//Solo no hara alguna accion.
		mapaEmpleados.remove(1524);
		System.out.println(mapaEmpleados.values());
	}
	
	
	
	


}
