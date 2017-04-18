/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_FamilyMember
 * 
 * 1.개요 :
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 * 
 * @author 		: 고오오오오오영으으으으으은
 * @version		: 1.0
 */
public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	public FamilyMember(String memberName){
		this.memberName = memberName;
		memberCnt++;
	}
	public String getMemberName() {
		return memberName;
	}

	public static void printMemverCnt(){
		System.out.println("가족 총 인원수 : " + memberCnt + "명");
	}
}
