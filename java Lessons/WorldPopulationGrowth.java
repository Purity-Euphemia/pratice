public class WorldPopulationGrowth{
	public static void main(String[] args){

	double population = 80000000000.0;
	double growthRate = 1.05;
	int totalYears = 75;
	int startYear = 2025;

	double doublePopulation = population * 2;

	int yearToDouble = -1;

	System.out.println("Year\tPopulation\tIncrease");
		
	for(int year = 1; year <= totalYears; year++){

	int currentYear = startYear + 1;

	double increase = population * growthRate / 100;

	population = population + increase;

	System.out.println(currentYear + "   " + population + "      " + increase);

	if(yearToDouble == -1 && population >= doublePopulation){

	yearToDouble = currentYear;


}

}

	if(yearToDouble != -1){
	System.out.println("\nThe population will double in " + yearToDouble + "years.");

}

	else {

	System.out.println("\nThe population did not double in 75 years.");
}







}
}