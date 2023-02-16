package chess.player;

import java.util.List;

import chess.board.Piece;

// Siyah taşa sahip oyuncu sınıfı
public class BlackPlayer extends Player {

	//Tehdit taşları değişken olarak oluşturuldu.
	
	int blackPawnThreatCount=0,blackBishopThreatCount=0,blackKnightThreatCount=0,blackRookThreatCount=0;
	int blackQueenThreatCount=0,blackKingThreatCount=0;
	
	// Siyah taş değişkenleri
	int pawn=0,knight=0,rook=0,bishop=0,queen=0,king;
	
	public BlackPlayer(List<Piece> pieces) {
		super(pieces);
		
	}

	// Soru kitapçığındaki hesaplama mantığı kodlandı. Tehdit altındaki taşlar, puanın yarısı alınarak hesaba eklenir.
	public void score()
	{
		double score=(blackPawnThreatCount*0.5)+(pawn-blackPawnThreatCount)*1;
	 	score+=(blackBishopThreatCount*1.5)+(bishop-blackBishopThreatCount)*3;
	 	score+=(blackKnightThreatCount*1.5)+(knight-blackKnightThreatCount)*3;
	 	score+=blackRookThreatCount*2.5+(rook-blackRookThreatCount)*5;
	 	score+=blackQueenThreatCount*4.5+(queen-blackQueenThreatCount)*9;
	 	score+=blackKingThreatCount*50+(king-blackKingThreatCount)*100;
	 	
	    System.out.println("Black: "+ score);
				
	}

	// Bu metot ile, 8*8 satranç tahtası üzerinde hücrelere karşılık gelen taş-renk ilişkisinin oluşturulması istenmiştir.
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
