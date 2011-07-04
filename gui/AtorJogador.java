package gui;

import javax.swing.*;
import java.util.*;
import paciencia.*;

public class AtorJogador extends JFrame implements Observer, Observer {

	protected Paciencia mesa;
	protected String nomeJogador;
	protected String nomeOponente;

	/**
	 * 
	 * @return 
	 */
	public void habilitarInterface() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
	 */
	public void desabilitarInterface() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param mensagem
	 * @return 
	 */
	public void popupMensagem(String mensagem) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param estadoInicial
	 * @return 
	 */
	public void criarMesa(EstadoInicial estadoInicial) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
	 */
	public void consultarRegras() {
		throw new UnsupportedOperationException();
	}

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
	 * @return 
	 */
	public String getNome() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
	 */
	public String getIpServidor() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
	 */
	public String getTextoMensagem() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param o
	 * @param arg
	 * @return 
	 */
	public void update(Observable o, Object arg) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param mensagem
	 * @return 
	 */
	public void chatMensagem(String mensagem) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param o
	 * @param arg
	 * @return 
	 */
	@Override
	public void update(Observable o, Object arg) {
		throw new UnsupportedOperationException();
	}

}