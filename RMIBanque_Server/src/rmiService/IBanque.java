package rmiService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import metier.Compte;

//Interface définissant un service de banque à distance
//Une interface définit simplement la signature des méthodes, sans fournir de corps de méthode.
public interface IBanque extends Remote{
	public String creerCompte(Compte c) throws RemoteException;
	public String getInfoCompte(int code) throws RemoteException;
}
