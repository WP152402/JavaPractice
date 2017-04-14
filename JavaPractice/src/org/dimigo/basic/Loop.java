/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/** 
 * <pre>
 * org.dimigo.basic
 * |_Loop
 * 
 * 1. 개요 :게임 만들기~
 * 2. 작성일 : 2017. 3. 15.
 * </pre>
 * 
 * @author IRON
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int attack = 100; int choice;
		String[] what = {"마법사", "영주", "기사", "농민"};
		Scanner scanner = new Scanner(System.in);
		do{
			System.out.println("--------------------");
			System.out.println("<<게임 메뉴>>");
			System.out.println("1.공격력 증가\n2.공격력 감소\n3.캐릭터 설정\n9.종료");
			System.out.println("--------------------");
			System.out.println("메뉴 입력=> ");
			choice = scanner.nextInt();
			switch(choice){
			case 1 : {attack+=10; System.out.printf("공격력이 증가되었습니다. 현재 공격력 : %d\n", attack); break;}
			case 2 : {attack-=10; System.out.printf("공격력이 감소되었습니다. 현재 공격력 : %d\n", attack);break;}
			case 3 : { int num=new Random().nextInt(4); System.out.println(num); System.out.printf("%s(으)로 설정되었습니다\n", what[num]);break;}
			case 9 : System.out.println("이제 공부하세요!\n");break;
			default : System.out.println("없는 메뉴입니다!\n!");
		}
		}
		while(choice!=9);
}
}