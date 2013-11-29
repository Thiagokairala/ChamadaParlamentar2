package br.com.MDSGPP.ChamadaParlamentar.exception;


/*esta exception é para verificar se o deputado possui*
 * dados válidos ou não.*
 */
public class ListaVaziaException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public ListaVaziaException() {
		super();
	}
}
