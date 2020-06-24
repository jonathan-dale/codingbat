/**
 * Return the number of times that the string "code" appears anywhere in the given
 * string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
 */


public class countCode {
    public int countCode(String str) {
        int result = 0;
        for (int i=0; i<str.length()-3; i++) {
            if (str.substring(i,i+2).equals("co")) {
                if (str.charAt(i+3)=='e') {
                    result++;
                }
            }
        }
        return result;
    }
}
