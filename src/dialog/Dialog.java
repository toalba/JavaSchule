package dialog;

import game.*;
import java.util.*;

public class Dialog {

	/**
	 * Die main-Methode f�hrt den Dialog f�r das TicTacToe-Spiel. Es wird solange
	 * gespielt bis entweder alle Felder voll sind oder eine Reihe von gleichen
	 * Strings eingetragen wurde.
	 * @param args keine Verwendung
	 */
	public static void main(String[] args) throws TicTaCToeTakenException {
		Scanner scan = new Scanner(System.in);
		TicTacToe ttt = new TicTacToe();
		// Einstieg
		System.out.println("Willkommen zum TicTacToe der HTL-Anichstrasse!");
		ttt.printBrett();
		System.out.println("Geben sie ihre Koordinaten in der Form 'x y' ein!");
		boolean player = true;
		Spieler spieler = Spieler.CROSS; // CROSS beginnt
		while (!ttt.checkEnd()) {
			if (player) {
				spieler = Spieler.CROSS;
			} else if (!player) {
				spieler = Spieler.CIRCLE;
			}
			System.out.print("Spieler " + spieler + ": ");
			String eingabe = scan.nextLine();
			String[] zahlen = eingabe.split(" ");
			if(ttt.checkEnd())
				{
					System.out.println("Spiel zu Ende");
				}
		try {
				int y = new Integer(zahlen[0]);
				int x = new Integer(zahlen[1]);

				if (!ttt.insertAt(x, y, player)) {
					throw new TicTaCToeTakenException("Bereits besetzt");
				} else {
					ttt.insertAt(x, y, player);
					player = !player;

				}

				ttt.printBrett();
			} catch (java.lang.ArrayIndexOutOfBoundsException e) {
				System.out.println("Die Eingabe ist falsch formatiert oder zuhoch");
			} catch (java.lang.NumberFormatException e) {
				System.out.println("Die Eingabe ist keine Zahl");
			} catch (TicTaCToeTakenException e) {
				System.out.println("Feld bereits besetzt!");
			}
			finally{
				scan.close();
			}
			

		}
		System.out.println("Das Spiel wurde beendet!");
		scan.close();
	}
}
