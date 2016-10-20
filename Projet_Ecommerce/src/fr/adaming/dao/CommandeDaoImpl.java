/**
 * 
 * @author CLAIN Fabien
 * Date : 15/10/2016
 * 
 */
package fr.adaming.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.adaming.model.Client;
import fr.adaming.model.Commande;

@Stateless
public class CommandeDaoImpl implements ICommandeDao{
//------------------------------1_Les propriétés (champs, attributs)-------------------------------------------
	/**
	 * 1_Les propriétés (champs, attributs)
	 */
	@PersistenceContext(unitName="PU")
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
	public void addCommandeDao(Commande cmd) {
		em.persist(cmd);
		
	}

	@Override
	public void deleteComandeDao(long id_cmd) {
		Commande cmd = em.find(Commande.class, id_cmd);
		em.remove(cmd);
		
	}

	@Override
	public List<Commande> getCommandesByClientDao(Client client) {
		// Requête en Sql
		return null;
	}
//-------------------------------------------------------------------------------------------------------------

}
