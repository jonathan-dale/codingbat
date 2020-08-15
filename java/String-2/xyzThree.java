/**
 * Return true if the given string contains an appearance of "xyz" where the xyz is not directly
 * preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
 */


public class xyzThree {
    public boolean xyzThree(String str) {
        boolean result = false;
        if (str.length() < 1) return result;
        if (str.equals("xyz")) result = true;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z') {
                if (i < 1 || str.charAt(i - 1) != '.') {
                    result = true;
                }
            }
        }
        return result;
    }
}

