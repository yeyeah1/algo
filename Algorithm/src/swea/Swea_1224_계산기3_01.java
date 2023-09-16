package swea;

import java.util.Scanner;
import java.util.Stack;

public class Swea_1224_계산기3_01 {

    public static void main(String[] args) {
        // 총 10개의 tc, 문자열의 길이 입력 후 문자열 입력

        Scanner sc = new Scanner(System.in);

        for (int tc = 1; tc <= 10; tc++) {
            sc.nextInt(); // 문자열 길이 입력 (버려도 됨)

            String str = sc.next(); // 문자열 입력

            Stack<Character> stack1 = new Stack<>();

            String pocket = ""; // 후위표기식을 위해 피연산자를 담을 빈 문자열

            // 중위 -> 후위 표기식

            for (int i = 0; i < str.length(); i++) { // str의 길이만큼

                char cal = str.charAt(i); // 한글자씩 빼서
//                System.out.println(i + " : " + pocket + " : " + stack1);

                if (cal != '(' && cal != '*'&& cal != '+' && cal != ')') {
                    pocket = pocket + cal; // 피연산자라면 pocket에 담아놓기
                } else if (cal == '(' || cal == '*'|| cal == '+'|| cal == ')') { // 연산자이고
                    if (stack1.isEmpty()) { // stack이 비워져 있다면
                        stack1.push(cal); // 연산자 push

                    } else if (!stack1.isEmpty()) { // 비워져있지 않다면

                        switch (cal) {

                        case '(': // '('일 때 push
                            stack1.push(cal);
                            break;

                        case '*': // '*'일 때
                            if (stack1.peek() != '*') {
                                stack1.push(cal); // 우선 순위가 낮으면 push
                                break;

                            } else { // 우선 순위가 같으면
///////////////////////////////// while문 안의 조건 : * 이랑 / 는 stack의 제일 위에 있는 친구가 '(' , '+' , '-' 요 셋 중 하나일때 넣어줄 수 있어서
///////////////////////////////// stack.peek() 했을 때 저 셋중 하나면 while문 멈추도록 조건 수정                              
///////////////////////////////// stack1.peek() 하기 전에, 스택이 비어있는지 확인 필요해서 !stack1.isEmpty() && 추가                                 
                                while (!stack1.isEmpty()
                                        && !(stack1.peek() == '(' || stack1.peek() == '+')) {
                                    pocket += stack1.pop();
                                } // '*'가 나올 때까지 pop하면서 pocket에 추가
                                stack1.push(cal);
                                break;
///////////////////////////////////↓ 원래 코드 ↑ 수정 후 코드/////////////////////////////////////////                                
//                                while (str.charAt(i) != '/' || str.charAt(i) != '*') {
//                                    pocket += stack1.pop();
//                                } // '/'나 '*'가 나올 때까지 pop하면서 pocket에 추가
//                                
//                                stack1.push(cal);
//                                break;
////////////////////////////////////////////////////////////////////////////////////////////////
                            }
                        case '+': // '+'일 때

                            if (stack1.peek() == '(') {// 우선 순위가 낮으면 push
                                stack1.push(cal);
                                break;

                            } else { // 우선 순위가 같거나 높으면
///////////////////////////////// while문 안의 조건 : stack의 제일 위쪽에 있는 친구를 확인해야해서 str.charAt(i)가 아니라 stack1.peek() 사용
///////////////////////////////// stack1.peek() 하기 전에, 스택이 비어있는지 확인 필요해서 !stack1.isEmpty() && 추가                                 
                                while (!stack1.isEmpty() && stack1.peek() != '(') { // '('가 나올 때까지 pop
                                    pocket += stack1.pop();
                                }

                                stack1.push(cal);
                                break;
///////////////////////////////////↓ 원래 코드 ↑ 수정 후 코드/////////////////////////////////////////                                
//                                while (str.charAt(i) != '(') { // '('가 나올 때까지 pop
//                                    pocket += stack1.pop();
//                                }
//                                
//                                stack1.push(cal);
//                                break;
////////////////////////////////////////////////////////////////////////////////////////////////                                
                            }
                        case ')':// ')'가 나오면
                            if (stack1.peek() == '(') { // '('이면 pop
                                stack1.pop();
                                break;
                            } else {
///////////////////////////////// while문 안의 조건 : stack의 제일 위쪽에 있는 친구를 확인해야해서 str.charAt(i)가 아니라 stack1.peek() 사용
///////////////////////////////// stack1.peek() 하기 전에, 스택이 비어있는지 확인 필요해서 !stack1.isEmpty() && 추가                                
                                while (!stack1.isEmpty() && stack1.peek() != '(') {
                                    pocket += stack1.pop(); // '('가 나올 때까지 pop하고
                                }
                                stack1.pop(); // '('나오면 pop
                                break;
///////////////////////////////////↓ 원래 코드 ↑ 수정 후 코드/////////////////////////////////////////                                
//                                while (str.charAt(i) != '(') {
//                                    pocket += stack1.pop(); // '('가 나올 때까지 pop하고
//                                }
//                                stack1.pop(); // '('나오면 pop
//                                break;
////////////////////////////////////////////////////////////////////////////////////////////////                                
                            }

                        }// switch
                    }
                }

            } // 중위 -> 후위 표기식 수행하는 for문
//////////////////// 스택에 비어있는게 여러개일 수도 있으니, if문에서 while문으로 수정
//////////////////// 요 밑에 while문이 위에 str 길이만큼 반복하는 for문 안에 들어가있어서
//////////////////// 계속 pocket += stack1.pop(); 이 실행되서 후위 표기식으로 안바뀌고 중위 표기식으로만 나왔었어            
            while (!stack1.isEmpty()) {
                pocket += stack1.pop();
            }
///////////////////////////////       
//            if (!stack1.isEmpty()) {
//                pocket += stack1.pop();
//            }
/////////////////////////////////            
//            System.out.println(pocket);

            // 후위 표기식 -> 계산
            
            //후위 표기식이라 스택이 비어있을 때 연산자가 들어올 일은 없음
            
            Stack<Integer> stack2 = new Stack<>();

            int sum = 0;
            int mul = 0;
            int a;
            int b;
            
            for (int i = 0; i < pocket.length(); i++) {
                // 아까 피연산자 담아놓은 pocket의 길이 만큼 반복

                char cal = pocket.charAt(i); // pocket에서 한글자씩 빼와서
     
                    if (cal != '+' && cal != '*') { // 숫자라면 push
                        int num = Character.getNumericValue(cal);
                        stack2.push(num);
                        
                    } else if (cal == '+') { //'+'이면
                        b = stack2.pop(); // 맨 위에 있던 값
                        a = stack2.pop(); // 그 아래에 있던 값
                        sum = a + b; //더해서 그 값을 push
                        stack2.push(sum);
                    	
                    }else if (cal == '*') { //'*'이면
                        b = stack2.pop(); // 맨 위에 있던 값
                        a = stack2.pop(); // 그 아래에 있던 값
                        mul = a * b; //곱해서 그 값을 push
                        stack2.push(mul);
                    }

            } // 후위 -> 계산식 수행하는 for문
            System.out.println("#" + tc + " " + stack2.pop());
            

        } // tc 10번도는 for문

    }// main

}// class