package rmiService;

import java.rmi.Remote;
import java.rmi.RemoteException;

//Interface définissant un service de conversion à distance
//Une interface définit simplement la signature des méthodes, sans fournir de corps de méthode.
public interface IConversion extends Remote {
	 //La méthode convertirMontant prend en charge cette conversion 
	 //et renvoie le résultat en double.
	public double convertirMontant(double mt) throws RemoteException;
}
/*
 cette interface constitue le fondement du service de convertisseur en RMI, où des objets implémentant 
 cette interface seront utilisés pour effectuer des conversions à distance entre le client et le serveur.
*/