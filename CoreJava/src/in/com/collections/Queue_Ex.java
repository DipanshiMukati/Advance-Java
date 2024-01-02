package in.com.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Ex {
	public static void main(String[] args) {
		Queue<Integer>num  = new PriorityQueue<Integer>(Comparator.reverseOrder());
		num.add(1);
		num.add(5);
		num.add(10);
		System.out.println(num);
		num.offer(8+12-2*5);
		System.out.println(num);
		 System.out.println(num.peek());
		 num.poll();
		 System.out.println(num);
	 //  num.remove();
	   System.out.println(num);
		
		
	}
	

}
