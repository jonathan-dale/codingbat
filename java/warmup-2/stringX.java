/**
 * Given a string, return a version where all the "x" have been removed.
 * Except an "x" at the very start or end should not be removed.
 */

public class stringX {
    public String stringX(String str) {
        if (str.length() < 2) return str;
        String result = str.substring(0, 1);
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.substring(i, i + 1).equals("x")) {
                continue;
            } else {
                result += str.substring(i, i + 1);
            }
        }
        result += str.substring(str.length() - 1);
        return result;
    }
}

/**

This way is a little more complicated...use char array
public class stringX {
    public String stringX(String str) {
        if (str.length() < 2) {
            return str;
        }

        char[] result = new char[str.length()];
        result[0] = str.charAt(0);

        int counter = 1;
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != 'x') {
                result[counter] = str.charAt(i);
                counter++;
            }
        }
// set the last char
        result[counter] = str.charAt(str.length()-1);
        counter++;
        return new String (result, 0, counter);
    }
}

 */


