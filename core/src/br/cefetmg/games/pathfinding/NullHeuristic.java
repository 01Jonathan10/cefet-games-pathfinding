package br.cefetmg.games.pathfinding;

import com.badlogic.gdx.ai.pfa.Heuristic;

public class NullHeuristic implements Heuristic<TileNode> {
    public float estimate(TileNode n, TileNode n1){
        return 0;
    }
}
