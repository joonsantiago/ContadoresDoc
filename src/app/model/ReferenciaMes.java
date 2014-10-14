/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

/**
 *
 * @author jonatas
 */
public class ReferenciaMes {
    
    private String[] mesRef ;
    private String[][] valoresArq;

    public String[][] getValoresArq() {
        return valoresArq;
    }

    public void setValoresArq(String[][] valoresArq) {
        this.valoresArq = valoresArq;
    }
    
    public String getMesRef2(int rowIndex) {
        return mesRef[rowIndex];
    }
    
    
    public String[] getMesRef() {
        return mesRef;
    }

    public void setMesRef(String[] mesRef) {
        this.mesRef = mesRef;
    }
     
}
