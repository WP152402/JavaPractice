/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_PiggyBankTest
 * 
 * 1.개요 :
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 * 
 * @author 		: 고오오오오오영으으으으으은
 * @version		: 1.0
 */
public class PiggyBankTest {
	public static void main(String[] args) {
		FamilyMember fam1 = new FamilyMember("아빠");
		FamilyMember fam2 = new FamilyMember("엄마");
		FamilyMember fam3 = new FamilyMember("나");
		FamilyMember fam4 = new FamilyMember("남동생");
		FamilyMember.printMemverCnt();
		PiggyBank.putMoney(fam1, 10000);
		PiggyBank.putMoney(fam2, 5000);
		PiggyBank.putMoney(fam3, 2000);
		PiggyBank.putMoney(fam4, 1000);
		PiggyBank.printBalance();
		PiggyBank.putMoney(fam3, 1000);
		PiggyBank.printBalance();
	}

}
