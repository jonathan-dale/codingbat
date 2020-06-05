/**
 * Given a string, return a string made of the chars at indexes 0,1,
 * 4,5, 8,9 ... so "kittens" yields "kien".
 */

public class altPairs {


    public String altPairs(String str) {
        if (str.length() <= 2) return str;

        String result = "";

        for (int i = 0; i < str.length(); i+=4) {

            result += str.substring(i,i+1);
            if (i+1 < str.length()) {

                result+= str.substring(i+1, i+2);
            }
        }
        return result;
    }


}
