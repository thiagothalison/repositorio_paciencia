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
        Movimento movimento = new Movimento(origem,destino);
        return jogada(movimento);
    }

    /**
     * 
     * @param movimento
     * @return 
     */
    public Jogada jogada(Movimento movimento) {
        Jogada retorno = null;
        movimento(movimento);
        decidirVirarBagaco();
        decidirVez();
        int venceu = verificarVencedor();
        if(venceu==0){
            
        }
        
        return null;
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