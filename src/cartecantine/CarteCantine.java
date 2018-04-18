
public class CarteCantine {

	private int solde;
	private String detenteur;
	
	
	public CarteCantine()
	{
		solde=0;
		
		System.out.println("Veuillez saisir votre nom ?");
		detenteur=Clavier.lire_String( );
			}

	public void debiterCarte()
	{
		if (solde>0){
			solde=solde-1;
	  System.out.println("Vous avez utilise 1 repas !");
		}
	  else
	  System.out.println("Vous devez crediter votre carte !");
	}
	
	public void crediterCarte()
	{
		int plus;
		System.out.println("Combien de repas souhaitez vous ?");
		plus=Clavier.lire_int();
		solde=solde+plus;
		System.out.println("Votre solde est de "+solde);		
		
		if (solde>0){
			System.out.println("vous pouvez manger");
		}
		else {
			System.out.println("vous ne pouvez pas manger, veuillez recharger votre carte");
		}
			}
	
	public void afficherSolde()
	{
		System.out.println("Votre nom est " +detenteur+ "il vous reste sur votre carte "+solde+ "€");
			}	
	}
