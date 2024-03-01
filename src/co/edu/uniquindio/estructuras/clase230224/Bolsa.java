package co.edu.uniquindio.estructuras.clase230224;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bolsa <E> implements Iterable<R>{
	
	
	
	/*
	 * Conceptualmente nuestra bolsa de esta forma es generica, ya que permite alamcenar cualquier
	 * tipo de dato.
	 */
	List<E> listElements= new ArrayList<>();
	
	public boolean add (E element) {
		return listElements.add(element);
	}
	
	public boolean remove(E element)
	{
		return listElements.remove(listElements);
	}
	
	public E get (int i) {
		return listElements.get(i);
	}
	
	public List<Object> getElements(){
		return listElements;
	}

	@Override
	public Iterator<R> iterator() {
		// TODO Auto-generated method stub
		return bolsaIterato<R<>;
	}
	
	

}
