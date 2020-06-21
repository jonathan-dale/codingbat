/**
 * Given a string, return a version without the first 2 chars. Except keep the
 * first char if it is 'a' and keep the second char if it is 'b'. The string
 * may be any length. Harder than it looks.
 */


public class deFront {
    public String deFront(String str) {
        String result = "";
        if (str.length()>=2) {
            result = str.substring(2);
            if (str.charAt(1) == 'b') result = 'b' + result;
            if (str.charAt(0) == 'a') result = 'a' + result;
        }
        if ((str.length()==1) && str.charAt(0)=='a') return str;
       return result;
    }
}


