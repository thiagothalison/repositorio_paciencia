package paciencia.Regras;

import java.util.*;
import paciencia.*;

public class Bagaco
    extends Observable
    implements ColocarCarta {

    private ArrayList<Carta> cartas;

    /**
     * 
     * @param carta
     * @return 
     */
    @Override
    public void colocar(Carta carta) {
        throw new UnsupportedOperationException();
        this.setChanged();
        this.notifyObservers(cartas);
    }

    /**
     * 
     * @param pegar
     * @return 
     */
    @Override
    public void colocar(PegarCarta pegar) {
        throw new UnsupportedOperationException();
        this.setChanged();
        this.notifyObservers(cartas);
    }

}