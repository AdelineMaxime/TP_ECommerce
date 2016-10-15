package fr.adaming.dao;

import java.util.List;

import javax.ejb.Local;

import fr.adaming.model.Gestionnaire;

@Local
public interface IGestionnaireDao {
	
	public List<Gestionnaire> isExist(String login, String mdp);

}
