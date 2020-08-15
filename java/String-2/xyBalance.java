/**
 * We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y'
 * char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance
 * multiple 'x's. Return true if the given string is xy-balanced.
 */


public class xyBalance {
    public boolean xyBalance(String str) {

        for (int i=str.length(); i >= 0; i--) {
            if (str.charAt(i) == 'y') {
                for (int j = i - 1; j >= 0; j--) {
                    if (str.charAt(j) == 'x') {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

