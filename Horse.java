
import java.util.Scanner;

public class Horse{
	private String name;
	private String color;
	private int birthYear=0;
	
	public Horse(String a,String b,int x){
		setName(a);
		setColor(b);
		setBirthYear(x);
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
	
	public String getName(){
		return name;
	}
	public String getColor(){
		return color;
	}
	public int getBirthYear(){
		return birthYear;
	}
	
	
	
}