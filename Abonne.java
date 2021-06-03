package article;

import java.util.ArrayList;

public class Abonne {
	protected String nom ;
	protected String prenom ;
	protected String numAbonnement ;
	protected ArrayList <Article> listeArticles ;
	protected ArrayList <Journal> listeAbonnements ;
	
	public Abonne(String nom, String prenom, String numAbonnement) {
		setNom(nom);
		setPrenom(prenom);
		setNumAbonnement(numAbonnement);
		listeArticles = new ArrayList<Article>();
		listeAbonnements = new ArrayList<Journal>();
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNumAbonnement() {
		return numAbonnement;
	}
	public void setNumAbonnement(String numAbonnement) {
		this.numAbonnement = numAbonnement;
	}
	
	public void addArticle (Article article) {
		listeArticles.add(article);
	}

}
