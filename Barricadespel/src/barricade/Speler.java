/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barricade;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author frank
 */
public class Speler extends JLabel {
    private int PosHorizontaal = 0;
    private int PosVerticaal = 0;
    private Icon icon;
    private ImageIcon rechts = new ImageIcon(getClass().getResource("images/SpelerRechts.png"));
    private ImageIcon links = new ImageIcon(getClass().getResource("images/SpelerLinks.png"));
    private ImageIcon boven = new ImageIcon(getClass().getResource("images/SpelerBoven.png"));
    private ImageIcon beneden = new ImageIcon(getClass().getResource("images/SpelerBeneden.png"));
    private int sleutelNr;
    
    /**
     * Constructor speler
     * @param PosHorizontaal
     * @param PosVerticaal
     */
    public Speler(int PosHorizontaal, int PosVerticaal) {
        this.PosHorizontaal = PosHorizontaal;
        this.PosVerticaal = PosVerticaal;
    }
    
    /**
     * Haalt de horizontale positie op.
     * @return
     */
    public int getPosHorizontaal() {
        return this.PosHorizontaal;
    }
    
    /**
     * Haalt de verticale positie op.
     * @return
     */
    public int getPosVerticaal() {
        return this.PosVerticaal;
    }
    
    /**
     * Plaats naar rechts, zet icon.
     */
    public void StapRechts() {
        this.PosHorizontaal++;
        this.icon = rechts;
        showMe();
    }
    
    /**
     * Plaats naar links, zet icon.
     */
    public void StapLinks() {
        this.PosHorizontaal--;
        this.icon = links;
        showMe();
    }
    
    /**
     * Plaats naar beneden, zet icon.
     */
    public void StapBeneden() {
        this.PosVerticaal++;
        this.icon = beneden;
        showMe();
    }
    
    /**
     * Plaats naar boven, zet icon.
     */
    public void StapBoven() {
        this.PosVerticaal--;
        this.icon = boven;
        showMe();
    }
    
    /**
     * Zet icon.
     */
    public void showMe() {
        this.setIcon(this.icon);
    }
    
    /**
     * Zet sleutel.
     * @param sleutel
     */
    public void setSleutel(int sleutel) {
        this.sleutelNr = sleutel;
    }
    
    /**
     * haalt sleutel op.
     * @return
     */
    public int getSleutel() {
        return this.sleutelNr;
    }
}
