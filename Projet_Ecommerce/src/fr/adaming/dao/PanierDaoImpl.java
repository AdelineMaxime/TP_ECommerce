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
import javax.persistence.Query;

import fr.adaming.model.Client;
import fr.adaming.model.Panier;

@Stateless
public class PanierDaoImpl implements IPanierDao{
//------------------------------1_Les propri�t�s (champs, attributs)-------------------------------------------
	/**
	 * 1_Les propri�t�s (champs, attributs)
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
//------------------------------4_M�thodes---------------------------------------------------------------------
	/**
	 * 4_M�thodes
	 */

	@Override
	public void addPanierDao(Panier panier) {
		em.persist(panier);
		
	}

	@Override
	public void deletePanierDao(long id_panier) {
		Panier panier = em.find(Panier.class, id_panier);
		
		em.remove(panier);
		
	}

	@Override
	public void updatePanierDao(Panier panier) {
		em.merge(panier);
		
	}

	@Override
	public List<Panier> getAllPanierDao() {
		String req = "SELECT a FROM Panier a";
		Query query1 = em.createQuery(req);
		
		return query1.getResultList();
	}

	@Override
	public Panier getPanierByClientDao(Client client) {
		// Requete SQL
		return null;
	}
//-------------------------------------------------------------------------------------------------------------
	}
