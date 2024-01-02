package in.com.rays;

public class Count {
	 public static void main(String[] args) {
		int money=1205;
		 int count=0;
		 int[] note	= {500,200,100,50,20,10,5};
		 for (int i = 0; i < note.length; i++) {
			count= money/note[i];
			if (count>0) {
				System.out.println(note[i]+"="+count);
				
				money=money%note[i];
			}
		 }	 
		 
	}
}
