import mooc.EdxIO;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author kishore
 */
public class Week2c {
	public static void main(String[] args) {
		try(EdxIO io = EdxIO.create()) {
			Queue<Integer> stack = new LinkedList<>();
			Deque<Integer> queue = new LinkedList<>();
			int n = io.nextInt();
			while (n-->0) {
				String c = io.next();
				if (c.charAt(0) == '+') {
					int val = io.nextInt();
					stack.add(val);
					if (queue.size() == 0) {
						queue.add(val);
					} else {
						if (queue.getLast() < val) {
							queue.add(val);
						} else {
							while (!queue.isEmpty() && queue.getLast() >val) {
								queue.removeLast();
							}
							queue.add(val);
						}
					}
				} else if (c.charAt(0) == '-'){
					int val = stack.remove();
					if (val == queue.getFirst()) {
						queue.removeFirst();
					}
				} else {
					io.println(queue.getFirst());
				}
			}
		}
	}
}
