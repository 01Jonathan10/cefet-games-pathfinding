package br.cefetmg.games.pathfinding;

import com.badlogic.gdx.ai.pfa.Heuristic;
import com.badlogic.gdx.math.Vector2;

public class ManhattanHeuristic implements Heuristic<TileNode> {
    public float estimate(TileNode n, TileNode n1){
        int dx = (int) ((Math.ceil(n.getPosition().x/32)) - (Math.ceil(n1.getPosition().x/32)));
        int dy = (int) ((Math.ceil(n.getPosition().y/32)) - (Math.ceil(n1.getPosition().y/32)));
        return (dx + dy) - Math.min(dx, dy);
    }
}
