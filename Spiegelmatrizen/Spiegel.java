
public class Spiegel {
	
	static boolean[][] mirror(int a, int b, boolean[][] matriz)
	{

		boolean[][] spiegelmatriz= new boolean[a][b];
		
		
		for (int i = 0; i < matriz.length; i++) {
			int k=0;
			for (int j = b-1; j >= 0; j--) {
				
				spiegelmatriz[i][k++]= matriz[i][j];
			}
		}
		return spiegelmatriz;
	}
	static void ausgabe(boolean[][] matriz , boolean[][] spiegelmatriz)
	{
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("###################################");
		for (int i = 0; i < spiegelmatriz.length; i++) {
			for (int j = 0; j < spiegelmatriz[0].length; j++) {
				System.out.print(spiegelmatriz[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		
		boolean[][] matriz={{true,true,true},{false,true,false},{true,false,true}};
		
		boolean[][]spiegelmatriz=mirror(3,3,matriz);
		ausgabe(matriz,spiegelmatriz);

		
	}

}
