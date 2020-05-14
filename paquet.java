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
public class paquet {

    public String getAdressIPSource() {
        return AdressIPSource;
    }

    public String getAdressIPDistnation() {
        return AdressIPDistnation;
    }

    public String getVersion() {
        return Version;
    }

    public String getLangeurDeTete() {
        return langeurDeTete;
    }

    public String getTypeDeservice() {
        return TypeDeservice;
    }

    public String getLongeurTotal() {
        return LongeurTotal;
    }

    public String getIdentification() {
        return identification;
    }

    public String getDrapeau() {
        return Drapeau;
    }

    public String getDeplacementFragment() {
        return DeplacementFragment;
    }

    public String getTempDeVie() {
        return TempDeVie;
    }

    public String getZoneDeContreulDerreu() {
        return ZoneDeContreulDerreu;
    }

    public String getAdressMacSource() {
        return AdressMacSource;
    }

    public String getAdressMACDistnation() {
        return AdressMACDistnation;
    }

    public void setAdressIPSource(String AdressIPSource) {
        this.AdressIPSource = AdressIPSource;
    }

    public void setAdressIPDistnation(String AdressIPDistnation) {
        this.AdressIPDistnation = AdressIPDistnation;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public void setLangeurDeTete(String langeurDeTete) {
        this.langeurDeTete = langeurDeTete;
    }

    public void setTypeDeservice(String TypeDeservice) {
        this.TypeDeservice = TypeDeservice;
    }

    public void setLongeurTotal(String LongeurTotal) {
        this.LongeurTotal = LongeurTotal;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public void setDrapeau(String Drapeau) {
        this.Drapeau = Drapeau;
    }

    public void setDeplacementFragment(String DeplacementFragment) {
        this.DeplacementFragment = DeplacementFragment;
    }

    public void setTempDeVie(String TempDeVie) {
        this.TempDeVie = TempDeVie;
    }

    public void setZoneDeContreulDerreu(String ZoneDeContreulDerreu) {
        this.ZoneDeContreulDerreu = ZoneDeContreulDerreu;
    }

    public void setAdressMacSource(String AdressMacSource) {
        this.AdressMacSource = AdressMacSource;
    }

    public void setAdressMACDistnation(String AdressMACDistnation) {
        this.AdressMACDistnation = AdressMACDistnation;
    }
    
    private String AdressIPSource;
    private String AdressIPDistnation;
    private String Version;
    private String langeurDeTete;
    private String TypeDeservice;
    private String LongeurTotal;
    private String identification;
    private String Drapeau;
    private String DeplacementFragment;
    private String TempDeVie;
    private String ZoneDeContreulDerreu;
    private String AdressMacSource;
    private String AdressMACDistnation;

    public String getProtocole() {
        return protocole;
    }

    public void setProtocole(String protocole) {
        this.protocole = protocole;
    }

    public String getTypedemessage() {
        return typedemessage;
    }

    public void setTypedemessage(String typedemessage) {
        this.typedemessage = typedemessage;
    }
    private String protocole;
    private String typedemessage;
    
    
}
