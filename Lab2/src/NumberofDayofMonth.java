import java.util.Scanner;

public class NumberofDayofMonth {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String month, year;
		int numOfDays = -1;
		int yearInt = -1;
		
		System.out.println("Enter a month and a year and i will " + "calculate and display the number of days of that month for you!\n");
		
		do {
			System.out.print("Enter a month: ");
			month = scanner.nextLine();
			// check the validity of the input
			numOfDays = checkValidMonthAndGetNumOfDay(month);
			if (numOfDays == -1) {
				System.out.println("Invalid month. " +
						"For instance, the valid forms for January are \"January\", \"Jan.\", \"Jan\" or \"1\"." +
						"\nPlease re-enter valid input.\n");
			}
		} while (numOfDays == -1);

		do {
			System.out.print("Enter a year: ");
			year = scanner.nextLine();
			yearInt = Integer.parseInt(year);
			if (yearInt < 0) {
				System.out.println("Invalid year. " +
						"The valid form is a non-negative number and is entered all the digit." +
						"\nFor instance, the valid input of the year 1999 is only 1999." +
						"\nPlease re-enter valid input.\n");
			}
		} while (yearInt < 0);
		
		if (numOfDays == 28 && isLeapYear(yearInt) == true) {
			numOfDays = 29;
		}

		System.out.println("The number of days in " +
							month + "/" + year + " is " + numOfDays + " days.");
		scanner.close();
		System.exit(0);
		
	}
	
	private static int checkValidMonthAndGetNumOfDay(String month) {
		switch(month) {
		case "January":	case "Jan.": case "Jan": case "1":
		case "March": case "Mar.": case "Mar": case "3":
		case "May": case "May.": case "5":
		case "July": case "Jul.": case "Jul": case "7":
		case "August": case "Aug.": case "Aug": case "8":
		case "October": case "Oct.": case "Oct": case "10":
		case "December": case "Dec.": case "Dec": case "12":
			return 31;
		case "April": case "Apr.": case "Apr": case "4":
		case "June": case "Jun.": case "Jun": case "6":
		case "September": case "Sep.": case "Sep": case "9":
		case "November": case "Nov.": case "Nov": case "11":
			return 30;
		case "February": case "Feb.": case "Feb": case "2":
			return 28;
		default:
			return -1;
		}
	}
	
	private static boolean isLeapYear(int yearInt) {
        if ((yearInt % 400) == 0) {
            return true;
        } else if ((yearInt % 100) != 0 && (yearInt % 4) == 0) {
            return true;
        } else {
            return false;
        }
    }

}