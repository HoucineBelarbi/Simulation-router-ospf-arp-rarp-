/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routour;
import java.lang.*;
import java.util.*;

/**
 *
 * @author Hocine
 */
public class Machine {
    
    private String Nom;
    private String IpAdress;
    static private String AdressMAC;

    public String getRouter() {
        return router;
    }

    public void setRouter(String router) {
        this.router = router;
    }

    public HashMap<String, String> getTableArp() {
        return TableArp;
    }

    public void setTableArp(HashMap<String, String> TableArp) {
        this.TableArp = TableArp;
    }
    private String router;

    public String getAdressMAC() {
        return AdressMAC;
    }

   
    private String Pasrelle;
    public  HashMap<String, String> TableArp = new HashMap<String, String>();
    
 

       public  void addrowtotableArp(String Source,String Distination) {
        this.TableArp.put(Source, Distination);
    }
    
      private void afficheSeparateur(int n) 
    {
        int i;
        for (i = 0; i < n; i++)
          System.out.print("+-----------------");
        System.out.println("+");
      }
    public  void showtableArp() 
    {
            System.out.println("\n| internet Adress | Physical Adrees |     type       `|");
                afficheSeparateur(3);
              for (String Key: this.TableArp.keySet())
              {
                  System.out.println("|   "+Key+"   | "+this.TableArp.get(Key)+"  |   Static        ");
              } 
             System.out.println("|\n");
             afficheSeparateur(3);
          }
    
   
    public String getAdressMAc() {
        return AdressMAc;
    }

    public void setAdressMAc(String AdressMAc) {
        this.AdressMAc = AdressMAc;
    }
    private String AdressMAc;

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setIpAdress(String IpAdress) {
        this.IpAdress = IpAdress;
    }

    public void setPasrelle(String Pasrelle) {
        this.Pasrelle = Pasrelle;
    }

    public String getNom() {
        return Nom;
    }

   

    public String getIpAdress() {
        return IpAdress;
    }

    public String getPasrelle() {
        return Pasrelle;
    }
    
    
    
    
    
}
