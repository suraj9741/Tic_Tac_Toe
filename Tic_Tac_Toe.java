import java.util.*;
import java.util.Scanner;
public class Tic_Tac_Toe{
	static void EmptyBorad(){
		//Add : Create a board array
		int BoardSize=10;
		char []board=new char[BoardSize];
		for(int i=1;i<BoardSize;i++){
			board[i]=' ';
		}
	}
	
	static void ChooseLetter(){	
		Scanner MyObj = new Scanner(System.in);		
		System.out.println("Choose the latter X or O");
		String UserLatter = MyObj.nextLine();
		if (UserLatter.equals("X")){
			String ComputerLatter="O";
		}
		else{
			String ComputerLatter="X";
		}
	}
	public static void main(String args[]){
		EmptyBorad();
		ChooseLetter();
	}
}