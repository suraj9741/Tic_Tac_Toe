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
	//Add : function for choose latter for user
	static void ChooseLetter(){	
		Scanner MyObj = new Scanner(System.in);
		while(true){
			System.out.println("Choose the latter X or O");
			String UserLatter = MyObj.nextLine();
			if (UserLatter.equals("X")||UserLatter.equals("x")){
				String ComputerLatter="O";
				break;
			}
			else if(UserLatter.equals("O")||UserLatter.equals("o")){
				String ComputerLatter="X";
				break;
			}
		}
		
	}
	public static void main(String args[]){
		EmptyBorad();
		ChooseLetter();
	}
}