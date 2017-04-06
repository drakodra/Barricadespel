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
 * @author frank
 */
public class Muur extends Vak{
    private Icon icon;
    
    /**
     * Constructor level.
     * @param level
     */
    public Muur(Level level){
       super(level);
       this.icon = new ImageIcon(getClass().getResource("images/Muur.png"));
       showMe();
    }
    
    /**
     * Zet icon.
     */
    @Override
    public void showMe() {
        this.setIcon(this.icon);
    }
    
    /**
     * Returned of het vakje loopbaar is.
     * @return 
     */
    @Override
    public boolean loopBaar(Speler speler){
        return false;
    } 
}
