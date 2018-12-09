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
public class Nollaa implements Komento{
    TextField tuloskentta;
    TextField syotekentta;
    Sovelluslogiikka sovellus;
    private Button nollaa;
            
    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus){
        this.tuloskentta=tuloskentta;
        this.syotekentta=syotekentta;
        this.sovellus = sovellus;
        this.nollaa=nollaa;
    }

    @Override
    public void suorita() {
        sovellus.setTulos(0);
        syotekentta.setText("");
        tuloskentta.setText("" + 0);
        nollaa.disableProperty().set(true);
    }

    @Override
    public void peru() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
