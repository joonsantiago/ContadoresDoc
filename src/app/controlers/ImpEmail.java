/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controlers;

import app.model.EnvioEmail;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author jonatas
 */
public class ImpEmail implements ActionListener{
    
    EnvioEmail email = new EnvioEmail();
    
    public void actionPerformed(ActionEvent arg0) {
        
        email.EnviarEmail();
    }    
    
}
