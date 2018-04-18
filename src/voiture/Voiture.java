
public class Voiture {
	
		private double vitesse;
		private String couleur;
		private double nbKms;
		
		public Voiture()
		{
			vitesse=0;
			nbKms=0;	
			System.out.println("Veuillez renseigner la couleur de la voiture");
			couleur=Clavier.lire_String();
				
		}
		
		public void changerCouleur()
		{
			System.out.println("Veuillez saisir une nouvelle couleur pour votre voiture");
			couleur=Clavier.lire_String();
			
		}
		
		public void ajouterKms()
		{
			System.out.println("Veuillez saisir le nombre de kilomètres parcouru au cours du trajet");
			nbKms=Clavier.lire_int();
	
		}
		
		public void accelerer()
		{
			vitesse=vitesse+10; 
					
		}
		
		public void decelerer()
		{
			vitesse=vitesse-10;
				
		}
		
		public void stopFeuRouge()
		{
			System.out.println("le feu est rouge attendez 10 secondes");
			System.out.println("10");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("9");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("8");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("7");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("6");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("5");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("4");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("3");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("2");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("1");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
		
			}
			System.out.println("Veuillez saisir la vitesse");
			vitesse=Clavier.lire_int();
			if (vitesse<0) { 
				System.out.println("IMPOSSIBLE");
			}
		}

		public void TableauDeBord()
		{
			System.out.println("La voiture est de couleur " +couleur+ " elle roule a "  +vitesse+ "km/h et elle a " +nbKms+ "kms");
		
		}
		
	}

