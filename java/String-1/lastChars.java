/**
 * Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
 * so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
 */


public class lastChars {
    public String lastChar(String a, String b) {
        if (a.length()<1) a = "@";
        if (b.length()<1) b = "@";
        return a.substring(0,1) + b.charAt(b.length()-1);
    }
}
