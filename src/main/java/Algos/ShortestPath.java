package Algos;

import DS.Graph.Edge;
import DS.Graph.Graph;
import DS.MinHeap;
import DS.Graph.Vertex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by harsha.nm on 03/10/15.
 */
public class ShortestPath {

    private int arr[];
    private MinHeap minHeap;
    private Vertex startVertex;
    private Vertex endVertex;
    private Graph graph;

    public ShortestPath(Graph graph, Vertex startVertex, Vertex endVertex) {
        arr = new int[graph.graphSize()];
        for(int i=0;i<arr.length;i++) {
            arr[i]=Integer.MAX_VALUE;
        }
        minHeap = new MinHeap();
        this.startVertex = startVertex;
        this.endVertex = endVertex;
    }

    public void findShortestPath() {
        startVertex.setDistance(0);
        minHeap.insert(startVertex);

        while(checkTerminatingCondition()) {
            Vertex u = minHeap.getMinimumVertex();
            ArrayList<Vertex> neighbours = u.getNeighbours();

            for(Vertex v: neighbours) {
                if(!minHeap.find(v)) {
                    Edge e = graph.getEdge(u,v);
                    if(e!=null) {
                        v.setDistance(u.getDistance()+e.getWeight());
                        minHeap.insert(v);
                    }
                }
            }
        }

    }

    private boolean checkTerminatingCondition() {
        if(minHeap.find(endVertex)||minHeap.size()==0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Vertex v1 = new Vertex(0);
        Vertex v2 = new Vertex(1);
        Vertex v3 = new Vertex(1);

        v1.addNeighbors(new ArrayList<Vertex>(Arrays.asList(v2)));
        v2.addNeighbors(new ArrayList<Vertex>(Arrays.asList(v1,v3)));
        v3.addNeighbors(new ArrayList<Vertex>(Arrays.asList(v2)));

        Edge e1 = new Edge(1,v1,v2);
        Edge e2 = new Edge(2,v2,v3);

        Graph graph = new Graph();
        graph.addVertices(new ArrayList<Vertex>(Arrays.asList(v1,v2,v3)));
        graph.addEdges(new ArrayList<Edge>(Arrays.asList(e1, e2)));

        ShortestPath shortestPath = new ShortestPath(graph,v1,v2);
        shortestPath.findShortestPath();
    }
}

