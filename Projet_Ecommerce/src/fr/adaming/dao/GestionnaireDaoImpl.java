package fr.adaming.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.adaming.model.Gestionnaire;

@Stateless
public class GestionnaireDaoImpl implements IGestionnaireDao {
	
	/**Sp�cification du contexte que l'on utilise
	 * 
	 */
	@PersistenceContext(unitName="PU")
	EntityManager em;
	
	/**R��criture de la m�thode isExist de l'interface servant � l'identification du Gestionnaire 
	 * 
	 */
	@Override
	public List<Gestionnaire> isExist(String login, String mdp) {
		
		/**Cr�ation de la requ�te permettant de trouver le Gestionnaire dans la base de donn�e
		 * 
		 */
		String reqExist="Select u from Gestionnaire as u where u.login=:plogin and u.mdp=:pmdp";
		
		
		Query query=em.createQuery(reqExist);
		
		/**R�cup�ration des informations entr�es
		 * 
		 */
		
		query.setParameter("plogin", login);
		query.setParameter("pmdp", mdp);
		
		@SuppressWarnings("unchecked")
		List<Gestionnaire> listeGestionnaire=query.getResultList();
		
		return listeGestionnaire;
	}

}
