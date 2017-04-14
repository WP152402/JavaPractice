package org.dimigo.oop;
 
public class Snack {
	private String name;
	private String company;
	private int price;
	private int number;
	public Snack(){
		
	}
	public Snack(String name, String company, int price, int number){
		this.company = company; this.name=name; this.price=price; this.number=number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}
	public int getPrice() {
		return price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int calcprice(){
		return price * number;
	}
	public String toString(){
		return "이름 : " + name + "\n제조사 : " + company + "\n가격 : " + String.format("%,d", price) + "원\n개수 : " + number + "개\n"; 
	}
}