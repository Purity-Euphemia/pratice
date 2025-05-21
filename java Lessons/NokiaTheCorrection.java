import java.util.Scanner;
public class NokiaTheCorrection{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("WELCOME TO YOUR NOKIA PHONE");

	System.out.println("LIST OF MENU FUNTIONS");


	String MENU = """
	1. Phone book.
	2. Massages.
	3. Chat.
	4. Call register.
	5. Tones.
	6. Settings.
	7. Call divert.
	8. Games.
	9. Calculator.
	10. Remainders.
	11. Clocks.
	12. Profiles.
	13. SIM services.

	""";
	System.out.println(MENU);
	int menu = input.nextInt();

	switch(menu) {
	case 1: {
	String PhoneBook = """
	1. Search.
	2. Services Nos.
	3. Add name.
	4. Erase.
	5. Edit.
	6. Assign tone.
	7. Send b'card.
	8. Options.
	9. Speed dials.
	10. Voice tags.

	""";
	System.out.println(PhoneBook);
	int list = input.nextInt();
	
	switch (list) {
	case 1: System.out.println("Search"); break;

	case 2: System.out.println("Services Nos."); break;

	case 3: System.out.println("Add name."); break;

	case 4: System.out.println("Erase."); break;

	case 5: System.out.println("Edit."); break;
	
	case 6: System.out.println("Assign tone."); break;

	case 7: System.out.println("Send b'card."); break;
	
	case 8: {

	String Options = """
	1. Type of view.
	2. Memory status.

	""";
	System.out.println(Options);	

	int Eight = input.nextInt();

	switch (Eight) {
	case 1: System.out.println("Type of view."); break;

	case 2: System.out.println("Memory status."); break;

	default: System.out.println("Invalid number");
}
} break;

	case 9: System.out.println("Type of view."); break;

	case 10: System.out.println("Memory status."); break;

	default: System.out.println("Invalid number");
}
} break;

	case 2: {

	String Messages = """
	1. Write massages.
	2. Inbox.
	3. Outbox.
	4. Picture massages.
	5. Templates.
	6. Smileys.
	7. Message settings.
	8. Info service.
	9. Voice mailbox number.
	10.Service command editor.

	""";

	System.out.println(Messages);
	int list2 = input.nextInt();

	switch (list2) {
	case 1: System.out.println("Write massages."); break;

	case 2: System.out.println("Inbox."); break;

	case 3: System.out.println("Outbox."); break;

	case 4: System.out.println("Picture massages."); break;

	case 5: System.out.println("Templates."); break;
	
	case 6: System.out.println("Smileys. "); break;
	
	case 7: {

	String MessageSettings = """

	1. Set 1.
	2. Common.
	
	""";
	System.out.println(MessageSettings);
	int One = input.nextInt();

	switch (One) {
	case 1: {

	String Set1 = """

	1. Message center number.
	2. Messages sent as.
	3. Message vaildity.

	""";
	System.out.println(Set1); break;
	int set = input.nextInt();

	switch(set) {

	case 1: System.out.println("Message center number."); break;

	case 2: System.out.println("Messages sent as."); break;
	
	case 3: System.out.println("Message vaildity."); break;
	
	default: System.out.println("Invalid number");
}
} break;

	case 2: {

	String Common = """

	1. Delivery reports.
	2. Reply via same centre.
	3. character support.

	""";
	System.out.println(Common); break;
	int common  = input.nextInt();

	switch(common) {

	case 1: System.out.println("Delivery reports."); break;

	case 2: System.out.println("Reply via same centre."); break;
	
	case 3: System.out.println("character support."); break;
	
	default: System.out.println("Invalid number");
}
} break;

	default: System.out.println("Invalid number");
}
} break;

	case 8: System.out.println("Info service."); break;
	
	case 9: System.out.println("Voice mailbox number."); break;
	
	case 10: System.out.println("Service command editor.");

}
} break;

	case 3: System.out.println("Chat"); break;

	case 4: {

	String CallRegister = """
	1. Missed calls.
	2. Received calls.
	3. Dialled numbers.
	4. Erase recent call lists.
	5. Show call duration.
	6. Show call costs.
	7. Call cost settings.
	8. Prepaid credit.

	""";
	System.out.println(CallRegister);

	int userInput  = input.nextInt();

	switch(userInput) {

	case 1: System.out.println("Missed calls."); break;

	case 2: System.out.println("Received calls."); break;
	
	case 3: System.out.println("Dialled numbers."); break;
	
	case 4: System.out.println("Erase recent call lists."); break;

	case 5: {
	String ShowCallDuration = """

	1. Last call duration.
	2. All calls'duration.
	3. Received calls'duration.
	4. Dialled calls'duration.
	5. Clear timers.
	
	""";
	System.out.println(ShowCallDuration); break;

	int userInput2  = input.nextInt();

	switch(userInput2) {

	case 1: System.out.println("Last call duration."); break;

	case 2: System.out.println("All calls'duration."); break;
	
	case 3: System.out.println("Received calls'duration."); break;
	
	case 4: System.out.println("Dialled calls'duration."); break;

	case 5: System.out.println("Clear timers."); break;
	
	default: System.out.println("Invalid number");
}
} break;

	case 6: {
	String ShowCallCosts = """

	1. Last call cost.
	2. All call's cost.
	3. Clear counters.
	
	""";
	System.out.println(ShowCallCosts); break;

	int userInput3  = input.nextInt();

	switch(userInput3) {

	case 1: System.out.println("Last call cost."); break;

	case 2: System.out.println("All call's cost."); break;
	
	case 3: System.out.println("Clear counters."); break;
		
	default: System.out.println("Invalid number");
}
} break;

	case 7: {
	String CallCostSettings = """

	1. Call cost limit.
	2. Show costs in.
	
	""";
	System.out.println(CallCostSettings); break;
	
	int userInput4  = input.nextInt();

	switch(userInput4) {

	case 1: System.out.println("Call cost limit."); break;

	case 2: System.out.println("Show costs in."); break;
		
	default: System.out.println("Invalid number");
}
} break;

	case 8: System.out.println("Prepaid credit."); break;
		
	default: System.out.println("Invalid number");
}
} break;


	case 5: {
	
	String Tones = """ 
	1. Ringing tone.
	2. Ringing volume.
	3. Incoming call alert.
	4. Composer.
	5. Message alert tone.
	6. Keypad tones.
	7. Warning and game tones.
	8. Vibrating alert.
	9. Screen saver.

	""";
	System.out.println(Tones);

	int userInput5  = input.nextInt();

	switch(userInput5) {

	case 1: System.out.println("Ringing tone."); break;

	case 2: System.out.println("Ringing volume."); break;

	case 3: System.out.println("Incoming call alert."); break;
	
	case 4: System.out.println("Composer."); break;

	case 5: System.out.println("Message alert tone."); break;

	case 6: System.out.println("Keypad tones."); break;
	
	case 7: System.out.println("Warning and game tones."); break;

	case 8: System.out.println("Vibrating alert."); break;

	case 9: System.out.println("Screen saver."); break;
		
	default: System.out.println("Invalid number");
}
} break;

	case 6: {
	
	String Settings = """
	1. Call Settings.
	2. Phone settings.
	3. Security settings.
	4. Restore factory settings.

	""";
	System.out.println(Settings);
	int Six = input.nextInt();

	switch(Six) {

	case 1: {
	String CallSettings = """

	1. Automatic redial.
	2. Speed dialling.
	3. Call waiting options.
	4. Own number sending.
	5. Phone line in use.
	6. Automatic answer.
	
	""";
	System.out.println(CallSettings); break;

	int userInput6  = input.nextInt();

	switch(userInput6) {

	case 1: System.out.println("Automatic redial."); break;

	case 2: System.out.println("Speed dialling."); break;

	case 3: System.out.println("Call waiting options."); break;

	case 4: System.out.println("Own number sending."); break;

	case 5: System.out.println("Phone line in use."); break;

	case 6: System.out.println("Automatic answer."); break;
			
	default: System.out.println("Invalid number");
}
} break;
	case 2: {
	String PhoneSettings = """

	1. Language.
	2. Cell info display.
	3. Welcome note.
	4. Network selection.
	5. Lights.
	6. Confirm SIM service actions.
	
	""";
	System.out.println(PhoneSettings); break;

	int userInput7  = input.nextInt();

	switch (userInput7) {

	case 1: System.out.println("Language."); break;

	case 2: System.out.println("Cell info display."); break;

	case 3: System.out.println("Welcome note."); break;

	case 4: System.out.println("Network selection."); break;

	case 5: System.out.println("Lights."); break;

	case 6: System.out.println("Confirm SIM service actions."); break;
			
	default: System.out.println("Invalid number");
}
} break;

	case 3: {
	String SecuritySettings = """

	1. PIN code request.
	2. Call barring service.
	3. Fixed dialling.
	4. Closed user group.
	5. Phone security.
	6. Change access codes.
	
	""";
	System.out.println(SecuritySettings); break;

	int userInput8  = input.nextInt();

	switch (userInput8) {

	case 1: System.out.println("PIN code request."); break;

	case 2: System.out.println("Call barring service."); break;

	case 3: System.out.println("Fixed dialling."); break;

	case 4: System.out.println("Closed user group."); break;

	case 5: System.out.println("Phone security."); break;

	case 6: System.out.println("Change access codes."); break;
			
	default: System.out.println("Invalid number");
}
} break;

	case 4: System.out.println("Restore factory settings."); break;
		
	default: System.out.println("Invalid number");
}
} break;

	case 7: System.out.println("Call divert"); break;

	case 8: System.out.println("Games"); break;

	case 9: System.out.println("Calculator"); break;

	case 10: System.out.println("Remainders"); break;
	
	case 11: {

	String Clocks = """

	1. Alarm clock.
	2. Clock settings.
	3. Date setting.
	4. Stopwatch.
	5. Countdown timer.
	6. Auto update of date and time.
	
	""";
	System.out.println(Clocks);

	int userInput9  = input.nextInt();

	switch (userInput9) {

	case 1: System.out.println("Alarm clock."); break;

	case 2: System.out.println("Clock settings."); break;

	case 3: System.out.println("Date setting."); break;

	case 4: System.out.println("Stopwatch."); break;

	case 5: System.out.println("Countdown timer."); break;

	case 6: System.out.println("Auto update of date and time."); break;
			
	default: System.out.println("Invalid number");
}
} break;


	case 12: System.out.println("Profiles"); break;

	case 13: System.out.println("SIM services"); break;

	default: System.out.println("Invalid number");
}



}
}


