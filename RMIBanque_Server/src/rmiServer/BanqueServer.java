package rmiServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import rmiService.BanqueImpl;
import rmiService.IBanque;

//Classe représentant le serveur pour le service de banque RMI
public class BanqueServer {

	public static void main(String[] args) {
			try {
				// Créer l'objet distant BanqueImpl
				IBanque banque = new BanqueImpl();
				System.out.println(banque.toString());
				
				// Créer un registre RMI sur le port 1099
				LocateRegistry.createRegistry(1099);
	
				//publier la reference de l'objet distant dans le registre RMI
				Naming.rebind("rmi://localhost:1099/banque", banque);
	
				System.out.println("Serveur prêt !");
				
			} catch (Exception e) {
				System.err.println("Erreur du serveur : " + e.toString());
				e.printStackTrace(); }
		}
}
/*
Cette classe initialise et expose le service de banque RMI du serveur, le rendant accessible aux clients.
*/
