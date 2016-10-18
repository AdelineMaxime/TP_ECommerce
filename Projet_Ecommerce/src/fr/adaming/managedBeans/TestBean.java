package fr.adaming.managedBeans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import fr.adaming.model.Client;
import fr.adaming.model.Commande;
import fr.adaming.model.Panier;
import fr.adaming.service.ClientServiceImpl;
import fr.adaming.service.IClientService;

@ManagedBean
@RequestScoped
public class TestBean {
//------------------------------1_Les propriétés (champs, attributs)-------------------------------------------
	/**
	 * 1_Les propriétés (champs, attributs)
	 */
	private String nom;
	private String adresse;
	private String mail;
	private String password;
	private int tel;
	
	private List<Commande> listeCommandes;
	
	private Panier panier;
	
	//@EJB
	IClientService clientService = new ClientServiceImpl();
//------------------------------2_Les constructeurs------------------------------------------------------------	
	/**
	 * 2_Les constructeurs
	 */

	public TestBean() {
		super();
	}
//------------------------------3_Les Getters et Setters-------------------------------------------------------
	/**
	 * 3_Les Getters et Setters
	 */
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public List<Commande> getListeCommandes() {
		return listeCommandes;
	}
	public void setListeCommandes(List<Commande> listeCommandes) {
		this.listeCommandes = listeCommandes;
	}
	public Panier getPanier() {
		return panier;
	}
	public void setPanier(Panier panier) {
		this.panier = panier;
	}
//------------------------------4_Méthodes---------------------------------------------------------------------
	/**
	 * 4_Méthodes
	 */
	public String add(){
		this.setNom("toto");
		this.setAdresse("fkdslf");
		this.setMail("fdsjklfd@dsqdsq");
		this.setPassword("123456");
		this.setTel(123456);
		
		Client client = new Client(2,nom, adresse, mail, password, tel);
		System.out.println(client);
		clientService.addClientService(client);
		
		return "test.xhtml";
	}
//-------------------------------------------------------------------------------------------------------------
}
