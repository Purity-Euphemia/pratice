import java.util.Scanner;
public class GenaratingRandomNumbers{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int counter1 = 0;
	int counter2 = 0;

for(int counter = 1; counter <= 10; counter++) {

int substractOne = (int)(Math.random() * 100);
int substractTwo = (int)(Math.random() * 100);

for(int count = 1; count <= 2; count++) {

System.out.println("what is: " +  substractOne + " - " + substractTwo + ":");

int userInput = input.nextInt();

	int result = substractOne - substractTwo;


	if (userInput != result){
	System.out.println("incorrect answer");
	counter1++;
	
}

	if (userInput == result){
	System.out.println("correct");
	counter2++;
	break;
}
}
	
}	
	System.out.println("the number of correct input" + counter1);
	System.out.println("the number of wrong input" + counter2);

}
}