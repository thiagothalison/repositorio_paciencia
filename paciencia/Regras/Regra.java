package paciencia.Regras;

import br.ufsc.inf.leobr.cliente.Jogada;
import java.util.*;
import paciencia.*;

public class Regra extends Observable {

    protected Collection<ArrayList<Pilha>> pilhas;
    protected ArrayList<Object> elementosMesa;
    protected Collection<Bagaco> bagacos;
    protected Collection<Restrito> restritos;
    protected Collection<Sequencia> sequencias;
    protected Collection<Sequencia> baralhos;

    /**
     * 
     * @param movimento
     * @return 
     */
    public boolean movimento(Movimento movimento) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @return 
     */
    public void virarBagaco() {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param origem
     * @param destino
     * @return 
     */
    public Jogada jogada(int origem, int destino) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param movimento
     * @return 
     */
    public Jogada jogada(Movimento movimento) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param estadoInicial
     * @return 
     */
    public Regra(EstadoInicial estadoInicial) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @return 
     */
    public int verificarVencedor() {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @return 
     */
    public void decidirVez() {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @return 
     */
    public void decidirVirarBagaco() {
        throw new UnsupportedOperationException();
    }

}