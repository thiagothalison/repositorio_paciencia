package paciencia;

import paciencia.Regras.*;
import br.ufsc.inf.leobr.cliente.*;
import br.ufsc.inf.leobr.cliente.exception.ArquivoMultiplayerException;
import br.ufsc.inf.leobr.cliente.exception.JahConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoPossivelConectarException;
import gui.*;

public class Paciencia {

    protected Regra regra;
    protected int posicao;
    private String nick;
    private AtorNetGames netGames;
    private AtorJogador atorJogador;

    /**
     * 
     * @param estadoInicial
     * @return 
     */
    public void criarMesa(EstadoInicial estadoInicial) {
        regra = new Regra(estadoInicial);
        atorJogador.criarMesa(estadoInicial);
        adicionarObservadores(regra, atorJogador);
        if(estadoInicial.jogadorInicial==getPosicao())
            atorJogador.habilitarInterface();
    }

    /**
     * 
     * @param posicao
     * @return 
     */
    public void iniciarNovaPartida(Integer posicao) {
        Dealer dealer = new Dealer();
        atorJogador.desabilitarInterface();
        setPosicao(posicao);
        if(posicao.equals(1)){
            EstadoInicial estadoInicial = dealer.estadoInicial();
            sincronizarMesa(estadoInicial);
            criarMesa(estadoInicial);
        }
    }

    /**
     * 
     * @param movimento
     * @return 
     */
    public void enviarJogada(Jogada movimento) {
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
     * @param mensagem
     * @return 
     */
    public void receberMensagem(Mensagem mensagem) {
        throw new UnsupportedOperationException();
    }

    /**
     * M�todo executado quando uma jogada vem atrav�s do NetGames.
     * @param movimento
     * @return 
     */
    public void procederJogada(Movimento movimento) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param estadoInicial
     * @return 
     */
    public EstadoInicial ajustarPerspectiva(EstadoInicial estadoInicial) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param movimento
     * @return 
     */
    public EstadoInicial ajustarPerspectiva(Movimento movimento) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param ipServidor
     * @param nick
     * @return 
     */
    public void conectar(String ipServidor, String nick) {
        try{
            netGames.conectar(ipServidor, nick);
            netGames.iniciarPartida(2);
            setNick(nick);
        }catch(NaoPossivelConectarException e){
            atorJogador.popupMensagem("Não foi passivel realizar a conecção!");
        }catch(JahConectadoException e2){
            atorJogador.popupMensagem("Usuário ja esta conectado!");
        }catch(ArquivoMultiplayerException e3){
            atorJogador.popupMensagem("Arquivo de configuração inválido!");
        }
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
     * @param estadoInicial
     * @return 
     */
    public void sincronizarMesa(EstadoInicial estadoInicial) {
        throw new UnsupportedOperationException();
    }

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
     * @param vencedor
     * @return 
     */
    public void finalizarPartida(MovimentoVencedor vencedor) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @return 
     */
    public int getPosicao() {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param posicao
     * @return 
     */
    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    /**
     * 
     * @param regras
     * @param janela
     * @return 
     */
    public void adicionarObservadores(Regra regras, AtorJogador janela) {
        throw new UnsupportedOperationException();
    }

    /**
     * M�todo executado quando uma jogada vem atrav�s do NetGames.
     * @param origem
     * @param destino
     * @return 
     */
    public boolean procederJogada(int origem, int destino) {
        try{
            Jogada jogada= regra.jogada(origem,destino);
            enviarJogada(jogada);
            return true;
        }catch(Exception e){
            atorJogador.popupMensagem(e.getMessage());
            return false;
        }
    }

    /**
     * 
     * @return 
     */
    public String getNick() {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param nick
     * @return 
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

}