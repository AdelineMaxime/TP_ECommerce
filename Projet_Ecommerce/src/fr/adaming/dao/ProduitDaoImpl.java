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
public class ProduitDaoImpl implements IProduitDao{
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
	public void addProduitDao(Produit produit) {
		em.persist(produit);
		
	}

	@Override
	public void deleteProduitDao(Long id_produit) {
		Produit produit = em.find(Produit.class, id_produit);
		em.remove(produit);
	}

	@Override
	public void updateProduitDao(Produit produit) {
		em.merge(produit);
		
	}

	@Override
	public List<Produit> getAllProduitDao() {
		String req ="SELECT a FROM Produit a";
		Query query1 = em.createQuery(req);
		return query1.getResultList();
	}

	@Override
	public List<Produit> getProduitByCategorieDao(Categorie categorie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit getProduitByIdDao(Long id_produit) {
		String req ="SELECT a FROM Produit a WHERE a.id_produit=:id_p";
		
		Query query1 = em.createQuery(req);
		
		query1.setParameter("id_p", id_produit);
		
		return (Produit) query1.getSingleResult();
	}
//-------------------------------------------------------------------------------------------------------------
}
