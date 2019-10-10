import mooc.EdxIO;

import java.util.Stack;

/**
 * @author kishore
 */
public class Week2a {
	public static void main(String[] args) {
		try(EdxIO io = EdxIO.create()) {
			Stack<Integer> stack = new Stack<>();
			int n = io.nextInt();
			while (n-->0) {
				String c = io.next();
				if (c.charAt(0) == '+') {
					stack.push(io.nextInt());
				} else {
					io.println(stack.pop());
				}
			}
		}
	}
}
