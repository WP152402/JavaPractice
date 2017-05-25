/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 * 	|_OracleDB
 * 
 * 1.개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @author 		: 고오오오오오영으으으으으은
 * @version		: 1.0
 */
public class SybaseDB implements IDBManager {
	public void insert(){
		System.out.println(SYBASE_DATABASE + "저장");
	}
	public void search(){
		System.out.println(SYBASE_DATABASE + "조회");
	}
	public void update(){
		System.out.println(SYBASE_DATABASE + "변경");
	}
	public void delete(){
		System.out.println(SYBASE_DATABASE + "삭제");
	}
}
