package swea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Swea_1232_사칙연산 {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String[] strTree;
	static int[] arrLeftTree;
	static int[] arrRightTree;
	static int nNode;
	static int nResult = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int nTestcase = 10;
		for (int t = 1; t <= nTestcase; t++) {
			// 초기화
			nNode = Integer.parseInt(br.readLine());
			strTree = new String[nNode + 1];
			arrLeftTree = new int[nNode + 1];
			arrRightTree = new int[nNode + 1];
			nResult = 0;

			// 입력
			for (int i = 0; i < nNode; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int nIndex = Integer.parseInt(st.nextToken());
				strTree[nIndex] = st.nextToken();
				if (st.hasMoreTokens()) {
					arrLeftTree[nIndex] = Integer.parseInt(st.nextToken());
					arrRightTree[nIndex] = Integer.parseInt(st.nextToken());
				}
			}

			nResult = (int) inOrder(1);
			bw.write("#" + t + " " + nResult + "\n");

			bw.flush();
		}

		bw.close();
	}

	public static double inOrder(int nNodeNum) throws IOException {

		if (strTree[nNodeNum].charAt(0) == '+') {
			return inOrder(arrLeftTree[nNodeNum]) + inOrder(arrRightTree[nNodeNum]);
		} else if (strTree[nNodeNum].charAt(0) == '-') {
			return inOrder(arrLeftTree[nNodeNum]) - inOrder(arrRightTree[nNodeNum]);
		} else if (strTree[nNodeNum].charAt(0) == '*') {
			return inOrder(arrLeftTree[nNodeNum]) * inOrder(arrRightTree[nNodeNum]);
		} else if (strTree[nNodeNum].charAt(0) == '/') {
			return inOrder(arrLeftTree[nNodeNum]) / inOrder(arrRightTree[nNodeNum]);
		} else {
			return Double.parseDouble(strTree[nNodeNum]);
		}

	}

}// class
