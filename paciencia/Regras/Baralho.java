package paciencia.Regras;

import java.util.*;
import paciencia.*;

public class Baralho extends Observable implements PegarCarta {

    private ArrayList<Carta> cartas;

    /**
     * 
     * @return 
     */
    @Override
    public Carta pegar() {
        throw new UnsupportedOperationException();
        this.setChanged();
        this.notifyObservers(cartas);
    }

}