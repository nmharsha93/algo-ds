package DS;

import DS.Graph.Vertex;

import java.util.ArrayList;

/**
 * Created by harsha.nm on 03/10/15.
 */
public class MinHeap {
    private ArrayList<Vertex> arr;

    public  MinHeap() {

    }

    public MinHeap(ArrayList<Vertex> arr) {
        this.arr  = arr;
    }

    public void insert(Vertex val) {
        arr.add(val);
    }

    public Vertex getMinimumVertex() {
        Vertex minVal = arr.get(0);
        for(Vertex each: arr) {
            if(minVal.getDistance() > each.getDistance()) {
                minVal = each;
            }
        }
        arr.remove(arr.indexOf(minVal));
        return minVal;
    }

    public Boolean find(Vertex v) {
        //TODO
        return true;
    }

    public int size() {
        return arr.size();
    }
}
