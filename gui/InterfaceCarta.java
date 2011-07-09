package gui;

import java.awt.Graphics;
import java.awt.datatransfer.Transferable;
import javax.swing.*;
import java.util.*;
import paciencia.Carta;

public abstract class InterfaceCarta
    extends JPanel
    implements Observer, Transferable
{

    protected static ResourceBundle imageBundle;
    protected ArrayList<Carta> cartas;
    
    static {
        imageBundle = ResourceBundle.getBundle("gui.ImageLoader"); // bundle padrão
    }
    
    /**
     * 
     * @return 
     */
    public void calcularPosicao() {
        throw new UnsupportedOperationException();
    }

    /**
     * Get the value of imageBundle
     *
     * @return the value of imageBundle
     */
    public ResourceBundle getImageBundle() {
        return imageBundle;
    }

    /**
     * Set the value of imageBundle
     *
     * @param imageBundle new value of imageBundle
     */
    public void setImageBundle(ResourceBundle imageBundle) {
        this.imageBundle = imageBundle;
    }

    public ImageIcon getImage(Carta carta){
        return (ImageIcon)this.imageBundle.getObject(carta.naipe + "_" + carta.numero);
    }
    
    public ImageIcon getImage(String carta){
        return (ImageIcon)this.imageBundle.getObject(carta);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        this.cartas = (ArrayList<Carta>)arg;
        this.repaint();
    }
}