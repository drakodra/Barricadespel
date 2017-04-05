/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barricade;

import javax.swing.Icon;

/**
 *
 * @author W. Kuik
 */
public class Sleutel extends Vak {

    private Icon iconSleutel;
    private Icon iconOpgepakt;
    private int sleutelNr;
    private boolean opgepakt;

    public Sleutel(int sleutelNr) {
        this.sleutelNr = sleutelNr;
        this.opgepakt = false;
        //laad icons
    }

    @Override
    public void showMe() {
        if (opgepakt) {
            this.setIcon(iconOpgepakt);
        } else {
            this.setIcon(iconSleutel);
        }
    }

    @Override
    public boolean loopBaar() {
        return true;
    }

    @Override
    public int getSleutelNr() {
        opgepakt = true;
        showMe();
        return sleutelNr;
    }

    @Override
    public int getBarricadeNr() {
        return 0;
    }
}
