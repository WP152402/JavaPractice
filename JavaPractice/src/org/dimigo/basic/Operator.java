/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * |_Operator
 * 
 * 1. 개요 : 디미베네><
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 * 
 * @author IRON
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aver = 1700000;
		int people = 3;
		int num = 1500;
		long sum = ((long)aver * people * num * 12);
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println(String.format("월 평균 급여 : %,d원", aver));
		System.out.printf("점포 내 직원수 : %d명\n", people);
		System.out.println("점포 수 : " + String.format("%,d개\n\n", num));
		System.out.println(String.format("연간 인건비 : %,d원", sum));
		
		
	}

}