package kz.nixwins;

import static java.lang.System.out;

public class PrinterQueens {
	
	private static int count = 0;
	
	public void print(final String[][] queens) {
		
		int i;
		int j;
		
		 out.println(++PrinterQueens.count);
		 
		for(i = 0; i < 8; i++) {
			for(j = 0; j < 8; j++) {
				out.printf("%2s", queens[i][j]);
			}
			out.printf("\n");
		}
		out.printf("\n");
	}
	
	private void board(final int[][] queens) {
		
		for (int row = 0; row < 8; row++)
		  {
		      System.out.println("");
		      System.out.println("---------------------------------");

		      for (int column = 0; column < 8; column++)
		      {
		          System.out.print("| " + queens[row][column] + " ");
		      }       
		      System.out.print("|");
		    }
		    System.out.println("");
		    System.out.println("---------------------------------");
	}
}
