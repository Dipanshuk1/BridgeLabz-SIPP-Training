import java.util.Scanner;

public class prob38_CalendarDisplay {

    static final String[] monthNames = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    static final int[] monthDays = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 1) { 
            return isLeapYear(year) ? 29 : 28;
        }
        return monthDays[month];
    }

    public static int getFirstDay(int month, int year) {
        if (month < 2) {
            month += 12;
            year -= 1;
        }
        int q = 1;
        int m = month + 1;
        int k = year % 100;
        int j = year / 100;
        int h = (q + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        return (h + 6) % 7; 
    }

    public static void printCalendar(int month, int year) {
        String monthName = monthNames[month];
        int days = getDaysInMonth(month, year);
        int startDay = getFirstDay(month, year);

        System.out.printf("     %s %d\n", monthName, year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d", day);
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt() - 1;
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (month < 0 || month > 11 || year <= 0) {
            System.out.println("Invalid month or year.");
            return;
        }

        printCalendar(month, year);
    }
}
