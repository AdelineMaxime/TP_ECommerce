/**
 * 
 * @author CLAIN Fabien
 * Date : 15/10/2016
 * 
 */
package fr.adaming.service;

import javax.ejb.EJB;

import fr.adaming.dao.ILigneCommandeDao;
import fr.adaming.model.LigneCommande;

public class LigneCommandeServiceImpl implements ILigneCommandeService{
	//------------------------------1_Les propriétés (champs, attributs)-------------------------------------------
	/**
	 * 1_Les propriétés (champs, attributs)
	 */
	@EJB
	ILigneCommandeDao ligneCDao;
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
	public void addLigneCService(LigneCommande LigneC) {
		ligneCDao.addLigneCDao(LigneC);
		
	}

	@Override
	public void deleteLigneCService(Long id_LigneC) {
		ligneCDao.deleteLigneCDao(id_LigneC);
		
	}

	@Override
	public void updateLigneCService(LigneCommande LigneC) {
		ligneCDao.updateLigneCDao(LigneC);
		
	}
//-------------------------------------------------------------------------------------------------------------
}
