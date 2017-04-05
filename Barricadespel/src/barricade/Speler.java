/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barricade;

/**
 *
 * @author frank
 */
public class Speler {
    private int PosHorizontaal = 0;
    private int PosVerticaal = 0;
    
    public Speler(int PosHorizontaal, int PosVerticaal) {
        this.PosHorizontaal = PosHorizontaal;
        this.PosVerticaal = PosVerticaal;
    }
    
    public int getPosHorizontaal() {
        return this.PosHorizontaal;
    }
    
    public int getPosVerticaal() {
        return this.PosVerticaal;
    }
    
    public void StapRechts() {
        this.PosHorizontaal++;
    }
    
    public void StapLinks() {
        this.PosHorizontaal--;
    }
    
    public void StapBeneden() {
        this.PosVerticaal++;
    }
    
    public void StapBoven() {
        this.PosVerticaal--;
    }
}
