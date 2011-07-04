package paciencia;

import br.ufsc.inf.leobr.cliente.*;

/**
 * Esta classe � utilizada quando o jogador efetuar um movimento que lhe garante a vit�ria.
 */
public class MovimentoVencedor extends Movimento implements Jogada, Jogada {

	private String vencedor;

	/**
	 * 
	 * @param origem
	 * @param destino
	 * @param vencedor
	 * @return 
	 */
	public MovimentoVencedor(int origem, int destino, String vencedor) {
		throw new UnsupportedOperationException();
	}

}