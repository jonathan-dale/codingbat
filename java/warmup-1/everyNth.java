/**
 * Given a non-empty string and an int N, return the string made starting with char 0,
 * and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
 */
public class everyNth {
    public String everyNth(String str, int n) {
        String result = str.substring(0,1);
        for (int i = n; i < str.length(); i+=n) {
            result += str.substring(i, i+1);
        }
        return result;
    }
}
