import java.util.*;
import java.util.Scanner;
public class TicTacToe{
	static void ticTacToeBorad(){
		//UC 1 Add : Create a board array
		int boardSize=10;
		char []board=new char[boardSize];
		for(int i=1;i<boardSize;i++){
			board[i]=' ';
		}
		//UC 3 Add : function to create game board
		char [][] gameBoard ={{board[1],'|',board[2],'|',board[3]},
							  {'-','+','-','+','-'},
							  {board[4],'|',board[5],'|',board[6]},
							  {'-','+','-','+','-'},
							  {board[7],'|',board[8],'|',board[9]}};
		for (char[] row : gameBoard){
			for (char column : row){
				System.out.print(column);
			}
			System.out.println();
		}
	}
	//UC 2 Add : function for choose latter for user
	static void chooseLetter(){	
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
		chooseLetter();
		ticTacToeBorad();
	}
}