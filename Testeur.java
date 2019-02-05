import javax.swing.JOptionPane;

public class Testeur {

	public static void main(String[] args) {
		Personnage p1 = new Personnage();
		Personnage p2 = new Personnage( "ThugLifexx69" );
		Personnage p3 = new Personnage( "FaZe Micheeel" , 0.5 , 10 );
		System.out.println( p1 );
		System.out.println( p2 );
		System.out.println( p3 );
		p1.setEnergie( 0.25 );
		
			
		

	}

}
