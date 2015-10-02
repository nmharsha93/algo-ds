package DS.Graph;

import java.util.ArrayList;

/**
 * Created by harsha.nm on 03/10/15.
 */
public class Graph {

    private ArrayList<Vertex> vertices;
    private ArrayList<Edge> edges;

    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    public void addVertices(ArrayList<Vertex> va) {
        for(Vertex v : va) {
            vertices.add(v);
        }
    }

    public Edge getEdge(Vertex u, Vertex v) {
        for(Edge e: edges) {
            if((e.getV1()==u && e.getV2()==v)||(e.getV1()==v && e.getV2()==u)) {
                return e;
            }
        }

        return null;
    }

    public void addEdge(Edge e) {
        edges.add(e);
    }

    public void addEdges(ArrayList<Edge> ea) {
        for(Edge e : ea) {
            edges.add(e);
        }
    }

    public int graphSize() {
        return vertices.size();
    }
}
