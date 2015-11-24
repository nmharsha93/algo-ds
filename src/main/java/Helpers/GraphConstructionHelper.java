package Helpers;

import DS.Graph.Edge;
import DS.Graph.Graph;
import DS.Graph.Vertex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by harsha.nm on 08/10/15.
 */
public class GraphConstructionHelper {
    private Graph graph;
    private Vertex startVertex;
    private Vertex endVertex;

    public Vertex getStartVertex() {
        return startVertex;
    }

    public Vertex getEndVertex() {
        return endVertex;
    }


    public Graph createGraph() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("/Users/harsha.nm/IdeaProjects/crawler/Algos/src/main/java/Helpers/graph");
        Scanner scanner = new Scanner(fis);
        graph = new Graph();

        String vn_str = scanner.nextLine();
        int vn = Integer.parseInt(vn_str);

        for(int i=0;i<vn;i++) {
            String str = scanner.nextLine();
            int vi = Integer.parseInt(str);
            Vertex v = new Vertex(vi);
            graph.addVertex(v);
        }

        String en_str = scanner.nextLine();
        int en = Integer.parseInt(en_str);

        for(int i=0;i<en;i++) {
            String str = scanner.nextLine();
            String[] str_arr = str.split(" ");
            int ui = Integer.parseInt(str_arr[0]);
            int vi = Integer.parseInt(str_arr[1]);
            int w = Integer.parseInt(str_arr[2]);
            Vertex u = graph.getVertexWithLabel(ui);
            Vertex v = graph.getVertexWithLabel(vi);
            Edge e1 = new Edge(w,u,v);
            Edge e2 = new Edge(w,v,u);
            graph.addEdges(new ArrayList<Edge>(Arrays.asList(e1,e2)));
        }

        String startVtx = scanner.nextLine();
        this.startVertex = graph.getVertexWithLabel(Integer.parseInt(startVtx));
        String endVtx = scanner.nextLine();
        this.endVertex = graph.getVertexWithLabel(Integer.parseInt(endVtx));

        graph.updateNeighbors();

        return graph;
    }
    public static void main(String[] args) throws FileNotFoundException {
        GraphConstructionHelper graphConstructionHelper = new GraphConstructionHelper();
        Graph g = graphConstructionHelper.createGraph();
        System.out.println(g.graphSize());
    }

}
