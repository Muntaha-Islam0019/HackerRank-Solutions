import java.util.*;

public class SolutionOfDay28InHackerRank {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        LinkedList<String> aList = new LinkedList<>();

        for (int NItr = 0; NItr < N; NItr++) {

            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];

            if (emailID.contains("@gmail.com")) {
                aList.add(firstName);
            }
        }

        Collections.sort(aList);

        Iterator<String> iterator = aList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close();
    }
}
