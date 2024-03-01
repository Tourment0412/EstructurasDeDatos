package co.edu.uniquindio.estructuras.clase010324;

public class ListaEnlazada <E> {
	public Nodo <E> head;
	public int size;
	
	
	
	
	public ListaEnlazada() {
		this.head = null;
		this.size=0;
	}




	public void agregarInicio(Nodo <E> nodo) {
		if(head==null) {
			head=nodo;
			return;
		}
		Nodo <E> auxiliar= head;
		head=nodo;
		head.siguiente=auxiliar;
	}
	
	//Se supone que en agregar se debe de enviar solo el dato no el nodo
	public void agregarInicioValor(E valor) {
		Nodo <E> nodoPara= new Nodo<E>(valor);
		if(head==null) {
			head= nodoPara;
			return;
		}
		Nodo<E> aux= head;
		head=nodoPara;
		head.siguiente=aux;
		
	}
	
	//Tambien podemos hacerlo asignando un valor de previous a un nodo
	

}
