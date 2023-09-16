package boj;

import java.util.Scanner;

public class Boj_3003_킹퀸룩비숍나이트폰 {

	public static void main(String[] args) {
		//원래 있어야 할 개수 총 16개
		//킹1개, 퀸1개, 룩2개, 비숍2개, 나이트2개, 폰8개
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		

		for(int i = 0; i < arr.length; i++) {
			
			int res = 0;
			
			switch(i) {
			
			case 0: case 1:
				
				System.out.print((1-arr[i]) + " ");
				continue;
			
			case 2: case 3: case 4:
				System.out.print((2-arr[i]) + " ");
				continue;
			
			case 5:
				System.out.print((8-arr[i] + " "));
				continue;
			
			}//switch
			
			
			
		}
		
		
		
	}

}
