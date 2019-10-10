import mooc.EdxIO;

import java.util.Arrays;

/**
 * @author kishore
 */
public class WinTheCompetition {
	public static void main(String[] args) {
		try (EdxIO io = EdxIO.create()){
			int n = io.nextInt();
			Integer[] arr = new Integer[n];
			for (int i=0;i<n;i++)arr[i]= io.nextInt();
			Arrays.sort(arr);
			int sum = 300*60;
			int count = 0;
			for (int i=0;i<n;i++) {
				if (sum-arr[i]>=0) {
					count++;
					sum -= arr[i];
				} else {
					break;
				}
			}
			io.print(count);
		}
	}
}
