/**
 * Given a string, return a string where for every char in the original, there are two chars.
 */


public class doubleChar {
    public String doubleChar(String str) {
        String result = new String();
        for (int i=0; i<str.length(); i++) {
            result += str.charAt(i) + str.charAt(i);
        }
        return result;
    }
}
