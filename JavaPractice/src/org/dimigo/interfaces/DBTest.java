/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 * 	|_DBTest
 * 
 * 1.개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @author 		: 고오오오오오영으으으으으은
 * @version		: 1.0
 */
public class DBTest {
	public static void main(String[] args) {
		IDBManager a = IDBManager.getDBObject("SYBASE");
		System.out.println("< 변경 전 >");
		crud(a);
		System.out.println("< 변경 후 >");
		IDBManager b = IDBManager.getDBObject("ORACLE");
		crud(b);
	}
	private static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
		System.out.println();
	}
}
