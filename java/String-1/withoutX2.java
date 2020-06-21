/**
 * Given a string, if one or both of the first 2 chars is 'x', return the string without
 * those 'x' chars, and otherwise return the string unchanged.
 * This is a little harder than it looks.
 */


public class withoutX2 {
    public String withoutX2(String str) {

        if (str.length()<=1 || str.equals("x")) return "";

        // check both chars
        if (str.charAt(0) == 'x') {
            if (str.length()>=1) {
                if (str.charAt(1) == 'x') {
                    return str.substring(2);
                }
            }
            //only first char is 'x'
            return str.substring(1);
        }


        // if we get here first char is not 'x'
        // only check first one
        if (str.charAt(1) == 'x') {
            str = str.charAt(0) + str.substring(2); // remove second char 'x'
        }
        return str;
    }
}
