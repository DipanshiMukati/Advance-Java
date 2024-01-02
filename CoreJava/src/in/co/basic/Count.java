package in.co.basic;

public class Count {
	public static void main(String[] args) {
	  int money=1350;
	  int count=0;
	  int [] note= {500,200,100,50,20,10};
	  for (int i = 0; i < note.length; i++) {
		  count=money/note[i];
		  if (count>0) {
		  	  System.out.println(note[i]+"=" +count);
			  money = money % note[i];
		  }
			
		}
		 
	}
}


