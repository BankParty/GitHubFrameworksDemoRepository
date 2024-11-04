package base;

public class twoDimensionalArraysDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] ar = {{9,3,5,4},{8,2,6,7},{1,9,6,5}};
		
//		for(int[] b : ar) {
//			for(int c : b) {
//				System.out.print(c+" ");
//				
//			}
//			System.out.println();
//		}
		
		for(int r=0; r<ar.length; r++) {
			for(int c=0; c<ar[r].length; c++) {
				System.out.print(ar[r][c]+ " ");
			}
			System.out.println();
		}
		
		//int[][] ar = new int[3][4];
	// 1st row	
//		ar[0][0] = 9;
//		ar[0][1] = 3;
//		ar[0][2] = 5;
//		ar[0][3] = 4;
//		// 2nd row
//		ar[1][0] = 8;
//		ar[1][1] = 2;
//		ar[1][2] = 6;
//		ar[1][3] = 7;
//	// 3rd row
//		ar[2][0] = 1;
//		ar[2][1] = 9;
//		ar[2][2] = 6;
//		ar[2][3] = 5;
		
//		System.out.println(ar[0][0]);
//		System.out.println(ar[1][2]);
	}
}