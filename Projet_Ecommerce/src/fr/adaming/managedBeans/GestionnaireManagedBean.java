package fr.adaming.managedBeans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import fr.adaming.model.Gestionnaire;
import fr.adaming.service.IGestionnaireService;

@ManagedBean(name="gestMB")
@RequestScoped
public class GestionnaireManagedBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String login;
	private String mdp;
	
	private Gestionnaire gestionnaire;
	
	/**Implémentation des méthodes 
	 * 
	 */
	@EJB
	IGestionnaireService gestService;
	
	/**Appel de la session
	 * 
	 */
	
	HttpSession session;

	/**Constructeur vide
	 * 
	 */
	public GestionnaireManagedBean() {
		super();
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the mdp
	 */
	public String getMdp() {
		return mdp;
	}

	/**
	 * @param mdp the mdp to set
	 */
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}	
	
	/**
	 * @return the gestionnaire
	 */
	public Gestionnaire getGestionnaire() {
		return gestionnaire;
	}

	/**
	 * @param gestionnaire the gestionnaire to set
	 */
	public void setGestionnaire(Gestionnaire gestionnaire) {
		this.gestionnaire = gestionnaire;
	}

	public String isExist(){
		
		List<Gestionnaire> listeGestionnaire=gestService.isExistService(login, mdp);
		
		if(listeGestionnaire.size()==1){
			
			gestionnaire=listeGestionnaire.get(0);
			
			session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
			
			session.setAttribute("gestionnaire", gestionnaire);
			
			System.out.println(gestionnaire);
			
			return "succes";		
		}else{
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Le login ou le mot de passe est incorrect"));
			
			return "fail";
		}
		
	}
	
	public String deconnexion(){
		
		((HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true)).invalidate();
		
		return "deco";
	}
	
	
	
	
	

}
