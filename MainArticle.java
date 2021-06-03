package article;

public class MainArticle {

	public static void main(String[] args) throws Exception {
		
		Journal gazette = new Journal("la gazette de Cavaillon");
		
		// le rédacteur doit rédiger des articles
		Redacteur redacteur1 = new Redacteur("Toshiki", "Inugai");
		gazette.addRedacteur(redacteur1);
		
		// Article Rediger(String titre, String sujet, String contenu)
		redacteur1.Rediger("Poussin", "enlevement du petit fils du ministre", 
				"Proin malesuada orci elementum magna mattis, at molestie ex eleifend."
				+ "Cras finibus dui eu nisl rutrum condimentum. Integer aliquet, nisl vitae placerat tincidunt,"
				+ "nunc tellus semper elit, non iaculis justo magna et augue."
				+ "Vestibulum et justo vitae quam viverra congue in at augue. "
				+ "Praesent ultricies posuere ex eget ultrices. "
				+ "Morbi porta commodo lorem, id mollis nulla viverra vitae. "
				+ "Nunc dapibus est mi, at egestas neque vulputate eget. "
				+ "Nullam venenatis nec odio vitae posuere. Maecenas ac vulputate dui. "
				+ "Nulla porta sapien fringilla ornare tincidunt. Quisque vitae augue augue."
				+ " Sed sit amet egestas lorem, vitae ornare libero. Sed malesuada eu augue sed eleifend. "
				+ "Proin feugiat rutrum semper. Etiam vel blandit ante. "
				+ "Aenean quis diam in nisi pulvinar tempor a semper nisl. ");
		
		// les articles des rédacteurs doivent être publiés dans le journal

	}

}
