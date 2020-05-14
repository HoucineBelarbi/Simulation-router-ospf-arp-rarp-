/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routour;
import java.util.*;

/**
 *
 * @author Hocine
 */
public class work {
    private static final MakeEquipment env=new  MakeEquipment();
    public static final Machine m=new Machine();  
    public  final paquet paquet=new paquet();
     public  Graph.Edge[] GRAPH={};

    public void setGRAPH(Graph.Edge[] GRAPH) {
        this.GRAPH = GRAPH;
    }

    public  Graph.Edge[] getGRAPH() {
        return GRAPH;
    }
      
    public void Reseau()
    {
    Scanner sc= new Scanner(System.in);    
    System.out.print("Réseaun>");
    String Commande=sc.nextLine();
    Machine m=new Machine();  
while(!Commande.equals("exit")) 
{
    switch(Commande) {
        case "create router":
            env.createRouter(); 
          // code block
          break;
        case "show router":
            System.out.print("Reseau>");
            env.showlistrouter();
          // code block
          break;
        case "add connection":
            System.out.print("connection: ");
            Dijkstra dj=new Dijkstra();
            GRAPH = env.association(); 
            this.setGRAPH(GRAPH);
            System.out.print("\nReseau>");
            
          // code block
          break;
          case "show path":
             if(env.Listrouter.length>0)
             {
             System.out.print("\nAssociation between: ");
             String START = env.getnamerouter(" between:");
             String END = env.getnamerouter(" and:");
             Graph g =new Graph(env.GRAPH);
             g.dijkstra(START);
             g.printPath(END); 
             }
             else
             {
               System.out.println("there is no router: ");  
             }
             System.out.print("Réseau>"); 
        break;          
        case "show all path":
              if(env.Listrouter.length>0)
              {
              System.out.print("\nAssociation from: ");
              String START = env.getnamerouter(" from:");
              Graph g =new Graph(env.GRAPH);
              g.dijkstra(START);
              g.printAllPaths();
              }
              else
              {
                System.out.println("there is no router: ");  
              }
              System.out.print("Réseau>"); 
        break;  
         case "create machine":
            env.createMachine();
          // code block
          break;
        case "show machine":
        env.showlistmachine();
        System.out.print("Réseau>");
          // code block
          break;
        case "arp replay":
        env.setGRAPH(this.getGRAPH());
        env.arp_replay();
        System.out.print("Réseau>");
        // code block
        break;
        case "arp request":
        env.setGRAPH(this.getGRAPH());
        env.arp_request();
        System.out.print("Réseau>");
        break;
         case "rarp replay":
        env.setGRAPH(this.getGRAPH());           
        env.rarp_replay();
        System.out.print("Réseau>");
        // code block
        break;
        case "rarp request":
        env.setGRAPH(this.getGRAPH());
        env.rarp_request();
        System.out.print("Réseau>");
        break;
        case "show last paquet":
            env.showpaquet(env.listpaquet.length-1);
            System.out.print("Réseau>");
          // code block
          break;
          case "show last paquets":
            int numpaquet=env.getpaquet("Réseau>\nWhat is the last paquets you want to display?:");
            if(env.listpaquet.length-numpaquet>=0)
            {
            env.showlistpaquet(env.listpaquet.length-numpaquet);
            }
            else
            {
             System.out.print("The number of messages you want to display is more than possible\n");   
            }
            System.out.print("Réseau>");
          // code block
          break;
          case "show paquets":
            env.showlistpaquet(0);
            System.out.print("Réseau>");
          // code block
          break;
          case "config machine":
          this.configmachine();
          System.out.print("Réseau>");
          // code block
          break;
          case "arp protocole":
            env.configarp();
            System.out.print("Réseau>");
            break;
          case "help":
             System.out.println("help:\n"
                     + "create router: configurer les routers"
                     + "\nshow router: afficher les routers."
                     + "\ncreate machine: configurer les machines"
                     + "\nshow machine: afficher les machine"
                     + "\nconfig machine: configuration des machines"
                      + "\nconfig machine: configuration des machines"
                     + "\narp request; Envoyer un message de type arp"
                     + "\narp replay: reponce d'un message de type arp"
                     + "\nrarp request: envayer un message de type rarp"
                     + "\nrarp replay: reponce d'un message de type rarp"
                     + "\nshow last paquet: afficher la dernière paquet"
                     + "\nshow last paquets <nombre>: afficher les dernières paquets"
                     + "show paquets: afficher tous les paquets"
                     + "\nprotocole arp: configuration de protocole arp");
             System.out.print("Réseau>");
          // code block
          break;
        default:
            System.out.println(Commande+" n’est pas reconnu en tant que commande interne");
            System.out.print("Réseau>");
    // code block
       }
    Commande=sc.nextLine();  
        }   
    }
    
    public void configmachine()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Machine> ");
        String Commande=sc.nextLine();
        while(!Commande.equals("end")) 
        {
        switch(Commande) {
          case "add arp":
          System.out.print("machine>");
          
           m.addrowtotableArp("192.162.1.1", "               ");
          // code block
          break;
           case "protocole arp":
            env.configarp();
            System.out.print("machine>");
          // code block
          break;
          case "help":
             System.out.println("show tables: afficher les la table de ARP.\nadd arp: ajouter une ligne arp"
                     + "\nend : fermer la configuation de la machine");
             System.out.print("Machine>");
          // code block
          break;
        default:
            System.out.println(Commande+" n’est pas reconnu en tant que commande interne");
            System.out.print("machine>");
    // code block
       }
    Commande=sc.nextLine();  
        }
                System.out.println(Commande+" terminer la configuration de la machine");

    }
    
    public static void main(String[] args){
        work w=new work();
        env.afficheSeparateur(4);
        System.out.println("|                       Belarbi Houcine                             |");
        env.afficheSeparateur(4);
        
        w.Reseau();
    
        
    }
    
}
