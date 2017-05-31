/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * 	|_Movie
 * 
 * 1.개요 :
 * 2. 작성일 : 2017. 5. 31.
 * </pre>
 * 
 * @author 		: 고오오오오오영으으으으으은
 * @version		: 1.0
 */
public class Movie {
	private String title;
	private int limitAge;
	public Movie(String title, int limitAge){
		this.title = title;
		this.limitAge = limitAge;
	}
	public String getTitle(){
		return title;
	}
	public int getLimitAge() {
		return limitAge;
	}
	public void buyTicket(int age){
		try{
		if(age<limitAge){
			throw new Exception(title + "은/는 15세 이상 관람가입니다.");
		}
		else{
			System.out.println(title + " 즐감하세요.");
		}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
