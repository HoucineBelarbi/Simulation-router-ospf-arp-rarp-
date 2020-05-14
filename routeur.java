/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routour;
import java.lang.*;
/**
 *
 * @author Hocine
 */
public class routeur {

    public String getNom() {
        return Nom;
    }

    public String getAdressIP01() {
        return AdressIP01;
    }

    public String getAdressIP02() {
        return AdressIP02;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setAdressIP01(String AdressIP01) {
        this.AdressIP01 = AdressIP01;
    }

    public void setAdressIP02(String AdressIP02) {
        this.AdressIP02 = AdressIP02;
    }
    
    private String Nom;
    private String AdressIP01;
    private String AdressIP02;

    public String getAdressIP03() {
        return AdressIP03;
    }
    private String AdressIP03;

    public void setAdressIP03(String AdressIP03) {
        this.AdressIP03 = AdressIP03;
    }

    
}
