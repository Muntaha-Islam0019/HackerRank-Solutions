import java.time.LocalDate;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LocalDate actualReturnDate = readDate(scanner);
        LocalDate expectedReturnDate = readDate(scanner);

        int fine = 0;

        if (actualReturnDate.isEqual(expectedReturnDate) ||
                actualReturnDate.isBefore(expectedReturnDate)) {
            fine = 0;
        } else if (actualReturnDate.getMonth() == expectedReturnDate.getMonth()
         && actualReturnDate.getYear() == expectedReturnDate.getYear()) {
            fine = 15 * (actualReturnDate.getDayOfMonth() -
                    expectedReturnDate.getDayOfMonth());
        } else if (actualReturnDate.getYear() == expectedReturnDate.getYear()) {
            fine = 500 * (actualReturnDate.getMonthValue() -
                    expectedReturnDate.getMonthValue());
        } else {
            fine = 10000;
        }

        System.out.println(fine);
    }

    private static LocalDate readDate(Scanner scanner) {

        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        return LocalDate.of(year, month, day);
    }
}
