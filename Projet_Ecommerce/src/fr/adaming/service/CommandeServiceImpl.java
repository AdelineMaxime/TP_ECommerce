/**
 * 
 * @author CLAIN Fabien
 * Date : 15/10/2016
 * 
 */
package fr.adaming.service;

import java.util.List;

import javax.ejb.EJB;

import fr.adaming.dao.ICommandeDao;
import fr.adaming.model.Client;
import fr.adaming.model.Commande;

public class CommandeServiceImpl implements ICommandeService{
//------------------------------1_Les propriétés (champs, attributs)-------------------------------------------
	/**
	 * 1_Les propriétés (champs, attributs)
	 */
		@EJB
		ICommandeDao cmdDao;
//-------------------------------------------------------------------------------------------------------------
//------------------------------2_Les constructeurs------------------------------------------------------------	
	/**
	 * 2_Les constructeurs
	 */
//-------------------------------------------------------------------------------------------------------------
//------------------------------3_Les Getters et Setters-------------------------------------------------------
	/**
	 * 3_Les Getters et Setters
	 */
//-------------------------------------------------------------------------------------------------------------
//------------------------------4_Méthodes---------------------------------------------------------------------
	/**
	 * 4_Méthodes
	 */

	@Override
	public void addCommandeService(Commande cmd) {
		cmdDao.addCommandeDao(cmd);
		
	}

	@Override
	public void deleteComandeService(Long id_cmd) {
		cmdDao.deleteComandeDao(id_cmd);
		
	}

	@Override
	public List<Commande> getCommandesByClientService(Client client) {
		return cmdDao.getCommandesByClientDao(client);
	}
//-------------------------------------------------------------------------------------------------------------
}
