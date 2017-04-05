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
    
    public Finish(Level level){
       super(level);
       this.icon = new ImageIcon(getClass().getResource("images/Eindveld.png"));
       showMe();
    }
    
    @Override
    public void showMe() {
        this.setIcon(this.icon);
    }
    
    @Override
    public boolean loopBaar(){
        return false;
    } 
}
