/**
 * 
 * @author CLAIN Fabien
 * Date : 15/10/2016
 * 
 */
package fr.adaming.service;

import java.util.List;

import javax.ejb.EJB;

import fr.adaming.dao.IProduitDao;
import fr.adaming.model.Categorie;
import fr.adaming.model.Produit;

public class ProduitServiceImpl implements IProduitService{
//------------------------------1_Les propriétés (champs, attributs)-------------------------------------------
	/**
	 * 1_Les propriétés (champs, attributs)
	 */
	@EJB
	IProduitDao produitDao;
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
	public void addProduitService(Produit produit) {
		produitDao.addProduitDao(produit);
		
	}
	
	@Override
	public void deleteProduitService(long id_produit) {
		produitDao.deleteProduitDao(id_produit);
		
	}
	
	@Override
	public void updateProduitService(Produit produit) {
		produitDao.updateProduitDao(produit);
		
	}
	
	@Override
	public List<Produit> getAllProduitService() {
		return produitDao.getAllProduitDao();
	}
	
	@Override
	public List<Produit> getProduitByCategorieService(Categorie categorie) {
		return produitDao.getProduitByCategorieDao(categorie);
	}
	
	@Override
	public Produit getProduitByIdService(long id_produit) {
		return produitDao.getProduitByIdDao(id_produit);
	}
//-------------------------------------------------------------------------------------------------------------
}
