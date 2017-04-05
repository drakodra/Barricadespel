/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barricade;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author frank
 */
public class Speler extends JLabel {
    private int PosHorizontaal = 0;
    private int PosVerticaal = 0;
    private ImageIcon icon = new ImageIcon(getClass().getResource("images/SpelerVoor.png"));;
    private int sleutelNr;
    
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
        this.icon = new ImageIcon(getClass().getResource("images/SpelerRechts.png"));
        showMe();
    }
    
    public void StapLinks() {
        this.PosHorizontaal--;
        this.icon = new ImageIcon(getClass().getResource("images/SpelerLinks.png"));
        showMe();
    }
    
    public void StapBeneden() {
        this.PosVerticaal++;
        this.icon = new ImageIcon(getClass().getResource("images/SpelerVoor.png"));
        showMe();
    }
    
    public void StapBoven() {
        this.PosVerticaal--;
        this.icon = new ImageIcon(getClass().getResource("images/SpelerVoor.png"));
        showMe();
    }
    
    public void showMe() {
        this.setIcon(this.icon);
    }
    
    public void setSleutel(int sleutel) {
        this.sleutelNr = sleutel;
    }
    
    public int getSleutel() {
        return this.sleutelNr;
    }
}
