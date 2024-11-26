import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month: ");
        int month = scanner.nextInt();

        Month m = new Month(month);
        System.out.println(m.getLength() + " days");
    }
}

class Month {
    private int month;

    public Month(int month) {
        this.month = month;
    }

    public int getLength() {
        return (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) ? 31 :
                (month == 4 || month == 6 || month == 9 || month == 11) ? 30 :
                        28;
    }
}
