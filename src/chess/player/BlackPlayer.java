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


}
