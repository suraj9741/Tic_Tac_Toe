import java.util.*;
import java.util.Scanner;
public class Tic_Tac_Toe{
	static void EmptyBorad(){
		//Add : Create a board array
		int boardSize=10;
		char []board=new char[boardSize];
		for(int i=1;i<boardSize;i++){
			board[i]=' ';
		}
	}
	//Add : function for choose latter for user
	static void ChooseLetter(){	
		Scanner MyObj = new Scanner(System.in);
		while(true){
			System.out.println("Choose the latter X or O");
			String userLetter = MyObj.nextLine();
			if (userLetter.equals("X")||userLetter.equals("x")){
				String computerLatter="O";
				break;
			}
			else if(userLetter.equals("O")||userLetter.equals("o")){
				String computerLatter="X";
				break;
			}
			else{
				System.out.println("Invalid Letter");
			}
		}
		
	}
	public static void main(String args[]){
		EmptyBorad();
		ChooseLetter();
	}
}