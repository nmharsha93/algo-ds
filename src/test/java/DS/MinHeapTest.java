package DS;

import DS.Graph.Vertex;
import Helpers.DisplayHelper;
import junit.framework.TestCase;

/**
 * Created by harsha.nm on 04/10/15.
 */
public class MinHeapTest extends TestCase {

    MinHeap minHeap;
    @Override
    public void setUp() throws Exception {
        super.setUp();
        minHeap = new MinHeap();
    }

    public void testInsert() throws Exception {
        minHeap.insert(new Vertex(2));
        assertEquals(minHeap.size(),1);
        minHeap.insert(new Vertex(3));
        assertEquals(minHeap.size(),2);
    }

    public void testGetRoot() throws Exception {
        Vertex u = new Vertex(2);
        u.setDistance(3);
        minHeap.insert(u);
        Vertex v = new Vertex(3);
        v.setDistance(2);
        minHeap.insert(v);
        assertEquals(minHeap.getRoot().getDistance(), 2);
        assertEquals(minHeap.size(),1);
    }

    public void testPeekRoot() throws Exception {
        Vertex u = new Vertex(2);
        u.setDistance(3);
        minHeap.insert(u);
        Vertex v = new Vertex(3);
        v.setDistance(2);
        minHeap.insert(v);
        assertEquals(minHeap.peekRoot().getDistance(),2);
        assertEquals(minHeap.size(),2);
    }

    public void testFind() throws Exception {
        Vertex u = new Vertex(2);
        u.setDistance(3);
        minHeap.insert(u);
        Vertex v = new Vertex(3);
        v.setDistance(2);
        minHeap.insert(v);
        assertTrue(minHeap.find(u));
        assertFalse(minHeap.find(new Vertex(4)));
        assertTrue(minHeap.find(v));
    }

    public void testSize() throws Exception {
        minHeap.insert(new Vertex(2));
        assertEquals(minHeap.size(),1);
        minHeap.insert(new Vertex(3));
        assertEquals(minHeap.size(),2);
    }

    public void testUpdateVertex() throws Exception {
        minHeap.insert(new Vertex(3));
        minHeap.insert(new Vertex(2));
        System.out.println(minHeap.getRoot().getLabel());
    }
}