import java.util.*;
import java.util.Scanner;
public class Tic_Tac_Toe{
	static void EmptyBorad(){
		//UC 1 Add : Create a board array
		int boardSize=10;
		char []board=new char[boardSize];
		for(int i=1;i<boardSize;i++){
			board[i]=' ';
		}
	}
	//UC 2 Add : function for choose latter for user
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
	//UC 3 Add : function to create game board
	static void GameBoard(){
		char [][] gameBoard ={{' ','|',' ','|',' '},
							  {'-','+','-','+','-'},
							  {' ','|',' ','|',' '},
							  {'-','+','-','+','-'},
							  {' ','|',' ','|',' '}};
		for (char[] row : gameBoard){
			for (char column : row){
				System.out.print(column);
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]){
		EmptyBorad();
		ChooseLetter();
		GameBoard();
	}
}