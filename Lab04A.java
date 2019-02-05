
// Fichier : Lab04A.java
// Date : 2016-09-27
// Description : 12951 : Solution du laboratoire no 4
//============================================================================

import javax.swing.*;

//============================================================================
public class Lab04A 
//============================================================================
{
	//------------------------------------------------------------------------
	public static void main(String[] args) 
	//------------------------------------------------------------------------
	{
		//Déclaration et initialisation des variables
		String nom = "Inconnu";
		int nbHeures = 0;
		double tauxHoraire = 0.0;
		double salaireRegulier = 0.0;
		double salaireSupplementaire = 0.0;
		double salaireSemaine = 0.0;
		
		//Saisie des informations
		nom = JOptionPane.showInputDialog("Nom du travailleur:", "nom").trim();
		nbHeures = Integer.parseInt(JOptionPane.showInputDialog("Nombre d'heures travaillées",0).trim());
		tauxHoraire = Double.parseDouble(JOptionPane.showInputDialog("Taux horire:",0.0).trim());
		
		//Calculs
		if( nbHeures<=40 ) {
			salaireSemaine = salaireRegulier = nbHeures*tauxHoraire;
		}
		else {
			salaireRegulier = 40*tauxHoraire;
			salaireSupplementaire = (nbHeures-40)*tauxHoraire*1.5;
			salaireSemaine = salaireRegulier + salaireSupplementaire;
		}
		
		//Affichage
		afficherLigne();
		System.out.printf("Nom du travailleur: %1$22s\n",nom);
		System.out.printf("Nombre d'heures:              %1$8d\n",nbHeures);
		System.out.printf("Taux horaire:                    %1$8.2f$\n",tauxHoraire);
		System.out.printf("Salaire régulier:                %1$8.2f$\n",salaireRegulier);
		if( nbHeures>40 ) {
			System.out.printf("Salaire supplémentaire:          %1$8.2f$\n",salaireSupplementaire);
		}
		System.out.printf("Salaire Complet pour la semaine: %1$8.2f$\n",salaireSemaine);
		afficherLigne();

	}//Fin de la méthode main
	
	//------------------------------------------------------------------------
	private static void afficherLigne()
	//------------------------------------------------------------------------
	{
		System.out.println("==========================================");
	}
	
}//Fin de la classe Lab04A
