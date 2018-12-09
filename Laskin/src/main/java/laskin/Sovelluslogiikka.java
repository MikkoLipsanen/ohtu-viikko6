package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Sovelluslogiikka{
 
    private int tulos;
    private int arvo;
    
    public Sovelluslogiikka(){
        
    }
    
    public int getArvo(TextField syotekentta){
    
        try {
            arvo = Integer.parseInt(syotekentta.getText());
        } catch (Exception e) {
        }
        return arvo;
    }
 
    public int getTulos() {
        return tulos;
    }
    
    public void setTulos(int tulos){
        
        this.tulos = tulos;
    }

}