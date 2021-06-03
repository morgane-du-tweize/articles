package article;

import java.util.ArrayList;

public class Journal {
	protected String nom ;
	protected ArrayList <Redacteur> redacteurs;
	
	public Journal (String nom) {
		setNom(nom);
		this.redacteurs = new ArrayList<Redacteur>();
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<Redacteur> getRedacteurs() {
		return redacteurs;
	}
	
	public void setRedacteurs(ArrayList<Redacteur> redacteurs) {
		this.redacteurs = redacteurs;
	}
	
	public void abonnement (Abonne abonne) {
		abonne.listeAbonnements.add(this);
	}
	
	public void addRedacteur (Redacteur redacteur) {
		this.redacteurs.add(redacteur);
	}
	
	public ArrayList<Article> getListeArticles () {
		ArrayList <Article> articles = new ArrayList<Article>();
		for(Redacteur redacteur : redacteurs) {
			for (Article article: redacteur.getListeArticles()) {
				articles.add(article);
			}
			
		}
		return articles;
	}

}
