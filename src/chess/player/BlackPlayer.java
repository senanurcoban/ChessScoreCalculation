package chess.player;

import java.util.List;

import chess.board.Piece;

public class BlackPlayer extends Player {

	int blackPawnThreatCount=0,blackBishopThreatCount=0,blackKnightThreatCount=0,blackRookThreatCount=0;
	int blackQueenThreatCount=0,blackKingThreatCount=0;
	int pawn=0,knight=0,rook=0,bishop=0,queen=0,king;
	
	public BlackPlayer(List<Piece> pieces) {
		super(pieces);
		
	}

	public void score()
	{
		double score=(blackPawnThreatCount*0.5)+(pawn-blackPawnThreatCount);
	 	score+=(blackBishopThreatCount*1.5)+(bishop-blackBishopThreatCount)*3;
	 	score+=(blackKnightThreatCount*1.5)+(knight-blackKnightThreatCount)*3;
	 	score+=blackRookThreatCount*2.5+(rook-blackRookThreatCount)*5;
	 	score+=blackQueenThreatCount*4.5+(queen-blackQueenThreatCount)*9;
	 	score+=blackKingThreatCount*50+(king-blackKingThreatCount)*100;
	 	
	    System.out.println("Black: "+ score);
				
	}

	public void print (String board[][])
	{
		for(int i=0;i<8;i++) {
    		for(int j=0;j<8;j++)
    		{
    			if(board[i][j].equalsIgnoreCase("fs"))
    			{
    				bishop++;
    			}
    			if(board[i][j].equalsIgnoreCase("ps"))
    			{
    				pawn++;
    			}
    			if(board[i][j].equalsIgnoreCase("as"))
    			{
    				knight++;
    			}
    			if(board[i][j].equalsIgnoreCase("vs"))
    			{
    				queen++;
    			}
    			if(board[i][j].equalsIgnoreCase("ss"))
    			{
    				king++;
    			}
    			if(board[i][j].equalsIgnoreCase("ks"))
    			{
    				rook++;
    			}
    			
    		}}	
	}

}
