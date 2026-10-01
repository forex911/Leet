// Last updated: 10/1/2026, 10:22:53 PM
import java.util.*;

class Solution {
    public List<String> removeInvalidParentheses(String s) {

        List<String> ans = new ArrayList<>();

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.offer(s);
        visited.add(s);

        boolean found = false;

        while (!queue.isEmpty()) {

            int size = queue.size();

            while (size-- > 0) {

                String current = queue.poll();

                if (isValid(current)) {
                    ans.add(current);
                    found = true;
                }

                // If we already found valid strings at this level,
                // don't remove more characters.
                if (found) {
                    continue;
                }

                // Remove one parenthesis at every possible position
                for (int i = 0; i < current.length(); i++) {

                    if (current.charAt(i) != '(' &&
                        current.charAt(i) != ')') {
                        continue;
                    }

                    String next = current.substring(0, i)
                            + current.substring(i + 1);

                    if (!visited.contains(next)) {
                        visited.add(next);
                        queue.offer(next);
                    }
                }
            }

            // We found answers with minimum removals
            if (found) {
                break;
            }
        }

        return ans;
    }

    private boolean isValid(String s) {

        int balance = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                balance++;
            }
            else if (c == ')') {
                balance--;

                if (balance < 0) {
                    return false;
                }
            }
        }

        return balance == 0;
    }
}