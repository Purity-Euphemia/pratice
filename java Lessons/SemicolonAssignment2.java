import java.security.SecureRandom;
import java.util.Scanner;
public class SemicolonAssignment2{
	public static void main(String[] args){
	SecureRandom randomNumbers = new SecureRandom();
	Scanner input = new Scanner(System.in);
	System.out.println();
	System.out.println("WELCOME TO SEMICOLON ASSIGNMENT");
	System.out.println();
	System.out.println("QUESTIONS.");
	//while(true) {

	int counter1 = 0;
	int counter2 = 0;
	int count = 0;
	for(count = 1; count < 10; count++) {


	System.out.println("Pick from 1 to 10.");
	int menu = input.nextInt();
	
	switch(menu) {
	case 1: {
	String question1 = """

	Question(NO1). "what number matches this alphabet "A"???"

	1. Cat.
	2. Ball.
	3. Apple.
	4. Egg.
	5. Esey.

	""";
	System.out.println(question1);
	int list = input.nextInt();
	int answer = 3;

	if (list == answer) {
		System.out.println("correct");
		counter2++;
}
	else {
		System.out.println("wrong");
		counter1++;
}	

}	
	break;


	case 2: {
	String question1 = """

	Question(NO2). "what number matches this alphabet "B"???"

	1. Cat.
	2. Ball.
	3. Apple.
	4. Egg.
	5. Esey.

	""";
	System.out.println(question1);
	int list2 = input.nextInt();
	int answer = 2;

	if (list2 == answer) {
		System.out.println("correct");
		counter2++;
}
	else {
		System.out.println("wrong");
		counter1++;	

}	
	break;
}

	case 3: {
	String question1 = """

	Question(NO3). "what number matches this alphabet "C"???"

	1. Cat.
	2. Ball.
	3. Apple.
	4. Egg.
	5. Esey.

	""";
	System.out.println(question1);
	int list3 = input.nextInt();
	int answer = 1;

	if (list3 == answer) {
		System.out.println("correct");
		counter2++;
}
	else {
		System.out.println("wrong");
		counter1++;
}	
	break;
}

	case 4: {
	String question1 = """

	Question(NO4). "what number matches this alphabet "D"???"

	1. Cat.
	2. Ball.
	3. Apple.
	4. Egg.
	5. Dog.

	""";
	System.out.println(question1);
	int list4 = input.nextInt();
	int answer = 5;

	if (list4 == answer) {
		System.out.println("correct");
		counter2++;
}
	else {
		System.out.println("wrong");
		counter1++;	

}	
	break;
}

	case 5: {
	String question1 = """

	Question(NO5). "what number matches this alphabet "E"???"

	1. Cat.
	2. Ball.
	3. Apple.
	4. Egg.
	5. Dog.

	""";
	System.out.println(question1);
	int list5 = input.nextInt();
	int answer = 4;

	if (list5 == answer) {
		System.out.println("correct");
		counter2++;
}
	else {
		System.out.println("wrong");
		counter1++;	

}	
	break;
}

	case 6: {
	String question1 = """

	Question(NO6). "what number matches this alphabet "Z"???"

	1. Cat.
	2. Fish.
	3. Apple.
	4. Sweet.
	5. Zen.

	""";
	System.out.println(question1);
	int list6 = input.nextInt();
	int answer = 5;

	if (list6 == answer) {
		System.out.println("correct");
		counter2++;
}
	else {
		System.out.println("wrong");
		counter1++;	

}	
	break;
}

	case 7: {
	String question1 = """

	Question(NO7). "what number matches this alphabet "S"???"

	1. Cat.
	2. Fish.
	3. Apple.
	4. Sweet.
	5. Zen.

	""";
	System.out.println(question1);
	int list7 = input.nextInt();
	int answer = 4;

	if (list7 == answer) {
		System.out.println("correct");
		counter2++;
}
	else {
		System.out.println("wrong");
		counter1++;	

}	
	break;
}


	case 8: {
	String question1 = """

	Question(NO8). "what number matches this alphabet "F"???"

	1. Cat.
	2. Fish.
	3. Apple.
	4. Sweet.
	5. Zen.

	""";
	System.out.println(question1);
	int list8 = input.nextInt();
	int answer = 2;

	if (list8 == answer) {
		System.out.println("correct");
		counter2++;
}
	else {
		System.out.println("wrong");
		counter1++;	

}	
	break;
}

	case 9: {
	String question1 = """

	Question(NO9). "what number matches this alphabet "K"???"

	1. horn.
	2. Fish.
	3. Kinft.
	4. little.
	5. Zen.

	""";
	System.out.println(question1);
	int list9 = input.nextInt();
	int answer = 3;

	if (list9 == answer) {
		System.out.println("correct");
		counter2++;
}
	else {
		System.out.println("wrong");
		counter1++;
		

}	
	break;
}

	case 10: {
	String question1 = """

	Question(NO10). "what number matches this alphabet "L"???"

	1. horn.
	2. Fish.
	3. Kinft.
	4. little.
	5. Zen.

	""";
	System.out.println(question1);
	int list10 = input.nextInt();
	int answer = 4;
	if (list10 == answer) {
		System.out.println("correct");
		counter2++;

}
	else {
		System.out.println("wrong");
		counter1++;	

}	
	break;
}

}

}
	int totalCounter = counter1 + counter2;
	System.out.println("The number of wrong input: " + counter1 + " out of " + count);
	System.out.println("The number of correct input: " + counter2 + " out of " + count);
	System.out.println("The number of total question answer: " + totalCounter);
}
}