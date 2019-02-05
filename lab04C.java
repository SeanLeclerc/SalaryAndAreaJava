import javax.swing.*;

public class lab04C {

	public static void main(String[] args) {
		//Saisie donne
		double a = Double.parseDouble(JOptionPane.showInputDialog("Cote a:"," 0.0"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Cote b:"," 0.0"));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Cote c:"," 0.0"));
		//Validation
		if( a<=0.0 || b<=0.0 || c<=0.0 ) {
			JOptionPane.showInputDialog(
					null, "Un des cotes est negatif!" + "a: " + a + " b:" + b + " c:" + c);
		}
		else if( a+b<c ) {
			JOptionPane.showInputDialog( null, "La somme de a et b est inferieur c");
		}
		else if( a+c<b ) {
			JOptionPane.showInputDialog( null, "La somme de a et c est inferieur b");
		}
		else if( c+b<a ) {
			JOptionPane.showInputDialog( null, "La somme de b et c est inferieur a");
		}
		else { 
			//Le triangle est bon
			double s = (a+b+c)/2;
			double aire = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			//affichage des resultats
			String reponse = "Triangle: " + a + " " + b + " " + c + "\n";
			reponse += "Aire = " + aire;
			JOptionPane.showMessageDialog(null,reponse);
		}
	}
}


