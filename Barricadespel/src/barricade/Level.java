/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barricade;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author W. Kuik
 */
public class Level extends JFrame{
    private int aantalRijen;
    private Vak[][] vak;
    private JPanel panel;
    private final int SIZE = 50;
    
    public Level(int levelNr, int aantalRijen){
        this.aantalRijen = aantalRijen;
        
        laadLevel(levelNr);
        maakLevel();
        initComponents();
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
    
    private void initComponents() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(400, 400);
      panel = new JPanel();
      panel.setLayout(null);
      this.add(panel);

      for (int i = 0; i < this.aantalRijen; i++)
          plaatsRij(i);
    }
    
    private void maakLevel() {
    vak = new Vak[aantalRijen][aantalRijen];
        for (int rij = 0; rij < aantalRijen; rij++) {
            for (int kolom = 0; kolom < aantalRijen; kolom++) {
                vak[rij][kolom] = new Vak(this);
            }
        }
    }
    
    private void plaatsRij(int rij) {
        for (int i = 0; i < this.aantalRijen; i++) {
            panel.add(vak[rij][i]);
            vak[rij][i].setSize(SIZE, SIZE);
            vak[rij][i].setLocation(SIZE * i, SIZE * rij);
        }
    }
}
