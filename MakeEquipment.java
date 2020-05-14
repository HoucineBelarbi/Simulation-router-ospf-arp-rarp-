/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routour;
import java.util.*;

import static routour.AdressIP.isValidInet4Address;
/**
 *
 * @author Hocine
 */
public class MakeEquipment {
   routeur[] Listrouter=new routeur[0];

    public int getIdeniferMachine() {
        return ideniferMachine;
    }
    public boolean isinteger(String text) {
    try {
      Integer.parseInt(text);
      return true;
    } catch (NumberFormatException e) {
     return false;
     } 
    }
    public void setIdeniferMachine(int ideniferMachine) {
        this.ideniferMachine = ideniferMachine;
    }

    public int getIdeniferrouter() {
        return ideniferrouter;
    }

    public void setIdeniferrouter(int ideniferrouter) {
        this.ideniferrouter = ideniferrouter;
    }
   private int ideniferMachine;
   private int ideniferrouter;
   private String Emeteur;
   private String Recepteur;
   public  Graph.Edge[] GRAPH={};

    public Graph.Edge[] getGRAPH() {
        return GRAPH;
    }

    public void setGRAPH(Graph.Edge[] GRAPH) {
        this.GRAPH = GRAPH;
    }

    public String getMACEmeteur() {
        return MACEmeteur;
    }

    public void setMACEmeteur(String MACEmeteur) {
        this.MACEmeteur = MACEmeteur;
    }

    public String getMACRecepteur() {
        return MACRecepteur;
    }

    public void setMACRecepteur(String MACRecepteur) {
        this.MACRecepteur = MACRecepteur;
    }
   private String MACEmeteur;
   private String MACRecepteur;
   

    public String getEmeteur() {
        return Emeteur;
    }

    public void setEmeteur(String Emeteur) {
        this.Emeteur = Emeteur;
    }

    public String getRecepteur() {
        return Recepteur;
    }

    public void setRecepteur(String Recepteur) {
        this.Recepteur = Recepteur;
    }
    public Machine[] getListmachine() {
        return Listmachine;
    }
    Machine[] Listmachine=new Machine[0];

    public routeur[] getListrouter() {
        return Listrouter;
    }

    public void setListrouter(routeur[] Listrouter) {
        this.Listrouter = Listrouter;
    }

    public paquet[] getListpaquet() {
        return listpaquet;
    }

    public void setListpaquet(paquet[] listpaquet) {
        this.listpaquet = listpaquet;
    }
    paquet[] listpaquet=new paquet[0];
   
    public routeur[] getListRouter() {
        return Listrouter;
    }
    
   
   
     public void createRouter(){   
       Scanner sc= new Scanner(System.in); 
       System.out.print("\ndonner le nombre de routeur:");
        String tes=sc.nextLine();
        while (!this.isinteger(tes))
        {
        System.out.print("\ndonner le nombre de routeur:");
        tes=sc.nextLine(); 
        }
        int nbrRouteur=Integer.valueOf(tes);
        routeur[] ListRouter=new routeur[nbrRouteur];
        String IpAdress;

       for (int pos=1;pos<ListRouter.length+1;pos++)
        {
        System.out.println("\n---------------------------");
        ListRouter[pos-1] =new routeur();
        System.out.print("N°"+pos+")nom de routeur: ");
        ListRouter[pos-1].setNom(sc.next());
        
        System.out.print("N°"+pos+")"+ListRouter[pos-1].getNom()+">:Adress ip de l'inteface01:");
        IpAdress=sc.next();
        while(!isValidInet4Address(IpAdress))
        {
        System.out.println("The IP address " + IpAdress + " is not valid\n");
        System.out.print("N°"+pos+")"+ListRouter[pos-1].getNom()+">:Adress ip de l'inteface01:");
        IpAdress=sc.next();
        }
        ListRouter[pos-1].setAdressIP01(IpAdress);
        
        
        System.out.print("N°"+pos+")"+ListRouter[pos-1].getNom()+">" + "Adress ip de l'inteface02: ");
        IpAdress=sc.next();
        while(!isValidInet4Address(IpAdress))
        {
        System.out.println("The IP address " + IpAdress + " is not valid\n");
        System.out.print("N°"+pos+")"+ListRouter[pos-1].getNom()+">" + "Adress ip de l'inteface02: ");
        IpAdress=sc.next();
        }
        ListRouter[pos-1].setAdressIP02(IpAdress);
        
        
        System.out.print("N°"+pos+")"+ListRouter[pos-1].getNom()+">" + "Adress ip de l'inteface03: ");
        IpAdress=sc.next();
        while(!isValidInet4Address(IpAdress))
        {
        System.out.println("The IP address " + IpAdress + " is not valid\n");
        System.out.print("N°"+pos+")"+ListRouter[pos-1].getNom()+">" + "Adress ip de l'inteface03: ");
        IpAdress=sc.next();
        }
        
        ListRouter[pos-1].setAdressIP03(IpAdress);
        }
       System.out.print("la configuration de(s) Router est terminer. ");
       System.out.print("\nReseau> ");
     this.Listrouter=ListRouter;
       
    }
     
        private static  Graph.Edge[] pushpath( Graph.Edge[] array,Graph.Edge value) {
         Graph.Edge[] result = Arrays.copyOf(array, array.length + 1);
         result[array.length] =  value;
         return result;
          }
    public Graph.Edge[] association()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("\nAssociation between: ");
        if(Listrouter.length>1)
        {
        String start=this.getnamerouter("betwen: ");
        String end=this.getnamerouter("and: ");
        this.setGRAPH(pushpath( this.getGRAPH(),new Graph.Edge(start, end, 1)));
        this.setGRAPH(pushpath( this.getGRAPH(),new Graph.Edge(end, start, 1)));
        System.out.print("connection("+start+","+end+") added");
        }
        else 
        {
         System.out.print("\nthere is no Routers ");   
        }
       return GRAPH;
    }  
     
      public void createMachine()
     {
        Scanner sc= new Scanner(System.in);
        System.out.print("\ndonner le nombre des Machines:");
        String tes=sc.nextLine();
        while (!this.isinteger(tes))
        {
       System.out.print("\ndonner le nombre des Machines:");
        tes=sc.nextLine(); 
        }
        int nbrMachine=Integer.valueOf(tes);
        Machine[] ListMachine=new Machine[nbrMachine];
        AdressIP config=new AdressIP();
         String IpAdress;
        for (int pos=1;pos<ListMachine.length+1;pos++)
        {
        System.out.println("\n---------------------------");
        ListMachine[pos-1] =new Machine();
        System.out.print("N°"+pos+") nom de Machine: ");
        ListMachine[pos-1].setNom(sc.next());
        
        System.out.print("N°"+pos+") "+ListMachine[pos-1].getNom()+">:Adress ip:");
        IpAdress=sc.next();
        while(!isValidInet4Address(IpAdress))
        {
        System.out.println("The IP address " + IpAdress + " is not valid\n");
        System.out.print("N°"+pos+") "+ListMachine[pos-1].getNom()+">:Adress ip:");
        IpAdress=sc.next();
        }
        ListMachine[pos-1].setIpAdress(IpAdress);
        String macadres=config.randomMACAddress();
        ListMachine[pos-1].setAdressMAc(macadres);
        ListMachine[pos-1].addrowtotableArp(IpAdress, macadres);
        
        System.out.print("N°"+pos+") "+ListMachine[pos-1].getNom()+">" + "Adresse ip de la passerelle: ");
        IpAdress=sc.next();
        while(!isValidInet4Address(IpAdress))
        {
        System.out.println("The IP address " + IpAdress + " is not valid\n");
        System.out.print("N°"+pos+") "+ListMachine[pos-1].getNom()+">" + "Adresse ip de la passerelle: ");
        IpAdress=sc.next();
        }
        ListMachine[pos-1].setPasrelle(IpAdress);
        
       /* System.out.print("N°"+pos+") "+ListMachine[pos-1].getNom()+">" +"Connected with the router:");
         tes=sc.next();
         while (!this.isinteger(tes))
        {
        System.out.print("N°"+pos+") "+ListMachine[pos-1].getNom()+">" +"Connected with the router:");
        tes=sc.nextLine(); 
        }*/
            if(Listrouter.length>0)
            { 
            String router=this.getnamerouter("N°"+pos+") "+ListMachine[pos-1].getNom()+">" +"Connected with the router:");
            ListMachine[pos-1].setRouter(router);    
            //random mac adress
            }
        }
        
        System.out.print("la configuration de(s) Machine (s) est terminer. ");
       System.out.print("\nReseau> ");
       this.Listmachine=ListMachine;
     }
   
   public void showlistrouter()
   {
       for (int pos=1;pos<Listrouter.length+1;pos++)
        {
        System.out.println("\n---------------------------");
        System.out.println("routeur N°("+pos+")\n"+Listrouter[pos-1].getNom()+":");
        System.out.println("l'interface01:" +Listrouter[pos-1].getAdressIP01());
        System.out.println("l'inteface02: "+Listrouter[pos-1].getAdressIP02());
        System.out.println("l'inteface03: "+Listrouter[pos-1].getAdressIP03());
        System.out.println("---------------------------\n");
        }
    System.out.print("\nReseau> ");
   }
  private static paquet[] push(paquet[] array, paquet value) {
    paquet[] result = Arrays.copyOf(array, array.length + 1);
    result[array.length] = value;
    return result;
}
   public void createpaquet(String IPsource,String IPdistination,String MacSource,String MacDistination,String protocole,String Typemessage)
   {
      paquet paquet=new paquet();
      paquet.setAdressIPSource(IPsource);
      paquet.setAdressIPDistnation(IPdistination);
      paquet.setAdressMacSource(MacSource);
      paquet.setAdressMACDistnation(MacDistination);
      paquet.setTypedemessage(Typemessage);
      paquet.setProtocole(protocole);
      
      this.listpaquet=push(this.listpaquet,paquet);
   }
   
    public void showlistmachine()
   {
       if(Listmachine.length>0)
       {
       for (int pos=1;pos<Listmachine.length+1;pos++)
        {
        System.out.println("\n---------------------------");
        System.out.println("Machine N°("+pos+")\n"+Listmachine[pos-1].getNom()+":");
        System.out.println("Ip Adress:" +Listmachine[pos-1].getIpAdress());
        System.out.println("passerelle: "+Listmachine[pos-1].getPasrelle());
        System.out.println("Adress MAC: "+Listmachine[pos-1].getAdressMAc());
        System.out.println("Router: "+Listmachine[pos-1].getRouter());
        System.out.print("---------------------------\n");
        }
       }
       else
       {
           System.out.println("there is no machine");    
       }
   }
   public void configarp()
   {
       Scanner sc= new Scanner(System.in);
       System.out.print("Arp>");
       String commande=sc.nextLine();
        while (!commande.equals("end"))
       {   
      if(commande.equals("show tables"))
              {
               for (int pos=1;pos<Listmachine.length+1;pos++)
                {
                System.out.println("\n---------------------------");
                System.out.println("Machine N°("+pos+")\n"+Listmachine[pos-1].getNom()+":");
                Listmachine[pos-1].showtableArp();
                System.out.println("---------------------------\n");
                }
              System.out.print("Arp>");
              }
      else if(this.isinteger(commande))
      {
          int Nummachine=Integer.valueOf(commande);
          if(Nummachine>Listmachine.length)
          {
             System.out.println("la machine n'existe pas\n");
          }
          else if(Nummachine>0)
          {
              
            System.out.println("---------------------------\n");
            Listmachine[Nummachine-1].showtableArp();             
            this.ideniferMachine=Nummachine-1;
           System.out.print("Arp> ");
           }
      }  
      else if(commande.equals("show names machine") )
           {
            System.out.println("Listmachine.length is\n"+Listmachine.length);
            System.out.println("---------------------------\n");
           for (int pos=1;pos<Listmachine.length+1;pos++)
              {
              System.out.println("\n-----------list des machine ----------------");
              System.out.println("Machine N°("+pos+") id:"+Listmachine[pos-1].getNom()+":");              
              } 
            System.out.print("Arp> ");
               }
      else if(commande.equals("clear tables"))
      {
        
        this.cleartable_arp_all();
        System.out.print("\nArp>");  
      }
       else if(commande.equals("clear table"))
      {
          int machine=getmachine("Quelle est la machine que vous souhaitez supprimer sa table d'ARp ?: ");    
          this.cleartable_arp(machine);
          System.out.print("\nArp>");
      }
      else if(commande.equals("help") )
           {
               System.out.println("help:\n"
                       + "show tables: afficher les la table de ARP."
                       + "\n<number of machine> : ajouter une ligne arp"
                       + "\"show names machine: afficher les noms et identifient des machines.\""
                       + "\"clear table: supprimer le contenu d'un seul table.\""
                       + "\"clear tables: supprimer le contenu de tous les tables.\""
                     + "\nend : fermer la configuation de protocole arp");
             System.out.print("Arp>");
           }
           
      else
           {
           System.out.println(commande+" n’est pas reconnu en tant que commande interne");
           System.out.print("Arp>");

           }
      commande=sc.nextLine();
       }
            System.out.println(commande+" terminer protcole ARP");

      } 
   
   public void arp_request()
   {
       if(Listmachine.length>0)
       {
       int Emeteur=this.getmachine("ping ARp#> from:");
       int Recepteur=this.getmachine("ping ARp#> to:");
       String EmeteurIP=Listmachine[Emeteur].getIpAdress();
       String RecepteurIP=Listmachine[Recepteur].getIpAdress();
       String MACEmeteurIP=Listmachine[Emeteur].getAdressMAc();
       String MACRecepteurIP=Listmachine[Recepteur].getAdressMAc();
       this.createpaquet(EmeteurIP,RecepteurIP,MACEmeteurIP,"ff-ff-ff-ff-ff-ff","ARP","ARP Request");
       
       if(!Listmachine[Emeteur].TableArp.containsValue(MACRecepteurIP))
       {
            Listmachine[Emeteur].addrowtotableArp(RecepteurIP, "ff-ff-ff-ff-ff-ff");
            //String IPsource,String IPdistination,String MacSource,String MacDistination,String protocole,String Typemessage
       }
      
       Listmachine[Recepteur].addrowtotableArp(EmeteurIP, MACEmeteurIP);
       Graph.Edge[] GRAPH=this.getGRAPH();
       Graph g =new Graph(GRAPH);
             g.dijkstra(Listmachine[Emeteur].getRouter());
             g.printPath(Listmachine[Recepteur].getRouter()); 
       }
       else
       {
        System.out.print("Reseau>there is no machine\n");

       }
   }
    public void afficheSeparateur(int n) 
    {
        int i;
        for (i = 0; i < n; i++)
          System.out.print("+----------------");
        System.out.println("+");
      }
     public void showpaquet(int i)
    { 
     if(i>=0 && i<this.listpaquet.length)
        {
         System.out.println("\n|    Ipsource   | IPistination  |   MacSource   | MacDistination`|   protocole` |  TypeDemessage`|");
                afficheSeparateur(6);             
                  System.out.println("|    "+this.listpaquet[i].getAdressIPSource()+"    |    "+this.listpaquet[i].getAdressIPDistnation()+
                          "   |    "+this.listpaquet[i].getAdressMacSource()+"  | "
                                  + this.listpaquet[i].getAdressMACDistnation()+"   |   "+this.listpaquet[i].getProtocole()+"   |   "
                                          + this.listpaquet[i].getTypedemessage());
               
             System.out.println("|\n");
             afficheSeparateur(6);
        }
     else
            {
                System.out.print("there is no paquet\n");
            }
    }
    public void showlistpaquet(int i)
    {
              for (i=0;i<this.listpaquet.length;i++)
              {
                 this.showpaquet(i);
              } 
         
    }
    public void cleartable_arp_all()
   {
      for(int i=0;i<Listmachine.length;i++)
      {
          this.cleartable_arp(i);
      }
   }
   
   public void cleartable_arp(int machine)
   {
       if(machine>=0)
       {
      String AdressMac=this.Listmachine[machine].TableArp.entrySet().stream().findFirst().get().getValue();;
      String Adresspip=this.Listmachine[machine].TableArp.entrySet().stream().findFirst().get().getKey();
       System.out.println("adress:"+Adresspip+" adress mach: "+AdressMac);
       
      Listmachine[machine].TableArp.clear();
     
      Listmachine[machine].addrowtotableArp(Adresspip, AdressMac);
      System.out.print("machine ("+machine+1+") is cleared");
       }
       else
       {
           System.out.println("there is no machine");
       }
   }
   public void rarp_request()
   {
       if(Listmachine.length>0)
       {
       int Emeteur=this.getmachine("ping ARp#> from:");
       int Recepteur=this.getmachine("ping ARp#> to:");
       String EmeteurIP=Listmachine[Emeteur].getIpAdress();
       String RecepteurIP=Listmachine[Recepteur].getIpAdress();
       String MACEmeteurIP=Listmachine[Emeteur].getAdressMAc();
       String MACRecepteurIP=Listmachine[Recepteur].getAdressMAc();
       Listmachine[Recepteur].addrowtotableArp(EmeteurIP, MACEmeteurIP);
       this.createpaquet(EmeteurIP,"255.255.255.255",MACEmeteurIP,MACRecepteurIP,"RARP","RARP Request");
       if(!Listmachine[Emeteur].TableArp.containsKey(RecepteurIP))
       {
           Listmachine[Emeteur].addrowtotableArp("255.255.255.255", MACEmeteurIP);
       Graph.Edge[] GRAPH=this.getGRAPH();
       Graph g =new Graph(GRAPH);
             g.dijkstra(Listmachine[Emeteur].getRouter());
             g.printPath(Listmachine[Recepteur].getRouter()); 
       }
     
       }
       
       else
       {
        System.out.print("Reseau>there is no machine\n");

       }
       
   }
   
   public void arp_replay()
   {
       
       if(Listmachine.length>0)
       {
       int Emeteur=this.getmachine("ping ARp#> from:");
       int Recepteur=this.getmachine("ping ARp#> to:");
       String EmeteurIP=Listmachine[Emeteur].getIpAdress();
       String RecepteurIP=Listmachine[Recepteur].getIpAdress();
       String MACEmeteurIP=Listmachine[Emeteur].getAdressMAc();
       String MACRecepteurIP=Listmachine[Recepteur].getAdressMAc();
       Listmachine[Emeteur].TableArp.remove(RecepteurIP);
       Listmachine[Emeteur].addrowtotableArp(RecepteurIP, MACRecepteurIP);
      this.createpaquet(RecepteurIP,EmeteurIP,MACRecepteurIP,MACEmeteurIP,"ARP","ARP Replay");
       Graph.Edge[] GRAPH=this.getGRAPH();
       Graph g =new Graph(GRAPH);
             g.dijkstra(Listmachine[Recepteur].getRouter());
             g.printPath(Listmachine[Emeteur].getRouter()); 
       }
       else
       {
        System.out.print("Reseau>there is no machine\n");
       }
       
   }
   public void rarp_replay()
   {
       if(Listmachine.length>0)
       {
       int Emeteur=this.getmachine("ping ARp#> from:");
       int Recepteur=this.getmachine("ping ARp#> to:");
       String EmeteurIP=Listmachine[Emeteur].getIpAdress();
       String RecepteurIP=Listmachine[Recepteur].getIpAdress();
       String MACEmeteurIP=Listmachine[Emeteur].getAdressMAc();
       String MACRecepteurIP=Listmachine[Recepteur].getAdressMAc();
       Listmachine[Emeteur].addrowtotableArp(RecepteurIP, MACRecepteurIP);
       this.createpaquet(RecepteurIP,RecepteurIP,MACRecepteurIP,MACEmeteurIP,"RARP","RARP Replay");
       Graph.Edge[] GRAPH=this.getGRAPH();
       Graph g =new Graph(GRAPH);
             g.dijkstra(Listmachine[Recepteur].getRouter());
             g.printPath(Listmachine[Emeteur].getRouter()); 
       }
       else
       {
        System.out.print("Reseau>there is no machine\n");

       }
   }
   public int getmachine(String output)
   {
       Scanner sc= new Scanner(System.in); 
       boolean next=false;
       String com=null;
        while(!next)
        {     
            System.out.print(output);
            com=sc.nextLine();
            if(this.isinteger(com))
            {
              if(Integer.valueOf(com)-1<=Listmachine.length-1)
              {
                next=true;  
              }
            }
        }
        
        return Integer.valueOf(com)-1;
        
   }
   
    public String getnamerouter(String output)
   {
       Scanner sc= new Scanner(System.in); 
       boolean next=false;
       String com=null;
        while(!next)
        {     
            System.out.print(output);
            com=sc.nextLine();
            if(this.isinteger(com))
            {
              if(Integer.valueOf(com)>0 &&Integer.valueOf(com)-1<=Listrouter.length-1)
              {
                next=true;
              }
              else
              {
              System.out.println("There is no router with this number " +this.isinteger(com)+"\n");
              }
            }
        }
        
        return Listrouter[Integer.valueOf(com)-1].getNom() ;
        
   }
   public int getpaquet(String output)
   {
       Scanner sc= new Scanner(System.in); 
       boolean next=false;
       String com=null;
        while(!next)
        {     
            System.out.print(output);
            com=sc.nextLine();
            if(this.isinteger(com))
            {
              if(Integer.valueOf(com)<=listpaquet.length)
              {
                next=true;  
              }
            }
           System.out.println("The number of existing paquet is "+listpaquet.length+"\n"); 
        }
        
        return Integer.valueOf(com);
        
   }
   
    
}
   

   
