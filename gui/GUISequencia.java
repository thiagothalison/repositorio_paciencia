/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUISequencia.java
 *
 * Created on Jul 8, 2011, 5:01:54 PM
 */
package gui;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author Matheus
 */
public class GUISequencia extends InterfaceCarta implements Serializable{

    /** Creates new form GUISequencia */
    public GUISequencia() {
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
        setMaximumSize(new java.awt.Dimension(189, 81));
        setMinimumSize(new java.awt.Dimension(189, 81));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(189, 81));
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
    
    protected boolean paraEsquerda;

    /**
     * Get the value of paraEsquerda
     *
     * @return the value of paraEsquerda
     */
    public boolean isParaEsquerda() {
        return paraEsquerda;
    }

    /**
     * Set the value of paraEsquerda
     *
     * @param paraEsquerda new value of paraEsquerda
     */
    public void setParaEsquerda(boolean paraEsquerda) {
        this.paraEsquerda = paraEsquerda;
    }

}
