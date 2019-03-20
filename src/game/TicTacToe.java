package game;

/**
 * Die Klasse dient als Vorlage f�r ein TicTacToe-Spiel. Das Spielbrett
 * besitzt eine Dimension von 3 x 3 Spielfeldern, in denen "x" oder "o"
 * eingetragen werden kann. Die Eintr�ge werden in einer Matrix
 * verwaltet.
 * 
 * @author DI Martin Kampenhuber
 * @version 1.0
 */
public class TicTacToe {
	
	// Das Brett besteht aus 3 x 3 Feldern, in die der
	// Aufz�hlungstyp X oder O eingetragen werden kann
	private XorO[][] brett = new XorO[3][3];
		
	/**
	 *  Die Darstellung des Brettes am Bildschirm
	 */
	public void printBrett() {
		System.out.println("  +---+---+---+");
		int i = 0;	//i-te Zeile
		for (XorO[] zeile : brett) {
			System.out.print(i + " | ");
			for (XorO feld : zeile) {
				if (feld != null) {
					System.out.print(feld);
				} else {
					System.out.print(" ");
				}
				System.out.print(" | ");
			}
			System.out.println();
			System.out.println("  +---+---+---+");
			i++;
		}
		System.out.println("    0   1   2");
	}
	public boolean insertAt(int x, int y, boolean Spieler) throws TicTaCToeTakenException {
		
		if (brett[x][y] != null) {
			return false;
		}
		
		if(Spieler)
		{
			brett[x][y] = XorO.X;
		}
		else if(!Spieler)
		{
			brett[x][y] = XorO.O;
		}
		
		return true;
	}



	public boolean checkEnd() {
		//alle Felder besetzt?
		int anzahl = 0;
		for (XorO[] zeile : brett) {
			for (XorO feld : zeile) {
				if (feld != null) {
					anzahl++;
				}
			}
		}
		if (anzahl >= 9) {
			return true;	//Alle Felder waren besetzt
		}
		//Zeilen pr�fen
		for (int i = 0; i < 3; i++) {
			//ist Zeile �berhaupt voll?
			boolean zeilevoll = true;
			if ((brett[i][0] == null) || (brett[i][1] == null) ||(brett[i][2] == null)) {
				zeilevoll = false;
			}
			//sind in Zeile alle Eintr�ge gleich?
			if (zeilevoll) {
				if (brett[i][0] == brett[i][1] &&
					brett[i][0] == brett[i][2]) {
					return true;
				}
			}
		}
		//Spalten pr�fen
		for (int i = 0; i < 3; i++) {
			//ist Spalte �berhaupt voll?
			boolean spaltevoll = true;
			if ((brett[0][i] == null) || (brett[1][i] == null) ||(brett[2][i] == null)) {
				spaltevoll = false;
			}
			//sind in Spalte alle Eintr�ge gleich?
			if (spaltevoll) {
				if (brett[0][i] == brett[1][i] &&
					brett[0][i] ==brett[2][i]) {
					return true;
				}				
			}
		}
		//Diagonale v. links oben nach rechts unten pr�fen
		//ist Diagonale voll?
		boolean diagonalevoll = true;
		if ((brett[0][0] == null) || (brett[1][1] == null) ||(brett[2][2] == null)) {
			diagonalevoll = false;
		}		
		if (diagonalevoll) {
			if (brett[0][0] == brett[1][1] &&
			    brett[0][0] == brett[2][2]) {
				return true;
			}
		}
		//Diagonale v. links unten nach rechts oben pr�fen
		diagonalevoll = true;
		if ((brett[2][0] == null) || (brett[1][1] == null) ||(brett[0][2] == null)) {
			diagonalevoll = false;
		}		
		if (diagonalevoll) {
			if (brett[2][0] == brett[1][1] &&
				brett[2][0] == brett[0][2]) {
				return true;
			}
			
		}
		//jetzt bleibt nur mehr �brig, dass Spiel noch nicht fertig ist
		return false;
	}
}
