import java.util.Scanner;
	public class SimpleTicTacToe{
	public static char[][] table = {

		{' ', ' ', ' '},
		{' ', ' ', ' '},
		{' ', ' ', ' '},

};

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char player = 'A';
		Boolean gameOver = false;


		System.out.println("Welcome to the Tic Tac Toe");
		System.out.println("player A and player O take turns");
		System.out.println("Enter row and column numbers(1 to 3)");


		while(true) {
			printTable();



		System.out.println("player " + player + ", enter your move: ");
		System.out.print("Row (1-3): ");
		int row = input.nextInt() - 1;
		
		System.out.print("column (1-3): ");
		int col = input.nextInt() - 1;


		if(row >= 0 && row < 3 && col >= 0 && col < 3){
			if(table[row][col] == ' '){
			table[row][col] = player;
	
			if(checkWinner(player)){
				printTable();
				System.out.println("player " + player + " wins");
				break;				
				
		}	else if(isTableFull()) {
				printTable();
				System.out.println("it's a draw");
				break;

		}	else{
				if(player == 'A'){
					player = 'O';

			}	else{
					player = 'A';

}


	}
		} else {
			System.out.println("That space is already taken. try again");

}

}	else {
		System.out.println("invalid input. please enter numbers between 1 and 3");
}
}


}

	public static void printTable() {
		System.out.println("------------------");
		for(int count = 0; count < 3; count++) {
			System.out.print("| ");
			for(int counter = 0; counter < 3; counter++) {
				System.out.print(table[count][counter] + " | ");


		}

			System.out.println();
			System.out.println("-----------------");


}
}

	public static boolean isTableFull() {
		for (int count = 0; count < 3; count++) {
			for (int counter = 0; counter < 3; counter++) {

				if (table[count][counter] == ' ') {
					return false;

} 
}
}
		return true;

}


	public static boolean checkWinner(char player) {

		for (int count = 0; count < 3; count++) {
			if ((table[count][0] == player && table[count][1] == player && table[count][2] == player) || (table[0][count] == player && table[1][count] == player && table[2][count] == player)) {
				return true;


}


}
			if ((table[0][0] == player && table[1][1] == player && table[2][2] == player) || (table[0][2] == player && table[1][1] == player && table[2][0] == player)) {
				return true;

		
}
		return false;


}
}