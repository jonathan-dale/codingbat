/**
 *
 * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak"
 * are removed, but the "a" can be any char. The "yak" strings will not overlap.
 */

public class stringYak {


    public static void main(String[] args) {
        System.out.println();
        System.out.println("Here is the first test: yakpak");
        String string1 = stringYak("yakpak");
        System.out.println("Result = " + string1);
        System.out.println();
        System.out.println();
        System.out.println("Here is the second test: yakxxxyak");
        String string2 = stringYak("yakxxxyak");
        System.out.println("Result = " + string2);
        System.out.println();

    }

    public static String stringYak(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i+2 < str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
                i += 2;
            } else result = result + str.charAt(i);
        }

        return result;
    }
}
