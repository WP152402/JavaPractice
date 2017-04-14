package org.dimigo.oop;

import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		int cnt = 0;
	String[] questions ={"서인국", "이제훈", "물리"};
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	String[]  answer = {"", "", ""};
	while(cnt<3){
	switch(cnt){
	case 0 : System.out.println("1. 가장 좋아하는 가수는?");break;
	case 1 : System.out.println("2. 가장 좋아하는 배우는?");break;
	case 2 : System.out.println("3. 가장 좋아하는 과목은?");break;
	default : System.out.println("응 없어~");
	}
	answer[cnt] = scanner.nextLine();
	if(questions[cnt].equals(answer[cnt])){
		System.out.println("정답입니다!");
	}
	else{
		System.out.println("틀렸습니다!");
	}
	cnt++;
	}
	System.out.println("<<결과 출력>>");
	StringBuilder ans1 = new StringBuilder(questions[0]);
	System.out.println("가장 좋아하는 가수는? " +ans1 + " 입니다");
	StringBuilder ans2 = new StringBuilder(questions[1]);
	System.out.println("가장 좋아하는 배우는? " + ans2 + " 입니다");
	StringBuilder ans3 = new StringBuilder(questions[2]);
	System.out.println("가장 좋아하는 과목은? " + ans3 + " 입니다");
	}
}