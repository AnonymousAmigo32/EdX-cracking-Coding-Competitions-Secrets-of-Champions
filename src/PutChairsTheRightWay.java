import mooc.EdxIO;

/**
 * @author kishore
 */
public class PutChairsTheRightWay {
	public static void main(String[] args) {
		try(EdxIO io = EdxIO.create()) {
			io.print((io.nextInt()+io.nextInt()+io.nextInt())/6.0);
		}
	}
}
