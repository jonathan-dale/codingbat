/**
 * Given a string, return true if it ends in "ly".
 */


public class endsLy {
    public boolean endsLy(String str) {
        if (str.length()<=1) return false;
        return (str.substring(str.length()-2).equals("ly"));

    }
}
