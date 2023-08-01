package com.briansea.ai;
import java.util.List;
import java.util.Random;

import com.briansea.gamecabinet.game.Game;
import com.briansea.gamecabinet.game.Move;
import com.briansea.gamecabinet.game.Player;

public class RandomAI extends Player {

	private MMNode node;

	public RandomAI() {
		
		node = new MMNode();
		// set my name
		this.nameProperty().set("Random AI");
	}
	
	public void makeMove( Game gamestate, List<Move> move) {
		List<List<Move>> validMoves = gamestate.getValidMoves();
		
		node.alphaBeta(5, 10);
		Random r = new Random();
		int pick = r.nextInt(validMoves.size());
		for( Move m : validMoves.get(pick)) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			move.add(m);
		}
		
	}
	
	private class MMNode {
		public int alphaBeta(int alpha, int beta) {
			return 5;
		}
	}
}
