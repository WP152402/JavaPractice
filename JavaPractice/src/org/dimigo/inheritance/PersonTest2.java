/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_PersonTest
 * 
 * 1.개요 :
 * 2. 작성일 : 2017. 5. 9.
 * </pre>
 * 
 * @author 		: 고오오오오오영으으으으으은
 * @version		: 1.0
 */
public class PersonTest2 {
	public static void main(String[] args) {
		Person[] person = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍")
		};
		greeting(person);
	}
	private static void greeting(Person[] person){
		for(Person p : person){
			System.out.println(p);
			p.sayHello();
			p.sayBye();
			System.out.println();
		}
	}
}
