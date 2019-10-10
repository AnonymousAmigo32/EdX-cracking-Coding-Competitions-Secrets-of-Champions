import mooc.EdxIO;

/**
 * @author kishore
 */
public class WriteACodeTemplete {
	public static void main(String[] args) {

		WriteACodeTemplete obj = new WriteACodeTemplete();int dis=0;
		try(EdxIO io = EdxIO.create();){String mainTitle=new String();int maindis=2147483647;

			int length=io.nextInt(),rows=io.nextInt();

			String [] chars = new String[rows];

			for(int i=0;i<rows;i++) {
				chars[i]=io.next();
			}
			for(int i=0;i<3;i++) {
				String title=new String();title=io.next();
				String start=new String();start=io.next();String stop="%TEMPLATE-END%";
				dis=0;
				String toFind = "";
				String temp=new String();
				temp=io.next();
				for(;!temp.equals(stop);) {
					toFind+=temp;temp=io.next();
				}
				int lengthS=toFind.length();
				for(int is=0;is+1<lengthS;is++) {
					int find[] = obj.position(toFind.charAt(is),toFind.charAt(is+1),chars,length,rows);
					dis+=Math.max(find[0],find[1]);
				}
				if(dis<maindis) {maindis=dis;mainTitle=title;}

			}


			io.println(mainTitle);
			io.print(maindis);

		}
	}

	private int[] position(char charAt, char charAt2, String[] chars,int length,int rows) {
		int c1[]= new int[2],c2[]=new int[2];

		for(int x=0;x<rows;x++) {
			for(int y=0;y<length;y++) {
				if(chars[x].charAt(y)==charAt) {c1[0]=x;c1[1]=y;}
				if(chars[x].charAt(y)==charAt2) {c2[0]=x;c2[1]=y;}
			}
		}int x=0,y=0;
		if(c1[0]>=c2[0])x=c1[0]-c2[0];
		else x=c2[0]-c1[0];
		if(c1[1]>=c2[1])y=c1[1]-c2[1];
		else y=c2[1]-c1[1];
		int[] arr = {x,y};
		return arr;
	}
}
