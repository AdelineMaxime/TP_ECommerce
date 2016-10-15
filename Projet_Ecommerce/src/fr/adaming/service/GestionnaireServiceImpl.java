package fr.adaming.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateful;

import fr.adaming.dao.IGestionnaireDao;
import fr.adaming.model.Gestionnaire;

@Stateful
public class GestionnaireServiceImpl implements IGestionnaireService {
	
	/**Instanciation d'un objet gestionnaireDao
	 * 
	 */
	@EJB
	IGestionnaireDao gestionnaireDao;
	
	
	/**Réécriture de la méthode de l'interface servant à l'authentification
	 * 
	 */
	
	@Override
	public List<Gestionnaire> isExistService(String login, String mdp) {
		
		return gestionnaireDao.isExist(login, mdp);
	}

}
