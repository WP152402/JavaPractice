/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 * 	|_IDBManager
 * 
 * 1.개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @author 		: 고오오오오오영으으으으으은
 * @version		: 1.0
 */
public interface IDBManager {
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";
	void insert();
	void search();
	void update();
	void delete();
	public static IDBManager getDBObject(String database){
		IDBManager a = null;
		if(database.equals(ORACLE_DATABASE)){
			a = new OracleDB();
		}
		else if(database.equals(SYBASE_DATABASE)){
			a = new SybaseDB();
		}
		return a;
	}
}
