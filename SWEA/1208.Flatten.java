
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static int[] sort(int[] arr) { // 정렬하는 함수 만들거임

		for (int i = 0; i < arr.length - 1; i++) {
			int minIdx = i; // 가장 작은 수의 "인덱스" 번호 설정
			// i 이후로 나오는 요소들과 비교해야한다
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = tmp;

		}
		return arr;

	}

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("input.txt"));

		/*
		 * 10개의 테스트케이스 첫번째 줄에 덤프 횟수 둘째 줄에 박스의 높이
		 */

		for (int tc = 1; tc <= 10; tc++) {

			int[] box = new int[100]; // 100길이의 배열 생성, 가로가 100이니까

			int dmp = sc.nextInt(); // 덤프횟수 입력받기

			for (int i = 0; i < box.length; i++) { // 상자의 높이 값을 입력받음
				box[i] = sc.nextInt();
			}

			int N = box.length;

			// 정렬을 먼저 해보자
			box = sort(box);

			// 값 swap하고 정렬 반복
			for (int i = 0; i < dmp; i++) { // 덤프가능횟수동안!!! 뭘 할거냐
				box[0] = box[0] + 1;
				box[N - 1] = box[N - 1] - 1;

				box = sort(box);
			}

			// 최고점 최저점 차이
			System.out.println("#" + tc + " " + (box[N - 1] - box[0]));

		} // tc 10번 반복하는 for문

	}// main

}// class
