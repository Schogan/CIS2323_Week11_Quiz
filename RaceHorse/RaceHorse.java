package RaceHorse;
import java.util.Scanner;

public class RaceHorse{
	
	private int competed=0;
	private String name;
	private String color;
	private int birthYear=0;
	
	public RaceHorse(String a,String b,int x,int y){
		setName(a);
		setColor(b);
		setBirthYear(x);
		setCompeted(y);
	}
	
	public void setName(String n){
		name = n;
	}
	public void setColor(String c){
		color = c;
	}
	public void setBirthYear(int a){
		birthYear = a;
	}
	public void setCompeted(int b){
		competed = b;
	}
	
	public String getName(){
		return name;
	}
	public String getColor(){
		return color;
	}
	public int getBirthYear(){
		return birthYear;
	}
	public int getCompeted(){
		return competed;
	}

}