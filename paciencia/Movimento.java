package paciencia;

import br.ufsc.inf.leobr.cliente.*;

public class Movimento implements Jogada {

    public int origem;
    public int destino;

    /**
     * 
     * @param origem
     * @param destino
     * @return 
     */
    public Movimento(int origem, int destino) {
        this.origem = origem;
        this.destino = destino;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public int getOrigem() {
        return origem;
    }

    public void setOrigem(int origem) {
        this.origem = origem;
    }
    
    

}