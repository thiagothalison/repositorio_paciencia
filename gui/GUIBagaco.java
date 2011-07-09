/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUIBagaco.java
 *
 * Created on Jul 8, 2011, 5:00:49 PM
 */
package gui;

import java.awt.Graphics;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;
import paciencia.Carta;

/**
 *
 * @author Matheus
 */
public class GUIBagaco
    extends InterfaceCarta
    implements Serializable{
    
    /** Creates new form GUIBagaco */
    public GUIBagaco() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setMaximumSize(new java.awt.Dimension(57, 81));
        setMinimumSize(new java.awt.Dimension(57, 81));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(57, 81));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public DataFlavor[] getTransferDataFlavors() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isDataFlavorSupported(DataFlavor flavor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        if( this.cartas != null && this.cartas.size() > 0 ){
            Carta carta = this.cartas.get(0);
            g.drawImage(this.getImage(carta).getImage(),0,0,null);
        }
    }
}
