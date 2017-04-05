/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barricade;

import javax.swing.JPanel;

/**
 *
 * @author W. Kuik
 */
public class Level extends JPanel{
    private Vak[][] vak;
    
    public Level(int levelNr){
        laadLevel(levelNr);
    }
    
    private void laadLevel(int levelNr){
        switch(levelNr){
            case 1:
            break;    
        }
    }
    
    public void CheckVak() {
        //TODO: Het vak check wat er staat.
        //Let op je moet ook checken of die niet out of bounds loopt
    }  
}
