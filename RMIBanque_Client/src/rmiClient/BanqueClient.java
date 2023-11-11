package rmiClient;

import java.rmi.Naming;
import java.util.Date;
import metier.Compte;
import rmiService.IBanque;

//Classe représentant le client pour le service de banque RMI
public class BanqueClient {
 public static void main(String[] args) {
     try {
         // Recherche du service de banque distant à l'adresse spécifiée
         IBanque stub = (IBanque) Naming.lookup("rmi://localhost:1099/banque");

         // Exemple d'utilisation des méthodes de l'interface IBanque
         // Création d'un compte
         Compte nouveauCompte = new Compte();
         nouveauCompte.setCode(1234);
         nouveauCompte.setSolde(1000);
         nouveauCompte.setDateCreation(new Date());
         String messageCreation = stub.creerCompte(nouveauCompte);
         System.out.println(messageCreation);

         // Consultation des informations d'un compte
         int codeCompte = 1234;
         String infosCompte = stub.getInfoCompte(codeCompte);
         System.out.println(infosCompte);
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}
// cette classe agit comme un client RMI qui utilise le service de Banque distant .
