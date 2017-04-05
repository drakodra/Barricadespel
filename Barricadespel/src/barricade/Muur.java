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
    
    public Muur(Level level){
       super(level);
       this.icon = new ImageIcon(getClass().getResource("images/Muur.png"));
       showMe();
    }
    
    @Override
    public boolean loopBaar(){
        return false;
    } 
}
