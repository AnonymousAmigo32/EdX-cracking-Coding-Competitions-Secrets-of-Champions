import mooc.EdxIO;

public class Main {

	public static void main(String[] args) {
	
		
		try(EdxIO io = EdxIO.create();){
			
			int a=io.nextInt(),b=io.nextInt(),c=io.nextInt();
			
			io.print((double)(a+b+c)/6);
			
		}
	}		
}
