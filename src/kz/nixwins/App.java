package kz.nixwins;

import java.io.IOException;

public class App {
	
		private PrinterQueens printer = new PrinterQueens();
		private String[][] queens = new String[8][8];
		
		public static void main(String[] args) {
			
			final App app = new App();
			app.initQueens();
			try {
				System.out.println("Press anykey");
				System.in.read();
				System.out.println("Exit");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		private void initQueens() {
			
			for(int i=0; i<8; i++) {
				for(int j=0; j<8; j++) {
					this.queens[i][j] = "f";
				}
			}
			
			this.setQueen(0);
		}
		
		private void setQueen(final int row) {
			int col;
			if(row == 8) { 
				this.printer.print(this.queens);
			}else {
				for(col = 0; col < 8; col++) {
					if(this.isSafe(row, col)) {
						this.queens[row][col] = "Q";
						this.setQueen(row + 1);
					}
					this.queens[row][col] = "f";	
				}
			}
			
		}
		
		private boolean isSafe(final int row,final int col) {
			int i;
			int j;
			
			// Проверка верхней границ
			for(i = row - 1, j = col; i >=0; i--) {
				if(this.queens[i][j].contains("Q")) return false;
			}
			
			//Проверка верхнем левом диоганали
			for(i = row -1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
				if(this.queens[i][j].contains("Q")) {
					return false;
				}
			}
			
			//Проверка верхнем правом диоганали 
			for(i = row - 1, j = col + 1; i >= 0 && j < 8; i--, j++) {
				if(this.queens[i][j].contains("Q")) {
					return false;
				}
			}
			
			return true;
		}
		
}
