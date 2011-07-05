package paciencia.Regras;

import java.util.*;
import paciencia.*;

public class Restrito extends Observable implements ColocarCarta, PegarCarta {

    private Collection<ArrayList<Carta>> cartas;

    /**
     * 
     * @param carta
     * @return 
     */
    @Override
    public void colocar(Carta carta) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param pegar
     * @return 
     */
    @Override
    public void colocar(PegarCarta pegar) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @return 
     */
    @Override
    public Carta pegar() {
        throw new UnsupportedOperationException();
    }

}