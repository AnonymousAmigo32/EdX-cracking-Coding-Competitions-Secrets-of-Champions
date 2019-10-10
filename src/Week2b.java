import mooc.EdxIO;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author kishore
 */
public class Week2b {
	public static void main(String[] args) {
		try(EdxIO io = EdxIO.create()) {
			Queue<Integer> stack = new LinkedList<>();
			int n = io.nextInt();
			while (n-->0) {
				String c = io.next();
				if (c.charAt(0) == '+') {
					stack.add(io.nextInt());
				} else {
					io.println(stack.remove());
				}
			}
		}
	}
}
