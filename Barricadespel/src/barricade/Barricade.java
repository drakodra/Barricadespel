/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barricade;

import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Barricade extends Vak {
    private Icon iconGesloten;
    private int barricadeNr;
    private boolean geopend;
    
    
    public Barricade(Level level, int barricadeNr){
        super(level);
        switch (barricadeNr){
            case 1: 
                this.iconGesloten = new ImageIcon(getClass().getResource("images/Barricade100.png"));
                break;
            case 2:
                this.iconGesloten = new ImageIcon(getClass().getResource("images/Barricade200.png"));
                break;
            case 3:
                this.iconGesloten = new ImageIcon(getClass().getResource("images/Barricade300.png"));
                break;
            case 4:
                this.iconGesloten = new ImageIcon(getClass().getResource("images/Barricade400.png"));
                break;
            case 5:
                this.iconGesloten = new ImageIcon(getClass().getResource("images/Barricade500.png"));
                break;
        }
        
        this.barricadeNr = barricadeNr;
        this.geopend = false;
        showMe();
    }
    
    @Override
    public void showMe(){
        this.setIcon(this.iconGesloten);
    }
    
    @Override
    public boolean loopBaar(Speler speler){
        if(this.geopend != true) {
            if(speler.getSleutel() == barricadeNr) {
                this.geopend = true;
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
    
    @Override
    public int getBarricadeNr(){
        return barricadeNr;
    }
}