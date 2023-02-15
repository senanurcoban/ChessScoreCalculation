package chess;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import chess.player.BlackPlayer;
import chess.player.WhitePlayer;

public class chessMain {

	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> array=new ArrayList<>();
		String [][] board = new String [8][8];
			
	    File file = new File("C:\\cheesCalculation\\ChessScoreCalculation\\board2.txt");  
	    Scanner sc = new Scanner(file);
	  
		
		 //n
	       while (sc.hasNextLine())
	       {
	    	   Scanner s1 = new Scanner(sc.nextLine());
		       while (s1.hasNext()) {
		        	
		            String s = s1.next();
		            array.add(s);
		           
		     }}
	      int k=0;
	      
	    //n
	      for(int i=0;i<8;i++)
	      {
	    	  for(int j=0;j<8;j++)
	    	  {
	    		  board[i][j]=array.get(k++);
	    	  }
	      }
	      System.out.println("---Dosya Okundu---");
	      System.out.println("File Name: "+file.getName());
	      BlackPlayer blackScore = new BlackPlayer(null);
	      blackScore.print(board);
	      blackScore.score();
	      
	      System.out.println("---");
	      WhitePlayer whiteScore = new WhitePlayer(null);
	      whiteScore.print(board);
	      whiteScore.score();
		
	}
}
