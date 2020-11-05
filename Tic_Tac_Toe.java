import java.util.*;
public class Tic_Tac_Toe{	
	static void EmptyBorad(){
		//UC 1 Add : Create a board array
		int boardSize=10;
		char []board=new char[boardSize];
		for(int i=1;i<boardSize;i++){
			board[i]=' ';
		}
	}
	public static void main(String args[]){
		EmptyBorad();
	}
}