
public class boxeur {
	
	public static void main(String[]args) {
		double poids;
		String nom;
		
		System.out.println("Veuillez saisir votre nom");
		nom = Clavier.lire_String();
		System.out.println("Veuillez saisir votre poids");
		poids = Clavier.lire_double();
		
		if ( poids < 50.8 ) {
			System.out.println("Avec un poids de " + poids + " kgs, le boxeur " + nom + " combat dans la catégorie poids mouche");
		}
		if ( poids < 53.5 && poids > 50.8 ) {
			System.out.println("Avec un poids de " + poids + " kgs, le boxeur " + nom + " combat dans la catégorie poids coq");
		}
		if ( poids < 57.2 && poids > 53.5 ) {
			System.out.println("Avec un poids de " + poids + " kgs, le boxeur " + nom + " combat dans la catégorie poids plume");
		}
		if ( poids < 61.2 && poids > 57.2 ) {
			System.out.println("Avec un poids de " + poids + " kgs, le boxeur " + nom + " combat dans la catégorie poids léger");
		}
		if ( poids < 66.7 && poids > 61.2 ) {
			System.out.println("Avec un poids de " + poids + " kgs, le boxeur " + nom + " combat dans la catégorie poids welter");
		}
		if ( poids < 72.6 && poids > 66.7 ) {
			System.out.println("Avec un poids de " + poids + " kgs, le boxeur " + nom + " combat dans la catégorie poids moyen");
		}
		if ( poids < 88.5 && poids > 72.6 ) {
			System.out.println("Avec un poids de " + poids + " kgs, le boxeur " + nom + " combat dans la catégorie poids mi-lourd");
		}
		if ( poids >= 88.5 && poids > 88.5 ) {
			System.out.println("Avec un poids de " + poids + " kgs, le boxeur " + nom + " combat dans la catégorie poids lourd");
		}
	}
}

