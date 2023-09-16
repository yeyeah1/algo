package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj_15552 {
	public static void main(String[] args) throws IOException {
		
		//Scanner 대신 BufferedReader -> 버퍼를 이용한 입력
		//sysout 대신 BufferedWriter -> 버퍼를 이용한 출력
		
		//Writer은 개행을 하려면 write에 \n을 넣어주거나 newLine함수를 사용해야함
		//숫자 출력하려면 bw.write(t); 이렇게하면 출력 안되고 t+"" 요렇게 써야 숫자 출력됨

		//Reader를 사용하려면 throws IOException 해주어야 함
		//Reader는 엔터만 경계로 인식하고, 받은 데이터가 String으로 고정 -> 가공해야함
		
		//buffer flush => 버퍼에 남아있는 데이터를 출력시킴(버퍼를 비우는 동작)
		
		//Bufferedwriter.flush는 맨 마지막에 한 번만(반드시 써야함)
		//마지막 입력이 끝나서 BufferedReader를 더 이상 사용할 필요가 없게 되면  close()를 통해서 입력스트림을 닫아야함
		
		//입력
		//첫 줄에 테스트케이스 T 주어짐.
		//다음 줄에는 각각 두 정수 A 와 B, A+B를 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine()); //readLine으로 받은 입력 데이터 String을 int로 바꿔줌
		
		for(int i = 0; i < )
		
		bw.write(t+"");
		bw.flush();
		bw.close();
	}

}
