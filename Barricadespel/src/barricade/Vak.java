/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barricade;

import javax.swing.Icon;
import javax.swing.JLabel;

/**
 *
 * @author W. Kuik
 */
public class Vak extends JLabel{
    private Icon icon;
    public Vak(){
        //laad hier het plaatje in icon
    }
    
    public void showMe(){
        this.setIcon(this.icon);
    }
    
    public boolean loopBaar(){
        return true;
    }
    
    public int getSleutelNr(){
        return 0;
    }
    
    public int getBarricadeNr(){
        return 0;
    }   
}