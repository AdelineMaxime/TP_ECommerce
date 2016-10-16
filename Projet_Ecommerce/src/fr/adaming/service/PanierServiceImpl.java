/**
 * 
 * @author CLAIN Fabien
 * Date : 15/10/2016
 * 
 */
package fr.adaming.service;

import java.util.List;

import javax.ejb.EJB;

import fr.adaming.dao.IPanierDao;
import fr.adaming.model.Client;
import fr.adaming.model.Panier;

public class PanierServiceImpl implements IPanierDao{
	//------------------------------1_Les propriétés (champs, attributs)-------------------------------------------
	/**
	 * 1_Les propriétés (champs, attributs)
	 */
	@EJB
	IPanierDao panierDao;
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
	public void addPanierDao(Panier panier) {
		panierDao.addPanierDao(panier);
		
	}

	@Override
	public void deletePanierDao(Long id_panier) {
		panierDao.deletePanierDao(id_panier);
		
	}

	@Override
	public void updatePanierDao(Panier panier) {
		panierDao.updatePanierDao(panier);
		
	}

	@Override
	public List<Panier> getAllPanierDao() {
		return panierDao.getAllPanierDao();
	}

	@Override
	public Panier getPanierByClientDao(Client client) {
		return panierDao.getPanierByClientDao(client);
	}
//-------------------------------------------------------------------------------------------------------------
}
