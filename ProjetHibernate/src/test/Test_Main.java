package test;

import manager.PersonneManager;
import util.HibernateUtil;

public class Test_Main {

	public static void main(String[] args) {

		
		PersonneManager pm=new PersonneManager();
		//ajouter des elements a la base données
		pm.ajouterPerssone("nom1","prenom1","01-01-01-01-01","mail1@gmail.com");
		pm.ajouterPerssone("nom2","prenom2","02-01-01-01-01","mail2@gmail.com");
		pm.ajouterPerssone("nom3","prenom3","03-01-01-01-01","mail3@gmail.com");

		//pm.supprimePersonne(16);// pour suprimé un element de la base de donné il suffi de donné le numéro id mais il faut metre update et pour rajouter des base de donné et ecrasé les autres données il faut metre create dans le fichier de configuration XML
		HibernateUtil.sessionFactory.close();
	
		
	 }

}
