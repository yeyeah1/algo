public class Day1_Gravity {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 4, 0, 0, 2, 7, 0, 0 };

		int n = arr.length;
		int max = 0; // 최종값
		for (int i = 0; i < n; i++) {
			int cnt = 0;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					cnt++;
				} // 여기에 else구문을 추가해서 작성했었는데, 그렇게 되면 7 뒤에있는 0들이 카운트 안됨

			}

			if (max < cnt) {
				max = cnt;
			}
		}
		System.out.println(max);
	}

}
