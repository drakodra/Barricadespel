/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barricade;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author W. Kuik
 */
public class Muur extends Vak{
    private Icon icon;
    
    public Muur(){
       this.icon = new ImageIcon(getClass().getResource( "Muur.png"));
    }
    
    @Override
    public void showMe(){
        this.setIcon(this.icon);
    }
    
    @Override
    public boolean loopBaar(){
        return false;
    }
    
    @Override
    public int getSleutelNr(){
        return 0;
    }
    
    @Override
    public int getBarricadeNr(){
        return 0;
    }   
}
