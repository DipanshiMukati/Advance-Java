package in.com.rays;
public class Multidimarray {
public static void main(String[] args) {
	int [][]table=new int [10][20];
	table[0][0]=2;
	table[1][0]=4;
	table[6][0]=14;
	table[0][1]=6;
	table[1][1]=21;
	table[6][1]=2;

for (int row = 0; row < table.length; row++) {
	
		//System.out.print(table[row]);

	for (int col = 0; col < table.length; col++) {
		
		System.out.print(table [row][col]+"\t");
	}
	System.out.println();
	}
}
}


