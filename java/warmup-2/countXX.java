/**
 *Count the number of "xx" in the given string. We'll say that
 * overlapping is allowed, so "xxx" contains 2 "xx".
 */
public class countXX {
    int countXX(String str) {
        int result = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == 'x') && (str.charAt(i+1) == 'x')) {
                result++;
            }
        }
        return result;
    }
}

/** A little easier to understand

public int countXX(String str) {
     int result = 0;
     for (int i = 0; i < str.length() - 1; i++) {
         if (str.substring(i, i+2).equals("xx") {
             count++;
         }
     }
     return count;
 }
 */