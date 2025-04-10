import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine().trim();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine().trim();

        boolean result = areAnagrams(str1, str2);

        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + result);

        scanner.close();
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}