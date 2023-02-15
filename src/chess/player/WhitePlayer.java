package chess.player;

import java.util.List;

import chess.board.Piece;

public class WhitePlayer extends Player {

	boolean knightThreat=false;
	boolean queenThreat=false;
	boolean bishopThreat=false;
	boolean rookThreat=false;
	boolean pawnThreat=false;
	boolean kingThreat=false;
	int score;
	int whitePawnThreatCount=0,whiteBishopThreatCount=0,whiteKnightThreatCount=0,whiteRookThreatCount=0;
	int whiteQueenThreatCount=0,whiteKingThreatCount=0;
	
	int pawn=0,knight=0,rook=0,bishop=0,queen=0,king;
	
	public WhitePlayer(List<Piece> pieces) {
		super(pieces);
		
	}

	public void score()
	{
		double score=(whitePawnThreatCount*0.5)+(pawn-whitePawnThreatCount);
	 	score+=(whiteBishopThreatCount*1.5)+(bishop-whiteBishopThreatCount)*3;
	 	score+=(whiteKnightThreatCount*1.5)+(knight-whiteKnightThreatCount)*3;
	 	score+=whiteRookThreatCount*2.5+(rook-whiteRookThreatCount)*5;
	 	score+=whiteQueenThreatCount*4.5+(queen-whiteQueenThreatCount)*9;
	 	score+=whiteKingThreatCount*50+(king-whiteKingThreatCount)*100;
	 	
	    System.out.println("White: "+ score);
				
	}

	public void print (String board[][])
	{
		
		for(int i=0;i<8;i++) {
    		for(int j=0;j<8;j++)
    		{
    			if(board[i][j].equalsIgnoreCase("fb"))
    			{
    				bishop++;
    			}
    			if(board[i][j].equalsIgnoreCase("pb"))
    			{
    				pawn++;
    			}
    			if(board[i][j].equalsIgnoreCase("ab"))
    			{
    				knight++;
    			}
    			if(board[i][j].equalsIgnoreCase("vb"))
    			{
    				queen++;
    			}
    			if(board[i][j].equalsIgnoreCase("sb"))
    			{
    				king++;
    			}
    			if(board[i][j].equalsIgnoreCase("kb"))
    			{
    				rook++;
    			}
    			
    		}
        		
		}			    
    		
	}
	
}
