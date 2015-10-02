package Algos;

import Algos.Edge;
import Algos.Vertex;
import org.junit.Test;

/**
 * Created by harsha.nm on 03/10/15.
 */
public class TestShortestpath {
    @Test
    public void testEdge() {
        Vertex v1 = new Vertex("a");
        Vertex v2 = new Vertex("b");
        Edge edge = new Edge(3,v1,v2);
    }
}
