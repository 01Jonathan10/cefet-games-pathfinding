package br.cefetmg.games.pathfinding;

import com.badlogic.gdx.ai.pfa.Heuristic;
import com.badlogic.gdx.math.Vector2;

public class EuclideanHeuristic implements Heuristic<TileNode> {
    public float estimate(TileNode n, TileNode n1){
        Vector2 dist = n.getPosition().cpy().sub(n1.getPosition());
        return dist.len()/32;
    }
}
