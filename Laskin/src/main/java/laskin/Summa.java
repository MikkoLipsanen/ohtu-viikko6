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
public class Summa implements Komento{
    
    TextField tuloskentta;
    TextField syotekentta;
    Sovelluslogiikka sovellus;
    private Button nollaa;
    private Button undo;
            
    public Summa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus){
        this.tuloskentta=tuloskentta;
        this.syotekentta=syotekentta;
        this.sovellus = sovellus;
        this.nollaa = nollaa;
    }

    @Override
    public void suorita() {
        int arvo = sovellus.getArvo(syotekentta);
        int tulos = sovellus.getTulos();
        tulos += arvo;
        syotekentta.setText("");
        tuloskentta.setText("" + tulos);
        sovellus.setTulos(tulos);
        if (tulos==0) {
            nollaa.disableProperty().set(true);
        } else {
            nollaa.disableProperty().set(false);
        }
        //undo.disableProperty().set(false);
      
    }
        

    @Override
    public void peru() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
