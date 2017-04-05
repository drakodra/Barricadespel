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
    private Icon iconGeopend;
    private int barricadeNr;
    private boolean geopend;
    
    
    public Barricade(Level level, int barricadeNr){
        super(level);
        switch (barricadeNr){
            case 1: 
                this.iconGesloten = new ImageIcon(getClass().getResource("images/Barricade100.png"));
            case 2:
                this.iconGesloten = new ImageIcon(getClass().getResource("images/Barricade200.png"));
            case 3:
                this.iconGesloten = new ImageIcon(getClass().getResource("images/Barricade300.png"));
            case 4:
                this.iconGesloten = new ImageIcon(getClass().getResource("images/Barricade400.png"));
            case 5:
                this.iconGesloten = new ImageIcon(getClass().getResource("images/Barricade500.png"));
        }
        
        this.iconGeopend = new ImageIcon(getClass().getResource("images/Vak.png"));
        this.barricadeNr = barricadeNr;
        this.geopend = false;
        showMe();
    }
    
    @Override
    public void showMe(){
        if(geopend){
            this.setIcon(this.iconGeopend);
        } else {
            this.setIcon(this.iconGesloten);
        }
    }
    
    @Override
    public boolean loopBaar(){
        return geopend;
    }//met speler onderhandelen
    
    @Override
    public int getBarricadeNr(){
        return barricadeNr;
    }
    
    public void tryKey(int sleutelNr){
        if(barricadeNr == sleutelNr){
            geopend = true;
            this.showMe();
        }
    }   
}