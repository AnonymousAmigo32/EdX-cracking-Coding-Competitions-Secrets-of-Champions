import mooc.EdxIO;

/**
 * @author kishore
 */
public class ThreeBonaci {
	public static void main(String[] args) {
		try (EdxIO io = EdxIO.create()) {
			long a = io.nextInt();
			long b = io.nextInt();
			long c = io.nextInt();
			long n = io.nextInt();
			if (n <= 2) {
				if (n == 0) {
					io.print(a);
				} else
				if (n==1){
					io.print(b);
				} else
				if (n==2) {
					io.print(c);
				}
			} else {
				n -= 2;
				while (n-- > 0) {
					long next = c + b - a;
					a = b;
					b = c;
					c = next;
				}
				io.print(c);
			}
		}
	}
}
