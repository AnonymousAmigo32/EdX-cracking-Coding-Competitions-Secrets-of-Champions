import mooc.EdxIO;

/**
 * @author kishore
 */
public class APlusBSquare {
	public static void main(String[] args) {
		try(EdxIO io = EdxIO.create()) {
			int a = io.nextInt();
			int b = io.nextInt();
			long sol = a + ((long)b*b);
			io.print(sol);
		}
	}
}
