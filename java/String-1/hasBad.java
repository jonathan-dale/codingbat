/**
 * Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
 * such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length,
 * including 0. Note: use .equals() to compare 2 strings.
 */


public class hasBad {
    public boolean hasBad(String str) {
        if (str.equals("bad")) return true;
        if (str.length() <= 3) return false;
        String first = str.substring(0, 3);
        String second = str.substring(1, 4);
        return (first.equals("bad") || second.equals("bad"));
    }
}

    /** This way is better, less checking, dose not
     * create additional strings like above
     *
      public boolean hasBad(String str) {
          if (str.length() == 3) {
              return str.equals("bad");
          }

          if (str.length()>=4) {
              return (str.substring(0,3).equals("bad") ||
                      str.substring(1,4).equals("bad"));
          }
          return false;
      }
}
     *
     *
     */

