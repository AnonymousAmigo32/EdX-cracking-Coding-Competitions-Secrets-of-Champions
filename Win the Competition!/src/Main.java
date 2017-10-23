import mooc.EdxIO;

public class Main {

	public static void main(String[] args) {
	
		try(EdxIO io = EdxIO.create();){
			int n = io.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=io.nextInt();
			}for(int j=0;j<n;j++)
			for(int i=0;i+1<n;i++){
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}int sum=0,problems=0;
			for(int i=0;i<n;i++) {
				if(sum+arr[i]<=18000) {
				sum+=arr[i];problems++;}
			}
			io.print(problems);
		}
	}	
}
