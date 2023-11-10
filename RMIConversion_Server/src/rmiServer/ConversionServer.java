package rmiServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import rmiService.ConversionImpl;

//Classe représentant le serveur pour le service de conversion RMI
public class ConversionServer {

	public static void main(String[] args) {
		try {
			// Création du registre RMI sur le port 1099
			LocateRegistry.createRegistry(1099);
			// Création de l'objet distant (OD)
			ConversionImpl od = new ConversionImpl();
			System.out.println(od.toString());
			//publier la reference de l'objet distant dans le registre RMI
			//rmi://IP/PORT/ref
			Naming.rebind("rmi://localhost:1099/OD", od);
			// L'adresse "rmi://localhost:1099/OD" sera utilisée par les clients pour accéder à cet objet distant
		} catch (Exception e) {e.printStackTrace();}
		

	}

}
/*
  Cette classe initialise et expose le service de conversion RMI du serveur, le rendant accessible aux clients.
*/