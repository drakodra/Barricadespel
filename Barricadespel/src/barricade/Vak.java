/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barricade;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author W. Kuik
 */
public class Vak extends JLabel{
    private Icon icon;

    private Level level;
    
    public Vak(Level level) {
        this.level = level;
      this.icon = new ImageIcon( getClass().getResource( "Vak.png"));
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