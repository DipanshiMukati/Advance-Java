package in.com.Home_prac;

public class Count {
	public static void main(String[] args) {
		int money = 12297;
		int count = 0;
		int [] note = {500,100,200,50,20,10};
		for (int i = 0; i < note.length; i++) {
			
			count = money/note[i];
			if (count>0) {
				System.out.println(note[i]+" "+count);
				money = money%note[i];
				
						
			}
		}	
		
	}

}
