/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barricade;

import javax.swing.Icon;


public class Barricade extends Vak {
    private Icon iconGesloten;
    private Icon iconGeopend;
    private int barricadeNr;
    boolean geopend;
    
    public Barricade(int barricade){
        //this.iconGesloten =
        //this.iconGeopend =
        this.barricadeNr = barricade;
        this.geopend = false;
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
    }
    
    @Override
    public int getSleutelNr(){
        return 0;
    }
    
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