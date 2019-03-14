package dialog;
import game.*;
import java.util.*;

public class Dialog {

	/**
	 * Die main-Methode f�hrt den Dialog f�r das TicTacToe-Spiel. Es wird solange gespielt
	 * bis entweder alle Felder voll sind oder eine Reihe von gleichen Strings
	 * eingetragen wurde.
	 * 
	 * @param args keine Verwendung
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TicTacToe ttt = new TicTacToe();
		//Einstieg
		System.out.println("Willkommen zum TicTacToe der HTL-Anichstrasse!");
		ttt.printBrett();
		System.out.println("Geben sie ihre Koordinaten in der Form 'x y' ein!");
		boolean ende = false;
		Spieler spieler = Spieler.CROSS;	//CROSS beginnt
		while (!ende) {
			System.out.print("Spieler " + spieler + ": ");
			String eingabe = scan.nextLine();
			String[] zahlen = eingabe.split(" ");
			try
			{
			int x = new Integer(zahlen[0]);
			int y = new Integer(zahlen[1]);
			if (spieler == Spieler.CROSS) {
				ende = ttt.insertCrossAt(x, y);
				spieler = Spieler.CIRCLE;
			} else {
				ende = ttt.insertCircleAt(x, y);
				spieler = Spieler.CROSS;
			}
			ttt.printBrett();
		}catch (java.lang.ArrayIndexOutOfBoundsException e)
			{
			 System.out.println("Die Eingabe ist falsch formatiert oder zuhoch");
			}
		catch( java.lang.NumberFormatException e)
			{
			System.out.println("Die Eingabe ist keine Zahl");
			}

		}	
		System.out.println("Das Spiel wurde beendet!");
	}
}
