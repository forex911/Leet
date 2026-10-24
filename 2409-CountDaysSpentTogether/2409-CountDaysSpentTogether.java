// Last updated: 10/24/2026, 8:53:29 PM
1class Solution {
2    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
3        String first = arriveAlice.compareTo(arriveBob) > 0 ? arriveAlice : arriveBob;  // the later arrival: "MM-DD" strings sort like dates
4        String last = leaveAlice.compareTo(leaveBob) < 0 ? leaveAlice : leaveBob;  // the earlier departure
5        return Math.max(0, day(last) - day(first) + 1);
6    }
7
8    private static final int[] before = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
9    static { Arrays.parallelPrefix(before, Integer::sum); }  // days in the year before each month
10
11    private static int day(String mmdd) {  // "MM-DD" -> day of the year, 1..365
12        return before[Integer.parseInt(mmdd.substring(0, 2)) - 1] + Integer.parseInt(mmdd.substring(3));
13    }
14}