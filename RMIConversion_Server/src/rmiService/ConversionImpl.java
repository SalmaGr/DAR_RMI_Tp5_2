package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl  extends UnicastRemoteObject implements IConversion{
	//Skeleton qui va faire la publication d'objet dans lannuaire
	//public car la classe du serveur exicte ailleur de package 
	public ConversionImpl() throws RemoteException {
		super();
	}
	private static final long serialVersionUID = 1L;
	
	// Implémentation de la méthode distante de conversion de montant
	//service	
	@Override
	public double convertirMontant(double mt) throws RemoteException {
		return mt*3.3;
	}

}
/*
  Cette classe joue le rôle d'intermédiaire entre l'utilisateur et le service de conversion RMI, 
  facilitant l'interaction et l'utilisation du service distant pour effectuer des conversions de montants
*/

