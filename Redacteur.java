package article;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Redacteur {
	protected String nom ;
	protected String prenom ;
	protected ArrayList <Article> listeArticles ;
	
	public Redacteur (String nom, String prenom) throws Exception {
		setNom(nom);
		setPrenom(prenom);
		this.listeArticles = new ArrayList<Article>();
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) throws Exception {
		// lancer une exception en cas de chaîne vide
		if (nom =="") {
			throw new Exception("Le nom ne peut pas être nul");
		}
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public Article Rediger(String titre, String sujet, String contenu) {
		Date aujourdhui = new Date();
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yy");
	    formater.format(aujourdhui);
		Article newArticle = new Article (aujourdhui, titre, sujet, contenu); 
		this.listeArticles.add(newArticle);
		
		return newArticle ;
	}

	public ArrayList<Article> getListeArticles() {
		return listeArticles;
	}

	public void setListeArticles(ArrayList<Article> listeArticles) {
		this.listeArticles = listeArticles;
	}

}
