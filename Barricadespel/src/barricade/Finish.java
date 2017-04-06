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
public class Finish extends Vak{
    private Icon icon;
    private boolean finish = true;
    
    /**
     * Constructor Finish.
     * @param level
     */
    public Finish(Level level){
       super(level);
       this.icon = new ImageIcon(getClass().getResource("images/Eindveld.png"));
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
        return true;
    }
}
