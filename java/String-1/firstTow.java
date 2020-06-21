/**
 * Given a string, return the string made of its first two chars, so the String "Hello"
 * yields "He". If the string is shorter than length 2, return whatever there is, so "X"
 * yields "X", and the empty string "" yields the empty string "". Note that str.length()
 * returns the length of a string.
 */


public class firstTow {
    public String firstTow(String str) {
        if (str.length() <= 1) return str;
        return str.substring(0, 2);
    }
}
