import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        // Use a stack to store valid scores
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            if (op.equals("C")) {
                // Remove the last score
                stack.pop();
            } else if (op.equals("D")) {
                // Double the last score
                stack.push(2 * stack.peek());
            } else if (op.equals("+")) {
                // Sum of last two scores
                int last = stack.pop();
                int secondLast = stack.peek();
                int sum = last + secondLast;
                stack.push(last); // Push the last one back
                stack.push(sum);  // Then push the new one
            } else {
                // It's a number → parse and push
                stack.push(Integer.parseInt(op));
            }
        }

        // Sum all the valid scores
        int total = 0;
        for (int score : stack) {
            total += score;
        }

        return total;
    }
}
