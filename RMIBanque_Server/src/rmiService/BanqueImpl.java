package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import metier.Compte;

public class BanqueImpl extends UnicastRemoteObject implements IBanque {
    // Skeleton qui va faire la publication d'objet dans l'annuaire
    public BanqueImpl() throws RemoteException {
        super();
    }
    private static final long serialVersionUID = 1L;
    //comptes est une map qui stocke les objets Compte associés à leurs codes respectifs.
    private Map<Integer, Compte> comptes = new HashMap<>();

    // Service
    @Override
    public String creerCompte(Compte c) throws RemoteException {
        if (comptes.containsKey(c.getCode())) {
            return "Le compte avec le code " + c.getCode() + " existe déjà.";
        } else {
            comptes.put(c.getCode(), c);
            return "Compte créé avec succès : " + c.toString();
        }
    }
    //Cette méthode permet de créer un compte s’il n’est pas déjà existant.
    @Override
    public String getInfoCompte(int code) throws RemoteException {
        if (comptes.containsKey(code)) {
            Compte compte = comptes.get(code);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date = dateFormat.format(compte.getDateCreation());
            return "Code: " + compte.getCode() + "\nSolde: " + compte.getSolde() + "\nDate de création: " + date;
        } else {
            return "Aucun compte trouvé avec le code " + code;
        }
    } //Cette méthode permet de consulter un compte en fonction de son code.
}
/*  la classe fournit une implémentation basique des services bancaires à travers RMI, 
	en utilisant un mécanisme simple de stockage des comptes en mémoire.
 */
