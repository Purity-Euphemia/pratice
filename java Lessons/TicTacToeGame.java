import java.util.Scanner;
public class TicTacToeGame{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	char[][] table = new char[3][3];
	for(int count = 0; count < 3; count++){
		for(int counter = count; counter < 3; counter++){
			table[count][counter] = ' ';


}
}


	char currentPlayer = 'X';

	while(true) {
		System.out.println("Current board:");
		for(int count = 0; count < 3; count++){
		System.out.println(" " + table[count][0] + " | " + table[count][1] + " | " + table[count][2]);
		if(count < 2) {
		System.out.println("-----+------+-----");

}

}
		System.out.println("Player " + currentPlayer + ", enter your move");
	int row, col;



	while(true) {
		System.out.print("Enter row (0, 1, or 2): ");
		row = input.nextInt();
		
		if(row >= 0 && row <= 2) break;
		System.out.println("invalid number. please enter 0, 1, or 2");

}	
		
	while(true) {
		System.out.print("Enter row (0, 1, or 2): ");
		row = input.nextInt();
		
		if(row >= 0 && row <= 2) break;
		System.out.println("invalid number. please enter 0, 1, or 2");

}	
		if(table[row][col] != ' '){
		System.out.println("That spot is already taken. try again.");
		continue;
}

		table[row][col] = currentPlayer;


		if(checkWin(table, currentPlayer)) {
		System.out.println("Current board:");
		for(int count = 0; count < 3; count++){
		System.out.println(" " + table[count][0] + " | " + table[count][1] + " | " + table[count][2]);
		if(count < 2) {
		System.out.println("-----+------+-----");

}

}
		System.out.println("Player " + currentPlayer + ", win! Congratulations");			break;


}	
		if(isTableFull(table)) {
		System.out.println("Current board:");
		for(int count = 0; count < 3; count++){
		System.out.println(" " + table[count][0] + " | " + table[count][1] + " | " + table[count][2]);
		if(count < 2) {
		System.out.println("-----+------+-----");
}
}
		System.out.println("The game is draw");	
		break;



}

		currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';

}

}


}