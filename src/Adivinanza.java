
class Adivinanza {

	private int solucion;
	
	/**
	 * post: inicializar la adivinanza con un número secreto en el rango [1,100].
	 */
	public Adivinanza() {
		
		solucion = generar();
	}
	
	/**
	 * post: devuelve un número aleatoreo en el rango [1,100].
	 */
	private int generar() {
		
		return (int) (Math.random() * 100 + 1);
	}
	
	/**
	 * post: devuelve si el valor arriesgado es la solución a la Adivinanza. 
	 */
	public boolean arriesgar(int valor) {
		
		return solucion == valor;
	}
}
