import java.util.Stack;
import java.util.Scanner;

public class Evaluate {
    public static void main(String[] args) {

        // Create two stacks: One for operations and one for values

        Stack<Double> vals = new Stack<Double>();
        Stack<String> ops = new Stack<String>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.nextLine();
            if (s.isEmpty()) {
                break;
            }

            if (s.equals("("))
                ;
            else if (s.equals("+"))
                ops.push(s);
            else if (s.equals("*"))
                ops.push(s);
            else if (s.equals(")")) {
                String op = ops.pop();
                if (op.equals("+"))
                    vals.push(vals.pop() + vals.pop());
                else if (op.equals("*"))
                    vals.push(vals.pop() * vals.pop());
            } else {
                vals.push(Double.parseDouble(s));
            }

            System.out.println(vals.pop());

        }

    }

}
