/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.ResourceBundle;
import java.util.Vector;
import javax.swing.ImageIcon;

/**
 *
 * @author augusto
 */
public class ImageLoader
   extends ResourceBundle {

    private static final Vector chaves;
    private static final String sufixo = ".png";
    private static Hashtable tabela;
    
    static {
         chaves  = new Vector();
         //chaves.addElement("language");
         tabela = new Hashtable();
    }

    @Override
    protected Object handleGetObject(String key) {
        return loadImage(key);
    }

    @Override
    public Enumeration<String> getKeys() {
        return chaves.elements();
    }

    private Object loadImage(String nome) {
        String imageName = nome + sufixo;
        ImageIcon icon = null; // caso a imagem nao exista retorna null
        
        icon = (ImageIcon)tabela.get(imageName);

        // carrega
        if (icon == null) {
            URL url;
            url = ImageLoader.class.getResource("images/" + imageName);

            if (url != null) {
                icon = new ImageIcon(url);
                tabela.put(imageName, icon);
            }
        }

        return icon;
    }
}
