import mooc.EdxIO;

public class Main {

	public static void main(String[] args) {
	
		
		try(EdxIO io = EdxIO.create();){
			
			int A = io.nextInt(), B = io.nextInt();
			
			io.print(A+B);
		}
	}		
}
