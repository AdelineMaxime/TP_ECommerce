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

import fr.adaming.model.Categorie;
import fr.adaming.model.Produit;

@Stateless
public class CategorieDaoImpl implements ICategorieDao{
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
	public void addCategorieDao(Categorie categorie) {
		em.persist(categorie);
		
	}

	@Override
	public void deleteCategorieDao(long id_categorie) {
		Categorie categorie = em.find(Categorie.class, id_categorie);
		em.remove(categorie);
		
	}

	@Override
	public void updateCategorieDao(Categorie categorie) {
		em.merge(categorie);
		
	}

	@Override
	public List<Categorie> getAllCategorieDao() {
		String req ="SELECT a FROM Categorie a";
		Query query1 = em.createQuery(req);
		
		return query1.getResultList();
	}

	@Override
	public Categorie getCategorieByProduitDao(Produit produit) {
		//requête en SQL 
		return null;
	}
//-------------------------------------------------------------------------------------------------------------
}
