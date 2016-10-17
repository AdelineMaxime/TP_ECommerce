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

@Stateless
public class ClientDaoImpl implements IClientDao{
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
	public void addClientDao(Client client) {
		em.persist(client);	
	}

	@Override
	public void deleteClientDao(Long id_client) {
		Client client = em.find(Client.class, id_client);
		em.remove(client);
	}

	@Override
	public void updateClientDao(Client client) {
		em.merge(client);
		
	}

	@Override
	public int isExistDao(String mail, String password) {
		//Créeation de la requete
		String req ="SELECT a From Client a Where a.mail=:pLogin AND a.password=:pPassword";
		Query query1 = em.createQuery(req);
		
		query1.setParameter("pLogin", mail);
		query1.setParameter("pPassword", password);
		
		List<Client> liste = query1.getResultList();
		
		if(!liste.isEmpty()){
			return 1;
		}else{
			return 0;
		}
	}

	@Override
	public List<Client> getAllClientDao() {
		String req= "SELECT a FROM Client a";
		Query query1 = em.createQuery(req);
		return query1.getResultList();
	}
//-------------------------------------------------------------------------------------------------------------

}
