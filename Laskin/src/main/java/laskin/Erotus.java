/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author mclipsan
 */
public class Erotus implements Komento{
    
    TextField tuloskentta;
    TextField syotekentta;
    Sovelluslogiikka sovellus;
    private Button nollaa;
    private Button undo;
    private int edellinen=0;
    
    public Erotus(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus){
        this.tuloskentta=tuloskentta;
        this.syotekentta=syotekentta;
        this.sovellus = sovellus;
        this.undo=undo;
        this.nollaa=nollaa;
    }

    @Override
    public void suorita() {
        int arvo = sovellus.getArvo(syotekentta);
        int tulos = sovellus.getTulos();
        edellinen = tulos;
        tulos -= arvo;
        syotekentta.setText("");
        tuloskentta.setText("" + tulos);
        sovellus.setTulos(tulos);
        if (tulos==0) {
            nollaa.disableProperty().set(true);
        } else {
            nollaa.disableProperty().set(false);
        }
        undo.disableProperty().set(false);
    }

    @Override
    public void peru(){
        syotekentta.setText("");
        tuloskentta.setText("" + edellinen);
        sovellus.setTulos(edellinen);
        if (edellinen==0) {
            nollaa.disableProperty().set(true);
        } else {
            nollaa.disableProperty().set(false);
        }
        undo.disableProperty().set(false);
    }
}
