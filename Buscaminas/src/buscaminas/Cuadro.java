/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import javax.swing.JButton;
/**
 *
 * @author arnold
 */
public class Cuadro extends JButton{
    private boolean mina;
    
    public Cuadro(){
        super ();
        double random = Math.random();
        if(random>0.7)
            mina= true;
        else
            mina=false;
        
    }
    
    public boolean lugarMinado(){
        return mina;
        
    }
}
