import mooc.EdxIO;

/**
 * @author kishore
 */
public class PrepareYourSelf {
	public static void main(String[] args) {
		try (EdxIO io = EdxIO.create()){
			int size = io.nextInt();
			int[] ps = new int[size];
			int[] ts = new int[size];
			for (int i=0;i<size;i++)ps[i] = io.nextInt();
			for (int i=0;i<size;i++)ts[i] = io.nextInt();
			int sol = 0;
			int pCount = 0, tCount = 0;
			for (int i=0 ;i<size; i++) {
				if (ps[i] > ts[i]) {
					pCount++;
					sol += ps[i];
					continue;
				}
				if (ps[i] < ts[i]) {
					tCount++;
					sol += ts[i];
					continue;
				}
				if (tCount < pCount) {
					tCount++;
					sol += ts[i];
					continue;
				}
				pCount++;
				sol += ps[i];
			}
			if (pCount == 0) {
				int min = ts[0] - ps[0];
				for (int i=1;i<size;i++) {
					if (ts[i]-ps[i] < min) {
						min = ts[i]-ps[i];
					}
				}
				pCount++;
				sol -= min;
			} else if (tCount == 0) {
				int min = ps[0] - ts[0];
				for (int i=1;i<size;i++) {
					if (ps[i]-ts[i] < min) {
						min = ps[i]-ts[i];
					}
				}
				tCount++;
				sol -= min;
			}
			io.print(sol);
		}
	}
}
