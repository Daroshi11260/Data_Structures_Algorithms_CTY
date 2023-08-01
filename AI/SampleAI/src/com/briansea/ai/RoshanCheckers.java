package com.briansea.ai;

import com.briansea.gamecabinet.game.Game;
import com.briansea.gamecabinet.game.Move;
import com.briansea.gamecabinet.game.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RoshanCheckers extends Player {

    private MMNode node;

    public RoshanCheckers(){
        this.nameProperty().set("Roshan Checkers");
    }

    @Override
    public void makeMove(Game gamestate, List<Move> move){
        node = new MMNode(gamestate, move, true);
        node.maximize = true;
        List<List<Move>> validMoves = gamestate.getValidMoves();
        Random r = new Random();
        int pick = r.nextInt(validMoves.size());
        for( Move m : validMoves.get(pick)) {
            move.add(m);
        }

        node.alphaBeta(Integer.MAX_VALUE, Integer.MIN_VALUE, 3);

    }

    private class MMNode{
        private static int INFINITY = Integer.MAX_VALUE;
        private boolean maximize;
        private Game state;
        private List<Move> move;
        private ArrayList<MMNode> children;
        int value;
        public MMNode(Game state, List<Move> move, boolean maximize){
            this.state = state;
            this.children = new ArrayList<MMNode>();
            this.move = move;
        }

        private int score() {
            Random rand = new Random();
            return rand.nextInt(100);
        }

        public int alphaBeta(int alpha, int beta, int depth){
            if (depth == 0){
                return value;
            }
            depth--;
            //create children from all available moves
            List<List<Move>> validMoves = state.getValidMoves();
            for (List<Move> move : validMoves){
                Game childState = state.deepCopy();
                childState.makeMove(move);
                children.add(new MMNode(childState, move, !maximize));
            }
            if (maximize){
                int bestScore = -INFINITY;
                for (MMNode child : children){
                    int score = child.alphaBeta(alpha, beta, depth);
                    bestScore = Math.max(bestScore, score);
                    alpha = Math.max(alpha, bestScore);
                    if (beta <= alpha){
                        break;
                    }
                }
                return bestScore;
            } else {
                int bestScore = INFINITY;
                for (MMNode child : children){
                    int score = child.alphaBeta(alpha, beta, depth);
                    bestScore = Math.min(bestScore, score);
                    beta = Math.min(beta, bestScore);
                    if (beta <= alpha){
                        break;
                    }
                }
                return bestScore;
            }
        }
    }
}
