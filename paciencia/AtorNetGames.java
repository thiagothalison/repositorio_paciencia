package paciencia;

public class AtorNetGames implements OuvidorProxy {

	/**
	 * 
	 * @param ipServidor
	 * @param nome
	 * @return 
	 */
	public void conectar(String ipServidor, String nome) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
	 */
	public void desconectar() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param jogada
	 * @return 
	 */
	public void enviarJogada(Jogada jogada) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param mensagem
	 * @return 
	 */
	public void enviarMensagem(Mensagem mensagem) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param estadoinicial
	 * @return 
	 */
	public void sincronizarMesa(EstadoInicial estadoinicial) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param estadoInicial
	 * @return 
	 */
	public void atualizarMesa(EstadoInicial estadoInicial) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Método utilizado para requisitar o inicio de uma partida (em caso de erro o método `tratarPartidaNaoIniciada` é chamado)
	 * @param quantidadeJogadores
	 * @return 
	 */
	public void iniciarPartida(Integer quantidadeJogadores) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Utilizado quando iniciarPartida() foi chamado e não há jogadores o suficiente para começar o jogo.
	 * @param message
	 * @return 
	 */
	public void tratarPartidaNaoIniciada(String message) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
	 */
	public void tratarConexaoPerdida() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Recebe uma mensagem em forma de String do servidor.
	 * @param msg
	 * @return 
	 */
	public void receberMensagem(String msg) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Utilizado para finalizar a partida (com sucesso `finalizarPartida()` ou erro `finalizarPartidaComErro()` chamado em Proxy)
	 * @param message
	 * @return 
	 */
	public void finalizarPartidaComErro(String message) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Método chamado para iniciar uma partida (a primeira ou não)
	 * @param posicao
	 * @return 
	 */
	public void iniciarNovaPartida(Integer posicao) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Recebe uma jogada do servidor.
	 * @param jogada
	 * @return 
	 */
	public void receberJogada(Jogada jogada) {
		throw new UnsupportedOperationException();
	}

}