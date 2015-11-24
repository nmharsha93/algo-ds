package Algos;

import DS.Graph.Edge;
import DS.Graph.Graph;
import DS.Graph.Vertex;
import Helpers.GraphConstructionHelper;
import org.junit.Test;

import java.io.FileNotFoundException;

/**
 * Created by harsha.nm on 03/10/15.
 */
public class TestShortestpath {

    GraphConstructionHelper graphConstructionHelper;

    @Test
    public void testEdge() {
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Edge edge = new Edge(3,v1,v2);
    }

    @Test
    public void testFindShortestPath() throws FileNotFoundException {
        graphConstructionHelper = new GraphConstructionHelper();
        Graph g = graphConstructionHelper.createGraph();
        Vertex startVertex = graphConstructionHelper.getStartVertex();
        Vertex endVertex = graphConstructionHelper.getEndVertex();
        ShortestPath shortestPath = new ShortestPath(g,startVertex,endVertex);
        shortestPath.findShortestPath();
    }
}
