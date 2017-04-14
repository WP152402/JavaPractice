/**
 * 
 */
package org.dimigo.oop;
 
/**
 * <pre>
 * org.dimigo.oop
 * |_SnackTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 7.
 * 
 * </pre>
 * 
 * @author IRON
 */
public class SnackTest {
	public static void main(String[] args) {
		Snack[] snack = new Snack[3];
		snack[0] = new Snack("새우깡", "농심",  1100, 2);
		snack[1] = new Snack("콘칲", "크라운",  1200, 1);
		snack[2] = new Snack("허니버터칩", "해태",  1500, 4	);
		System.out.println(snack[0].toString());
		System.out.println(snack[1].toString());
		System.out.println(snack[2].toString());
		int sum = snack[0].calcprice() + snack[1].calcprice() + snack[2].calcprice();
		System.out.println(String.format("총 구매 금액 : " + "%,d", sum) + "원");
	}
}