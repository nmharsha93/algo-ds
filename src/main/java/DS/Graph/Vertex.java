package DS.Graph;

import java.util.ArrayList;

/**
 * Created by harsha.nm on 03/10/15.
 */
public class Vertex {
    private int label;
    private int distance;
    private ArrayList<Vertex> neighbors;

    public Vertex(int label) {
        this.label = label;
        this.distance = Integer.MAX_VALUE;
    }

    public void addNeighbors(ArrayList<Vertex> va) {
        for(Vertex v: va) {
            neighbors.add(v);
        }
    }

    public int getLabel() {
        return label;
    }

    public ArrayList<Vertex> getNeighbours() {
        return neighbors;
    }

    public void setDistance(int d) {
        distance = d;
    }

    public int getDistance() {
        return distance;
    }
}
