
public class Helico {


	private int altitude;
	
	public Helico()
	{
		altitude=0;
	}
	
	public void decoller()
	{
		altitude=20;
		System.out.println("Décollage!");
	}
	
	public void atterir()
	{
		altitude=0;
	}
	
	public void monter()
	{
		int monte;
		System.out.println("De combien de mètre souhaitez-vous monter?");
		monte =Clavier.lire_int();
		altitude = altitude + monte;
	}
	
	public void descendre()
	{
		int descend;
		System.out.println("De combien de mètre(s) souhaitez-vous descendre?");
		descend =Clavier.lire_int();
		altitude = descend-altitude;
		if (altitude <0){
			System.out.println("IMPOSSIBLE");
		}
					
	}
	
	public void bouton_rouge()
	{
		System.out.println("T'as pris ton parachute?");
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
	
		}
}

	public void tableauDeBord()
	{
		System.out.println("Bienvenue dans Supercopter");
		System.out.println("Nous volons à une altitude de " + altitude + " mètres");
		System.out.println("Bon vol");
	}
}
