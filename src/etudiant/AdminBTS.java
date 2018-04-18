
 public class AdminBTS {

		double moyenne;
		String nom;
		String prenom;
		int coef;
		double note;
		
		public void Etudiant(){ 
		System.out.println("Veuillez saisir votre nom");
		nom = Clavier.lire_String();
		System.out.println("Veuillez saisir votre prénom");
		prenom=Clavier.lire_String();
		
		note = 0;
		moyenne = 0;
		coef = 0;
		}
		
		public void epreuve1() {
			System.out.println("Veuillez saisir votre note en étude de cas");
			note = Clavier.lire_double();
			moyenne = moyenne + (note*5);
			coef = coef + 5;
		}
		
		
		public void epreuve2() {
			System.out.println("Veuillez saisir votre note de pratique des techniques informatiques");
			note = Clavier.lire_double();
			moyenne = moyenne + (note*3);
			coef = coef + 3;
		}
		
		public void epreuve3() {
			System.out.println("Veuillez saisir votre note en soutenance de projet");
			note = Clavier.lire_double();
			moyenne = moyenne + (note*4);
			coef = coef + 4;
		}
		
		public void epreuve4() {
			System.out.println("Veuillez saisir votre note en mathématiques");
			note = Clavier.lire_double();
			moyenne = moyenne + ( note*2 );
			coef = coef + 2;
		}

		public void epreuve5() {
			System.out.println("Veuillez saisir votre note d'expression française");
			note = Clavier.lire_double();
			moyenne = moyenne + ( note*2 );
			coef = coef + 2;
		}
		
		public void epreuve6() {
			System.out.println("Veuillez saisir votre note en économie-droit");
			note = Clavier.lire_double();
			moyenne = moyenne + ( note*3 );
			coef = coef + 3;
		}
		
		public void epreuve7() {
			System.out.println("Veuillez saisir votre note d'anglais écrit");
			note = Clavier.lire_double();
			moyenne = moyenne + ( note*2 );
			coef = coef + 2;
		}
		
		public void epreuve8() {
			System.out.println("Veuillez saisir votre note d'anglais oral");
			note = Clavier.lire_double();
			moyenne = moyenne + note;
			coef = coef + 1;
		}
		
		public void resultat() {
			moyenne = moyenne/coef;
			if ( moyenne < 10 ) {
				System.out.println(nom + " " + prenom + "Vous êtes recalé");
			}
			else {
				if ( moyenne >= 12  &&  moyenne < 14) {
					System.out.println(nom + " " + prenom + "vous êtes admis avec la mention assez bien.");
				}
				if ( moyenne >= 14 && moyenne < 16 ) {
					System.out.println(nom + " " + prenom + "vous êtes admis avec la mention bien.");
				}
				if (moyenne >=16 && moyenne <18 ){
					System.out.println(nom + " " + prenom + "vous êtes admis avec la mention très bien.");
				}
			}
		}
 }
		
		
	