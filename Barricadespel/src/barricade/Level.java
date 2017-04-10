/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barricade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author frank
 */
public class Level extends JFrame {

    private int aantalRijen;
    private Vak[][] vak;
    private JPanel panel;
    private final int SIZE = 50;
    private Speler speler;
    private int levelNr = 1;
    private ArrayList<String> Levels = new ArrayList();
    private JLabel labelSleutel = new JLabel();
    private Icon leegVakicon;

    /**
     * Constructor level.
     *
     * @param levelNr
     * @param aantalRijen
     */
    public Level(int levelNr, int aantalRijen) {
        this.aantalRijen = aantalRijen;
        this.levelNr = levelNr;
        laadLevel(levelNr);
        initComponents();
        this.addKeyListener(new arrowListener());
    }

    /**
     * Plaatst alle componenten op de form
     *
     */
    private void initComponents() {
        int locatie = 530;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(850, 550);
        this.setResizable(false);
        panel = new JPanel();
        panel.setLayout(null);

        JLabel levelNummer = new JLabel();
        levelNummer.setText("LEVEL " + this.levelNr);
        levelNummer.setSize(100, SIZE);
        levelNummer.setLocation(locatie, 10);
        this.add(levelNummer);

        labelSleutel.setText("SLEUTEL: " + "000");
        labelSleutel.setSize(100, SIZE);
        labelSleutel.setLocation(locatie, 30);
        this.add(labelSleutel);

        JLabel LabelTurtorial1 = new JLabel();
        LabelTurtorial1.setText("Gebruik de pijltjes toetsen om te spelen.");
        LabelTurtorial1.setSize(300, SIZE);
        LabelTurtorial1.setLocation(locatie, 70);
        this.add(LabelTurtorial1);

        JLabel LabelTurtorial2 = new JLabel();
        LabelTurtorial2.setText("Probeer bij het groene vakje te komen.");
        LabelTurtorial2.setSize(300, SIZE);
        LabelTurtorial2.setLocation(locatie, 90);
        this.add(LabelTurtorial2);

        JButton resetButton = new JButton();
        resetButton.addActionListener(new ClickListener());
        resetButton.setSize(280, 50);
        resetButton.setLocation(locatie, 450);
        resetButton.setText("RESET");
        resetButton.setFocusable(false);
        panel.add(resetButton);

        JLabel labelLevel = new JLabel();
        labelLevel.setText("LEVELS:");
        labelLevel.setSize(SIZE, SIZE);
        labelLevel.setLocation(locatie, 150);
        this.add(labelLevel);

        for (int i = 0; i < this.Levels.size(); i++) {
            plaatsButton(locatie, i);
            locatie += 70;
        }

        this.add(panel);

        for (int i = 0; i < this.aantalRijen; i++) {
            plaatsRij(i);
        }

        this.leegVakicon = new ImageIcon(getClass().getResource("images/Vak.png"));
    }

    /**
     * Haald de levels op.
     *
     */
    private void laadLevel(int levelNr) {
        //v is een leeg vakje
        //s is een speler
        //m is een muur
        //1 is een baricade met nummer 1
        //2 is een baricade met nummer 2
        //3 is een baricade met nummer 3
        //4 is een baricade met nummer 4
        //5 is een baricade met nummer 5
        //6 is een sleutel met nummer 1
        //7 is een sleutel met nummer 2
        //8 is een sleutel met nummer 3
        //9 is een sleutel met nummer 4
        //0 is een sleutel met nummer 5
        //f is finish

        this.Levels.add("sm1vvvv555vvvv68v555vv1vvvv336vm1vvvv555vm11mmm515v21vvvm15vvm1mm3mmvvvm1551vvvv7m15vvvmvvvm15vvvmvf");
        this.Levels.add("mmm1svv555vvvv68v555vv1vvvv336vm1vvvv555vm11mmm515v21vvvm15vvm1mm3mmvvvm1551vvvv7m15vvvmvvvm15vvvmvf");
        this.Levels.add("sv1vvvv555vvvv68v555vv1vvvv336vm1vvvv555vm11mmm515v21vvvm15vvm1mm3mmvvvm1551vvvv7m15vvvmvvvm15vvvmvf");
        this.Levels.add("mmm7mvvvmfm8m3mvmvmvmv1vm0mvm5mvmmmmmvmvmvv9mmmvmvmvmvmvvvvvmvmv2vmmmvmvmmmmv8m6svv4vmvmmvmmmm6mvv1v");

        if (levelNr - 1 < 0 || levelNr > this.Levels.size()) {
            levelNr = 1;
        }

        maakLevel(Levels.get(levelNr - 1));
    }

    /**
     * Checked of het vak loopbaar is.
     *
     * @param rij
     * @param kolom
     * @return
     */
    public boolean checkVak(int kolom, int rij) {
        if ((rij > -1 && rij < 10) && (kolom > -1 && kolom < 10)) {
            return vak[rij][kolom].loopBaar(speler);
        } else {
            return false;
        }
    }

    /**
     * Maakt een knop aan.
     *
     */
    private void plaatsButton(int locatie, int i) {
        JButton button = new JButton();
        button.addActionListener(new ClickListener());
        button.setSize(SIZE, SIZE);
        button.setLocation(locatie, 200);
        button.setText(String.valueOf(i + 1));
        button.setFocusable(false);
        panel.add(button);
    }

    /**
     * Sorteerd de String en bouwt het level.
     *
     */
    private void maakLevel(String Layout) {
        vak = new Vak[aantalRijen][aantalRijen];
        int i = 0;
        for (int rij = 0; rij < aantalRijen; rij++) {
            for (int kolom = 0; kolom < aantalRijen; kolom++) {
                if (i < Layout.length()) {
                    char soort = Layout.charAt(i);
                    switch (soort) {
                        case 'v':
                            vak[rij][kolom] = new Vak(this);
                            break;
                        case 'm':
                            vak[rij][kolom] = new Muur(this);
                            break;
                        case 'f':
                            vak[rij][kolom] = new Finish(this);
                            break;
                        case 's':
                            this.speler = new Speler(rij, kolom);
                            ImageIcon icon = new ImageIcon(getClass().getResource("images/SpelerBeneden.png"));
                            vak[rij][kolom] = new Vak(this);
                            vak[rij][kolom].setIcon(icon);
                            break;
                        case '1':
                            vak[rij][kolom] = new Barricade(this, 1);
                            break;
                        case '2':
                            vak[rij][kolom] = new Barricade(this, 2);
                            break;
                        case '3':
                            vak[rij][kolom] = new Barricade(this, 3);
                            break;
                        case '4':
                            vak[rij][kolom] = new Barricade(this, 4);
                            break;
                        case '5':
                            vak[rij][kolom] = new Barricade(this, 5);
                            break;
                        case '6':
                            vak[rij][kolom] = new Sleutel(this, 1);
                            break;
                        case '7':
                            vak[rij][kolom] = new Sleutel(this, 2);
                            break;
                        case '8':
                            vak[rij][kolom] = new Sleutel(this, 3);
                            break;
                        case '9':
                            vak[rij][kolom] = new Sleutel(this, 4);
                            break;
                        case '0':
                            vak[rij][kolom] = new Sleutel(this, 5);
                            break;
                        default:
                            vak[rij][kolom] = new Vak(this);
                            break;
                    }
                }
                i++;
            }
        }
    }

    /**
     * Update sleutel label
     *
     */
    private void updateSleutel(Speler speler) {
        this.labelSleutel.setText("SLEUTEL: " + String.valueOf(speler.getSleutel()) + "00");
    }

    /**
     * Checked of de speler het level heeft gehaald.
     *
     */
    private void checkWinnaar(Speler speler) {
        if (vak[speler.getPosHorizontaal()][speler.getPosVerticaal()] instanceof Finish) {

            if (this.levelNr + 1 > this.Levels.size()) {
                this.levelNr = 0;
            }

            Level levelNieuw = new Level(this.levelNr + 1, 10);
            levelNieuw.setVisible(true);
            this.dispose();
        }
    }

    /**
     * Plaatst een rij.
     *
     */
    private void plaatsRij(int rij) {
        for (int i = 0; i < this.aantalRijen; i++) {
            panel.add(vak[rij][i]);
            vak[rij][i].setSize(SIZE, SIZE);
            vak[rij][i].setLocation(SIZE * i, SIZE * rij);
        }
    }

    /**
     * Speler plaats naar links.
     *
     */
    private void moveLeft() {
        if (checkVak(speler.getPosHorizontaal() - 1, speler.getPosVerticaal())) {
            this.vak[speler.getPosVerticaal()][speler.getPosHorizontaal()].setIcon(this.leegVakicon);
            speler.StapLinks();
            this.vak[speler.getPosVerticaal()][speler.getPosHorizontaal()].showIcon(speler.getIcon());
            checkWinnaar(speler);
            updateSleutel(speler);
        }
    }

    /**
     * Speler plaats naar boven
     *
     */
    private void moveUp() {
        if (checkVak(speler.getPosHorizontaal(), speler.getPosVerticaal() - 1)) {
            this.vak[speler.getPosVerticaal()][speler.getPosHorizontaal()].setIcon(this.leegVakicon);
            speler.StapBoven();
            this.vak[speler.getPosVerticaal()][speler.getPosHorizontaal()].showIcon(speler.getIcon());
            checkWinnaar(speler);
            updateSleutel(speler);
        }
    }

    /**
     * Speler plaats naar rechts.
     *
     */
    private void moveRight() {
        if (checkVak(speler.getPosHorizontaal() + 1, speler.getPosVerticaal())) {
            this.vak[speler.getPosVerticaal()][speler.getPosHorizontaal()].setIcon(this.leegVakicon);
            speler.StapRechts();
            this.vak[speler.getPosVerticaal()][speler.getPosHorizontaal()].showIcon(speler.getIcon());
            checkWinnaar(speler);
            updateSleutel(speler);
        }
    }

    /**
     * Speler plaats naar beneden.
     *
     */
    private void moveDown() {
        if (checkVak(speler.getPosHorizontaal(), speler.getPosVerticaal() + 1)) {
            this.vak[speler.getPosVerticaal()][speler.getPosHorizontaal()].setIcon(this.leegVakicon);
            speler.StapBeneden();
            this.vak[speler.getPosVerticaal()][speler.getPosHorizontaal()].showIcon(speler.getIcon());
            checkWinnaar(speler);
            updateSleutel(speler);
        }
    }

    /**
     * Keylistener voor pijltjes.
     *
     */
    class arrowListener implements KeyListener {

        @Override
        public void keyReleased(KeyEvent e) {
            switch (e.getKeyCode()) {
                case 37: //links
                    moveLeft();  
                    break;
                case 38: // omhoog
                    moveUp();
                    break;
                case 39: //rechts
                    moveRight();
                    break;
                case 40: //beneden
                    moveDown();
                    break;
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {
            //wordt niet gebruikt
        }

        @Override
        public void keyPressed(KeyEvent e) {
            //wordt niet gebruikt
        }
    }

    /**
     * Listener voor kliks.
     *
     */
    class ClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!e.getActionCommand().equals("RESET")) {
                startLevel(Integer.parseInt(e.getActionCommand()));
            } else {
                startLevel();
            }
        }
    }

    /**
     * Start een nieuw level.
     *
     * @param levelNr
     */
    public void startLevel(int levelNr) {
        Level levelNieuw = new Level(levelNr, 10);
        levelNieuw.setVisible(true);
        this.dispose();
    }

    /**
     * Reset het huidige level.
     */
    public void startLevel() {
        Level levelNieuw = new Level(this.levelNr, 10);
        levelNieuw.setVisible(true);
        this.dispose();
    }
}
