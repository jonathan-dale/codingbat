/**
 * Given 2 strings, a and b, return a string of the form short+long+short, with the shorter
 * string on the outside and the longer string on the inside. The strings will not be the same
 * length, but they may be empty (length 0).
 */


public class comboString {
    public String comboString(String a, String b) {
        String longer = (a.length() > b.length()) ? a : b;
        String shorter = (longer.equals(a)) ? b : a;
        return shorter + longer + shorter;
    }
}
