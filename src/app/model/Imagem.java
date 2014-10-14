/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app.model;

import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Jonatas
 */
public class Imagem extends JLabel implements TableCellRenderer {

    String url;
    public Imagem(String url){
        setOpaque(true);
        this.url = url;
    }
    public Component getTableCellRendererComponent(JTable table,Object value, boolean isSelected,
            boolean hasFocus, int row, int column){
        ImageIcon imagem = new ImageIcon(url);
        //verificar da existencia da imagem icon.if
        
        if(isSelected)
            setBackground(table.getSelectionBackground());
        else
            setBackground(table.getBackground());
        setHorizontalAlignment(CENTER);
        setIcon(imagem);
        setText(value.toString());
        
        return this;
    }
    public void validate(){}
    public void revalidate(){}
    protected void firePropertyChange(String propertyName, Object oldValue, Object newValue){}
    public void firePropertyChange(String propertyName, boolean oldValue, boolean newValue){}
}
