package interview;

public class LargestArray {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,500,6,87};
		int a=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]>a) {
				
				a=arr[i];
				
			}
			
		}
		
		System.out.println(a);
	}

}
