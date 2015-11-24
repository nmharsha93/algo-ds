package DS.Graph;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;

/**
 * Created by harsha.nm on 03/10/15.
 */
public class Vertex implements Comparable {
    private int label;
    private int distance;
    private ArrayList<Vertex> neighbors;

    public Vertex(int label) {
        this.label = label;
        this.distance = Integer.MAX_VALUE;
        neighbors = new ArrayList<Vertex>();
    }

    public void addNeighbor(Vertex v) {
        neighbors.add(v);
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

    public int compareTo(Object vertex2) throws ClassCastException {
        if(!(vertex2 instanceof Vertex))
            throw new ClassCastException("Vertex expected");
        int dist = ((Vertex) vertex2).getDistance();
        return this.distance-dist;
    }
}
