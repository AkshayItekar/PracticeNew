import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = "textbook";
        System.out.println(halvesAreAlike(name));
    }


    public static boolean halvesAreAlike(String s) {
        String a = s.substring(0, s.length() / 2);
        String b = s.substring(s.length() / 2);
        int count = 0;
        int count2 = 0;

        for (int i = 0; i < a.length(); i++) {
            boolean flag = checkVowel(a.charAt(i));
            if (flag) {
                count++;
            }
        }
        for (int i = 0; i < b.length(); i++) {
            boolean flag = checkVowel(b.charAt(i));
            if (flag) {
                count2++;
            }
        }
        if (count == count2) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkVowel(char a) {
        String VOWELS = "aeiouAEIOU";
        return VOWELS.indexOf(a) != -1;

    }
}