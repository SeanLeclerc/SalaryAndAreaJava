//============================================================================
// Programmeur: Daniel Morin
// Date: 19 septembre 2016
// Fichier: Personnage.java
// Description: ORD12951 : Laboratoire no 4
//============================================================================

//============================================================================
public class Personnage 
//============================================================================
{
	//Variables d'instance
	private String nom = "inconnu";
	private double energie = 1.0;
	private int nbVies = 5;
	private boolean actif = true;
	
	//Constructeur
	//------------------------------------------------------------------------
	public Personnage()
	//------------------------------------------------------------------------
	{
	}
	
	//------------------------------------------------------------------------
	public Personnage( String nom )
	//------------------------------------------------------------------------
	{
		this.nom = nom;
	}
	
	//------------------------------------------------------------------------
	public Personnage( String nom, double energie , int nbVies )
	//------------------------------------------------------------------------
	{
		this.nom = nom;
		this.energie = energie;
		this.nbVies = nbVies;
	}
	
	//------------------------------------------------------------------------
	public String toString()
	//------------------------------------------------------------------------
	{
		return 
			"Nom:" + nom +
			" Énergie:" + String.format( "%1$1.2f", energie*100 ) + "%" +
			" Nombre de vies:" + nbVies;
	}
	
	//Accesseurs
	//------------------------------------------------------------------------
	public String getNom()
	//------------------------------------------------------------------------
	{
		return nom;
	}
	
	//------------------------------------------------------------------------
	public int getNbVies()
	//------------------------------------------------------------------------
	{
		return nbVies;
	}
	
	//------------------------------------------------------------------------
	public double getEnergie()
	//------------------------------------------------------------------------
	{
		return energie;
	}
	
	//------------------------------------------------------------------------
	public boolean isActif()
	//------------------------------------------------------------------------
	{
		return actif;
	}

	//Mutateurs
	//------------------------------------------------------------------------
	public void setNom( String nom )
	//------------------------------------------------------------------------
	{
		this.nom = nom;
	}
	
	//------------------------------------------------------------------------
	public void setNbVies( int nbVies )
	//------------------------------------------------------------------------
	{
		this.nbVies = nbVies;
	}
	
	//------------------------------------------------------------------------
	public void setEnergie( double energie )
	//------------------------------------------------------------------------
	{
		this.energie = energie;
	}
	
	//------------------------------------------------------------------------
	public void mourir()
	//------------------------------------------------------------------------
	{
		nbVies--;
		energie = 1;
	}

	/**
	 * Cette méthode double l'énergie du personnage
	 */
	//------------------------------------------------------------------------
	public void  energiser()
	//------------------------------------------------------------------------
	{
		energie *= 2;
	}

	/*
	 * Cette méthode affaibli le personnage en diminuant son énergie de
	 * moitié.
	 */
	//------------------------------------------------------------------------
	public void affaiblir()
	//------------------------------------------------------------------------
	{
		energie /= 2;
	}

}