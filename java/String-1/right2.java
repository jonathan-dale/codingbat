/**
 * Given a string, return a "rotated right 2" version where the last 2 chars are moved
 * to the start. The string length will be at least 2.
 */


public class right2 {
    public String right2(String str) {
        String end = str.substring(str.length()-2);
        return end + str.substring(0, str.length()-2);
    }
}
