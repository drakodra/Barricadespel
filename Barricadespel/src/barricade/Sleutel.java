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
 * @author W. Kuik
 */
public class Sleutel extends Vak {

    private Icon iconSleutel;
    private Icon iconOpgepakt;
    private int sleutelNr;
    private boolean opgepakt;

    public Sleutel(Level level, int sleutelNr) {
        super(level);
        switch (sleutelNr){
            case 1:
                this.iconSleutel = new ImageIcon(getClass().getResource("images/Sleutel100.png"));
                break;
            case 2:
                this.iconSleutel = new ImageIcon(getClass().getResource("images/Sleutel200.png"));
                break;
            case 3:
                this.iconSleutel = new ImageIcon(getClass().getResource("images/Sleutel300.png"));
                break;
            case 4:
                this.iconSleutel = new ImageIcon(getClass().getResource("images/Sleutel400.png"));
                break;
            case 5:
                this.iconSleutel = new ImageIcon(getClass().getResource("images/Sleutel500.png"));
        }
        this.sleutelNr = sleutelNr;
        this.opgepakt = false;
        this.iconOpgepakt = new ImageIcon(getClass().getResource("images/Vak.png"));
        showMe();
    }

    @Override
    public void showMe() {
        if (opgepakt) {
            this.setIcon(iconOpgepakt);
        } else {
            this.setIcon(iconSleutel);
        }
    }


}
