import java.util.Scanner;
public class MenstralCycleTracker {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

System.out.println("=== Menstral Cycle Tracker ===");

System.out.print("Enter the date of your last period started (e.g 2024): ");
int year = input.nextInt();

System.out.print("Enter the month (1-12): ");
int month = input.nextInt();

System.out.print("Enter the day (1-31): ");
int day = input.nextInt();


System.out.print("How many days is your usual cycle? (e.g 28): ");
int cycleLength = input.nextInt();

int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

int nextYear = year;

int nextMonth = month;

int nextDay = day + cycleLength;

while (true) {
	
	int maxDaysThisMonth = daysInMonth[nextMonth];

	if (nextDay <= maxDaysThisMonth) {		
		break;
	}

	nextDay = nextDay - maxDaysThisMonth;
	nextMonth += 1;
	if (nextMonth > 12) {
		nextMonth = 1;
		
		nextYear += 1;
	}

}

int afterYear = nextYear;
int afterMonth = nextMonth;
int afterDay = nextDay + cycleLength;

while (true) {

	int maxDaysThisMonth = daysInMonth[afterMonth];

	if (afterDay <= maxDaysThisMonth) {		
		break;

}
	int afterDay = afterDay - maxDaysThisMonth;
	afterMonth += 1;
	if (afterMonth > 12) {
		afterMonth = 1;
		
		afterYear += 1;


System.out.print("\n--- predicted period dates ---");
System.out.println("your last period started on:  " + year + "-" + formatTwoDigits(month) + "-" + formatTwoDigits(day));
System.out.println("your next period should start on:  " +  nextYear + "-" + formatTwoDigit(nextMonth) + "-" + formatTwoDigits(nextDay));
System.out.println("your one after that should start on:  " + afterYear + "-" +  formatTwoDigits(afterMonth) + "-" + formatTwoDigits(afterDay));