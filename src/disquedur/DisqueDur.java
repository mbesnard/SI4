class DisqueDur
{
	private String marque;
	private String modele;
	private double capacite;
	private double espaceOccupe;
	private int NbPartitions;
	private int NbFichiers;
	
	public DisqueDur()
	{
		System.out.println("veuillez saisir la marque");
		marque=Clavier.lire_String();
		System.out.println("veuillez saisir le modele");
		modele=Clavier.lire_String();
		System.out.println("Veuillez saisir la capacité");
		capacite=Clavier.lire_double();
		espaceOccupe=0;
		NbPartitions=0;
		NbFichiers=0;
	}

	public void diminuerEspOccup()
	{
		System.out.println("De combien souhaitez vous diminuer votre espace occupé ?");
		double diminution;
		diminution=Clavier.lire_double();
		espaceOccupe=espaceOccupe-diminution;
		if (espaceOccupe<0){
			System.out.println("IMPOSSIBLE");
		}
	}	
	
	public void augmenterEspOccup()
	{
		System.out.println("De combien souhaitez vous augmenter votre espace occupé ?");
		double augmentation;
		augmentation=Clavier.lire_double();
		espaceOccupe=espaceOccupe-augmentation;
		if (espaceOccupe>capacite){
			System.out.println("IMPOSSIBLE");
		}
	}
	
	public void ajoutPart()
	{
		System.out.println("Combien de partitions supplementaires souhaitez-vous créer ?");
		int augmentation;
		augmentation=Clavier.lire_int();
		NbPartitions=NbPartitions+augmentation;
	
	}
	
	public void supprPart()
	{
		System.out.println("Combien de partitions souhaitez-vous supprimer ?");
		int diminution;
		diminution=Clavier.lire_int();
		NbPartitions=NbPartitions-diminution; 
		if (NbPartitions<0){
			System.out.println("IMPOSSIBLE");
		}
		
	}
	
	public void ajoutFichiers()
	{
		System.out.println("Combien de fichiers souhaitez-vous ajouter ?");
		int augmentation;
		augmentation=Clavier.lire_int();
		NbFichiers=NbFichiers+augmentation;
	}
	
	public void supprFichiers()
	{
		System.out.println("Combien de fichiers souhaitez-vous supprimer ?");
		int diminution;
		diminution=Clavier.lire_int();
		NbFichiers=NbFichiers-diminution;
		if (NbFichiers<0){
			System.out.println("IMPOSSIBLE");
		}
	}
	
	public void espaceLibre()
	{
		System.out.println("l'espace libre sur le disque est de "+ (capacite-espaceOccupe));	
	
	}
	
	public void proprietes()
	{
		System.out.println("La marque du disque est " +marque+", le Modèle est " +modele+", la Capacité est de " +capacite+"Go, le Nombre de partitions est de " +NbPartitions+ " et le Nombre(s) de fichiers est de " +NbFichiers);	
	}
}