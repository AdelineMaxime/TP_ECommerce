package fr.adaming.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.adaming.model.Gestionnaire;

@Stateless
public class GestionnaireDaoImpl implements IGestionnaireDao {
	
	/**Spécification du contexte que l'on utilise
	 * 
	 */
	@PersistenceContext(unitName="PU")
	EntityManager em;
	
	/**Réécriture de la méthode isExist de l'interface servant à l'identification du Gestionnaire 
	 * 
	 */
	@Override
	public List<Gestionnaire> isExist(String login, String mdp) {
		
		/**Création de la requête permettant de trouver le Gestionnaire dans la base de donnée
		 * 
		 */
		String reqExist="Select u from Gestionnaire as u where u.login=:plogin and u.mdp=:pmdp";
		
		
		Query query=em.createQuery(reqExist);
		
		/**Récupération des informations entrées
		 * 
		 */
		
		query.setParameter("plogin", login);
		query.setParameter("pmdp", mdp);
		
		@SuppressWarnings("unchecked")
		List<Gestionnaire> listeGestionnaire=query.getResultList();
		
		return listeGestionnaire;
	}

}
