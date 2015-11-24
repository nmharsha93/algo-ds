package DS.Graph;

import java.util.ArrayList;

/**
 * Created by harsha.nm on 03/10/15.
 */
public class Graph {

    private ArrayList<Vertex> vertices;
    private ArrayList<Edge> edges;

    public Graph() {
        vertices = new ArrayList<Vertex>();
        edges = new ArrayList<Edge>();
    }

    public Vertex getVertexWithLabel(int l) {
        for(Vertex v: vertices) {
            if(v.getLabel() == l) {
                return v;
            }
        }
        return null;
    }

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

    public void updateNeighbors() {
        for(Edge e: edges) {
            Vertex u = e.getV1();
            Vertex v = e.getV2();
            ArrayList<Vertex> uNeighbors = u.getNeighbours();
            ArrayList<Vertex> vNeighbors = v.getNeighbours();
            if(!uNeighbors.contains(v)) {
                u.addNeighbor(v);
            }
            if(!vNeighbors.contains(u)) {
                v.addNeighbor(u);
            }
        }
    }

    public int graphSize() {
        return vertices.size();
    }
}
