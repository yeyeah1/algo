package swea;
import java.util.Scanner;

public class Swea_1948_날짜계산기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			
			int[] cal = {0,31,28,31,30,31,30,31,31,30,31,30,31};
			
			int month1 = sc.nextInt();
			int day1 = sc.nextInt();
			
			int month2 = sc.nextInt();
			int day2 = sc.nextInt();
			
			//월 일 입력받기
			
			int res = 0;
			
			for(int m = month1; m<month2; m++) {
				res += cal[m];
			}
			
			res += day2 - day1 + 1;
			
			System.out.println("#" + tc + " " + res);
		}

	}

}
