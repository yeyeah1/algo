package boj;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj_17471_게리멘더링 {

	static int n;
	static int[] population, area;
	static ArrayList<Integer>[] list;
	static int min = Integer.MAX_VALUE;
	static boolean[] visited;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		population = new int[n + 1];
		list = new ArrayList[n + 1];

		for (int i = 1; i <= n; i++) {
			list[i] = new ArrayList<>();
			population[i] = sc.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			int num = sc.nextInt();
			for (int j = 0; j < num; j++) {
				list[i].add(sc.nextInt());
			}
		}

		area = new int[n + 1]; // 각 지역구가 속한 선거구 저장, 1 or 2
		dfs(1); // 뽑을 수 있는 모든 지역구를 뽑는 dfs 탐색

		if (min == Integer.MAX_VALUE)
			System.out.println("-1");
		else
			System.out.println(min);

	}// main

	static void dfs(int k) {
		if (k == n + 1) { // 모든 지역을 다 뽑았다면
			int area1 = 0;
			int area2 = 0;
			for (int i = 1; i <= n; i++) {
				if (area[i] == 1)
					area1 += population[i];
				else
					area2 += population[i];
			}

			visited = new boolean[n + 1];
			int link = 0; // 연결된 지역들의 개수를 셈
			for (int i = 1; i <= n; i++) {
				if (!visited[i]) {
					bfs(i, area[i]); // 연결된 지역들을 모두 방문표시하는 bfs 탐색
					link++;
				}
			}
			// 지역이 2개로 나눠졌고, 2지역 안에서 서로 연결돼 있다면 최소값 계산
			if (link == 2)
				min = Math.min(min, Math.abs(area1 - area2));

			return;
		}

		area[k] = 1; // k지역 1번 선거구에 할당
		dfs(k + 1);

		area[k] = 2; // k지역 2번 선거구에 할당
		dfs(k + 1);

	}// dfs

	static void bfs(int idx, int areaNum) {
		Queue<Integer> q = new LinkedList<>();
		visited[idx] = true;
		q.offer(idx);

		while (!q.isEmpty()) {
			int curr = q.poll();

			for (int i = 0; i < list[curr].size(); i++) {
				int next = list[curr].get(i);
				if (area[next] == areaNum && !visited[next]) {
					q.offer(next);
					visited[next] = true;
				}
			}

		}
	}

}
