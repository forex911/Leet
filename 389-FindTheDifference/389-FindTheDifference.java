// Last updated: 5/25/2026, 11:10:06 AM
class Solution {
    public char findTheDifference(String s, String t) {
        StringBuilder sb = new StringBuilder(s);

        for (char c : t.toCharArray()) {

            int index = sb.indexOf(String.valueOf(c));

            if (index == -1) {
                return c; // extra character found
            } else {
                sb.deleteCharAt(index); // remove one occurrence
            }
        }

        return 'v'; // should never reach here
    }
}
