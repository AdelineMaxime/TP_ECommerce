package fr.adaming.managedBeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import fr.adaming.model.Client;

@ManagedBean(name="clientMB")
public class ClientManagedBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Attributs ------------------------------------------------------------------------------------------------------------
	Client client;

	// Constructeur vide ----------------------------------------------------------------------------------------------------
	public ClientManagedBean() {
		super();
	}

	// Getters & Setters ----------------------------------------------------------------------------------------------------
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	// Méthode métier
	public String isExistClient(){
		
		
		return null;
		
	}
	

	public String isExistCompte(){
		return null;
		
	}
}
