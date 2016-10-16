/**
 * 
 * @author CLAIN Fabien
 * Date : 15/10/2016
 * 
 */
package fr.adaming.service;

import java.util.List;

import javax.ejb.EJB;

import fr.adaming.dao.ICategorieDao;
import fr.adaming.model.Categorie;
import fr.adaming.model.Produit;

public class CategorieServiceImpl implements ICategorieService{
//------------------------------1_Les propriétés (champs, attributs)-------------------------------------------
	/**
	 * 1_Les propriétés (champs, attributs)
	 */
	@EJB
	ICategorieDao categorieDao;
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
	public void addCategorieService(Categorie categorie) {
		categorieDao.addCategorieDao(categorie);
	}

	@Override
	public void deleteCategorieService(Long id_client) {
		categorieDao.deleteCategorieDao(id_client);
		
	}

	@Override
	public void updateCategorieService(Categorie categorie) {
		categorieDao.updateCategorieDao(categorie);
		
	}

	@Override
	public List<Categorie> getAllCategorieService() {
		return categorieDao.getAllCategorieDao();
	}

	@Override
	public Categorie getCategorieByProduitService(Produit produit) {
		return categorieDao.getCategorieByProduitDao(produit);
	}
//-------------------------------------------------------------------------------------------------------------

}
