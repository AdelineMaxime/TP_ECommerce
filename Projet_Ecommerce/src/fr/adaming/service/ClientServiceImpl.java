/**
 * 
 * @author CLAIN Fabien
 * Date : 15/10/2016
 * 
 */
package fr.adaming.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateful;

import fr.adaming.dao.IClientDao;
import fr.adaming.model.Client;
@Stateful
public class ClientServiceImpl implements IClientService{
//------------------------------1_Les propriétés (champs, attributs)-------------------------------------------
	/**
	 * 1_Les propriétés (champs, attributs)
	 */
	@EJB
	IClientDao clientDao;
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
	public void addClientService(Client client) {
		clientDao.addClientDao(client);
		
	}

	@Override
	public void deleteClientService(long id_client) {
		clientDao.deleteClientDao(id_client);
		
	}

	@Override
	public void updateClientService(Client client) {
		clientDao.updateClientDao(client);
		
	}

	@Override
	public int isExistService(String mail, String password) {
		
		return clientDao.isExistDao(mail, password);
	}

	@Override
	public List<Client> getAllClientService() {
		return clientDao.getAllClientDao();
	}
	
	@Override
	public int isExistService(String mail) {
		
		return clientDao.isExistDao(mail);
	}
//-------------------------------------------------------------------------------------------------------------
}
