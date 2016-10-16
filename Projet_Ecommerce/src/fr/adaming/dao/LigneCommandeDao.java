/**
 * 
 * @author CLAIN Fabien
 * Date : 15/10/2016
 * 
 */
package fr.adaming.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.adaming.model.LigneCommande;

public class LigneCommandeDao implements ILigneCommandeDao{
//------------------------------1_Les propriétés (champs, attributs)-------------------------------------------
	/**
	 * 1_Les propriétés (champs, attributs)
	 */
	@PersistenceContext
	EntityManager em;
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
	public void addLigneCDao(LigneCommande LigneC) {
		em.persist(LigneC);
		
	}

	@Override
	public void deleteLigneCDao(Long id_LigneC) {
		LigneCommande ligneC = em.find(LigneCommande.class, id_LigneC);
		
		em.remove(ligneC);
	}

	@Override
	public void updateLigneCDao(LigneCommande LigneC) {
		em.merge(LigneC);
		
	}
//-------------------------------------------------------------------------------------------------------------
}
