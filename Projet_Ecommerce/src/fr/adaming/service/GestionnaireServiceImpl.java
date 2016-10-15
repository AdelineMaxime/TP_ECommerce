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
	
	
	/**R��criture de la m�thode de l'interface servant � l'authentification
	 * 
	 */
	
	@Override
	public List<Gestionnaire> isExistService(String login, String mdp) {
		
		return gestionnaireDao.isExist(login, mdp);
	}

}
