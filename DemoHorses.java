import java.util.Scanner;
public class DemoHorses{
	public static void main(String[] args){
		String name;
		String color;
		int birthYear=0;
		int competed=0;
		char RH = 'z';
		char choice='z';
		boolean cont=true;
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("Is the horse a Race Horse (y/n): ");
		RH = inputDevice.next().charAt(0);
		
		System.out.println("Please enter the horse's name: ");
		name = inputDevice.nextLine();
		
		System.out.println("Please enter the color of the horse: ");
		color = inputDevice.nextLine();
		
		System.out.println("Please enter the birth year of the horse: ");
		birthYear = inputDevice.nextInt();
		
		if(RH=='y'||RH=='Y'){
			System.out.println("Please enter the number of races the horse has competed in: ");
			competed = inputDevice.nextInt();
			Horse(name,color,birthYear,competed);
		}else{
			Horse(name,color,birthYear);
		}
		
		/*while(cont){
			System.out.println("=================================== \n");
				System.out.println("What would you like to do? \n");
				System.out.println("a) Just last name \n");
				System.out.println("b) Both names \n");
				System.out.println("q) quit");
				System.out.println("=================================== \n");
			choice = inputDevice.next().charAt(0);
			
			inputDevice.nextLine();
			
			if(choice=='a'||choice=='A'){
				displaySalutation(lastName);
				
			}
			if(choice=='b'||choice=='B'){
				displaySalutation(firstName,lastName);
			}
			if(choice=='q'||choice=='Q'){
				cont=false;
			}
		}*/

	
	}
}