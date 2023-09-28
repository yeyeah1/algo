package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Boj_4485_녹색옷입은애가젤다지 {

	static class Node implements Comparable<Node> {
		int r;
		int c;
		int w;

		public Node(int r, int c, int w) {
			this.r = r;
			this.c = c;
			this.w = w;
		}

		@Override
		public int compareTo(Node o) {
			return Integer.compare(this.w, o.w);
		}
	}

	static int INF = Integer.MAX_VALUE;
	static int N;
	static int[][] map, dist;
	// 우 하 좌 상
	static int[] dr = { 0, 1, 0, -1 };
	static int[] dc = { 1, 0, -1, 0 };

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int tc = 0;

		while (true) {
			N = Integer.parseInt(br.readLine());

			if (N == 0)
				break;

			tc++;

			map = new int[N][N];
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			} // 동굴정보 입력 완

			dist = new int[N][N]; // 거리 가중치 담아줄 배열
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					dist[i][j] = INF;
				}
			} // 동굴정보 입력 완

			dist[0][0] = 0; // 시작점지정

			dijkstra(0, 0);

			sb.append("Problem ").append(tc).append(": ").append(dist[N - 1][N - 1] + map[0][0]).append("\n");
		} // while
		System.out.println(sb);

	}// main

	static void dijkstra(int r, int c) {
		// 우선순위 큐
		PriorityQueue<Node> pq = new PriorityQueue<>();

		pq.add(new Node(r, c, 0)); // 시작위치 설정

		while (!pq.isEmpty()) {

			Node now = pq.poll(); // 내가 방문한 곳 큐 하나 빼서

			// 4방탐색으로 길 찾기
			for (int i = 0; i < 4; i++) {

				int nr = now.r + dr[i];
				int nc = now.c + dc[i];

				// 범위를 벗어나지 않고 내가 방문하지 않은 곳일 때
				if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
					// 다음 방문할 곳과 dist의 내 위치의 값이 dist의 다음 값보다 작으면
					if (map[nr][nc] + dist[now.r][now.c] < dist[nr][nc]) {
						dist[nr][nc] = map[nr][nc] + dist[now.r][now.c];
						pq.add(new Node(nr, nc, map[nr][nc]));
					}
				}

			}

		} // while

	}// dijkstra

}
