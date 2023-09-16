package swea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Swea_1216_회문2_01 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("input.txt"));
		
		for (int t = 1; t <= 10; t++) {
			int nTestcase = sc.nextInt();
			sc.nextLine();
			String[] strArr = new String[100];
			int nMax = 1;
			
			int nLeftPoint = 0;
			int nRightPoint = 0;
			
			//가로 탐색
			for (int i = 0; i < 100; i++) {
				strArr[i] = sc.nextLine();
				for(int j =1; j < 100; j++) {
					// 탐색 1. j % 2 == 0 인 경우
					nLeftPoint = j - 1;
					nRightPoint = j;
					int nCount = 0;
					while(nLeftPoint >= 0 && nRightPoint < 100) {
						if(strArr[i].charAt(nLeftPoint) == strArr[i].charAt(nRightPoint))
							nCount+=2;
						else
							break;
						nLeftPoint--;
						nRightPoint++;
					}
					
					if (nMax < nCount)
						nMax = nCount;
					
					//탐색2. j % 2 == 1 인 경우
					nCount = 1;
					nLeftPoint = j - 1;
					nRightPoint = j + 1;
					
					while (nLeftPoint >= 0 && nRightPoint < 100) {
						if (strArr[i].charAt(nLeftPoint) == strArr[i].charAt(nRightPoint))
							nCount += 2;
						else
							break;
						nLeftPoint--;
						nRightPoint++;
					}
					
					if (nMax < nCount)
						nMax = nCount;
				}
			}
		}

	}//main

}//class
