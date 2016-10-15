package fr.adaming.service;

import java.util.List;

import javax.ejb.Local;

import fr.adaming.model.Gestionnaire;

@Local
public interface IGestionnaireService {
	
	public List<Gestionnaire> isExistService(String login, String mdp);

}
