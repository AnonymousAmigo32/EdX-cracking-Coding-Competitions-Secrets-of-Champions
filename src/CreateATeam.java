import mooc.EdxIO;

/**
 * @author kishore
 */
public class CreateATeam {
	public static void main(String[] args) {

		int arr[][]=new int[3][3];
		try(EdxIO io = EdxIO.create();){
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					arr[i][j]=io.nextInt();
				}
			}int max=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(j==i)continue;
					else
						for(int k=0;k<3;k++) {
							if(k==j||k==i)continue;
							else {
								int val=arr[0][i]*arr[0][i] + arr[1][j]*arr[1][j] + arr[2][k]*arr[2][k];
								if(max<val)max=val;
							}
						}
				}
			}
			io.print(Math.sqrt(max));
		}
	}
}
