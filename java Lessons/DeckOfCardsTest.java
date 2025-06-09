public class DeckOfCardsTest {
	public static void main(String[] args) {
	DeckOfCards2 myDeckOfCards2 = new DeckOfCards2();
	myDeckOfCards2.shuffle();


	for (int count = 1; count <= 52; count++) {
		System.out.printf("%-19s", myDeckOfCards2.dealCard());

	if (count % 4 == 0) {
		System.out.println();

}

}


}
}