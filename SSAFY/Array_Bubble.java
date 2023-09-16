
import java.util.Arrays;

public class Day1_Bubble {
	public static void main(String[] args) {

		int[] arr = { 7, 5, 3, 4, 8, 2 };
		int n = arr.length;

		// 버블정렬 오름차순 일 때
		// i랑 i+1이랑 비교

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = 0;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		// 내림차순 일 때

		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 1; j > 0; j--) {
				if (arr[j] > arr[j - 1]) {
					int temp = 0;
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
