package rmiClient;

import java.rmi.Naming;
import rmiService.IConversion;

//Classe représentant le client pour le service de conversion RMI
public class ConversionClient {
	public static void main(String[] args) {
		try {
			 // Recherche du service de conversion distant à l'adresse spécifiée
			 IConversion stub = (IConversion)Naming.lookup("rmi://localhost:1099/OD");
			// Appels de la méthode de conversion avec différents montants
			 System.out.println(stub.convertirMontant(1500.00));
			 System.out.println(stub.convertirMontant(150.00));
		} catch (Exception e) { e.printStackTrace(); }
	}
}
/* cette classe agit comme un client RMI qui utilise le service de conversion distant 
pour convertir des montants spécifiques.
*/