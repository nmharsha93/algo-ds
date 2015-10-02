package DS.Graph;

/**
 * Created by harsha.nm on 03/10/15.
 */
public class Edge {
    private int weight;
    private Vertex v1;
    private Vertex v2;

    public Edge(int w, Vertex u, Vertex v) {
        weight = w;
        v1 = u;
        v2 = v;
    }

    public Vertex getV1() {
        return v1;
    }

    public Vertex getV2() {
        return v2;
    }

    public int getWeight() {
        return weight;
    }
}
