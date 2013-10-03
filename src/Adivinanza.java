
/**
 * La Adivinanza propone un desafío, acertar un valor numérico en el rango [1,100]
 * contando con una máxima cantidad de intentos.
 */
class Adivinanza {

	private int solucion;
	
	private int intentosRestantes = 1;
	
	/**
	 * pre : intentos indica la máxima cantidad de oportunidades que se puede arriesgar.
	 * post: inicializar la adivinanza con un número secreto en el rango [1,100].
	 */
	public Adivinanza(int intentos) {
		
		solucion = generar();
		
		if (intentos > 0) {
			
			intentosRestantes = intentos;
		}
	}
	
	/**
	 * post: devuelve un número aleatoreo en el rango [1,100].
	 */
	private int generar() {
		
		return (int) (Math.random() * 100 + 1);
	}
		
	/**
	 * pre : restan intentos disponibles.
	 * post: devuelve si el valor arriesgado es la solución a la Adivinanza, 
	 *       contabilizando el intento si no fue acertada.
	 */
	public boolean arriesgar(int valor) {
		
		boolean adivino = false;
		
		/* solo continua si restan intentos */
		if (intentosRestantes > 0) {
			
			adivino = (solucion == valor);
			
			/* si no adivinó debe contabilizar el intento */
			if (! adivino) {
				
				intentosRestantes--;
			}
		}
		
		return adivino;
	}
	
	/**
	 * post: devuelve la cantidad de intentos restantes para arriesgar un valor incorrecto.
	 */
	public int obtenerIntentosRestantes() {
		
		return intentosRestantes;
	}
}
