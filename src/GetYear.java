import java.util.Scanner;
import javax.swing.JOptionPane;

public class GetYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
		int birthYear = 0;
	
		
		Scanner keyBoardInput= new Scanner (System.in);
		System.out.println("Enter the year you were born>>>>>>>");
		birthYear = keyBoardInput.nextInt();
		
		System.out.println("You entered " + birthYear + " as your year of birth");
		
		System.out.println("You are " + (2022 - birthYear) + " years old");
		
		
		/*String result;
		result = JOptionPane.showInputDialog(null, "Enter the year you were born");
		birthYear = Integer.parseInt(result);
		JOptionPane.showConfirmDialog(null, "You are " + (2022 - birthYear) + "years old");*/
				
		
	}

}
