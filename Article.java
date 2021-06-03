package article;

import java.util.Date;

public class Article {
	protected Date date ;
	protected String titre ;
	protected String sujet ;
	protected String contenu ;
	
	public Article(Date date, String titre, String sujet, String contenu) {
		setDate(date);
		setTitre(titre);
		setSujet(sujet);
		setContenu(contenu);
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

}
