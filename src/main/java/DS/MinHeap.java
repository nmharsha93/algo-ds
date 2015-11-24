package DS;

import DS.Graph.Vertex;

import java.util.ArrayList;

/**
 * Created by harsha.nm on 03/10/15.
 */
public class MinHeap {

    /* Assuming a zero-based index for the minHeap array representation */
    private ArrayList<Vertex> arr;

    public  MinHeap() {
        arr = new ArrayList<Vertex>();
    }

    public MinHeap(ArrayList<Vertex> arr) {
        this.arr  = arr;
        buildMinHeap();
    }

    public void insert(Vertex v) {
        arr.add(v);
        bubbleUp(arr.size() - 1);
    }

    private void bubbleUp(int i) {
        if(i==0) return;
        int j=parent(i);
        if(!checkMinHeapConditionForSingleNode(j)) {
            swap(i,j);
            bubbleUp(j);
        }
    }

    private boolean checkMinHeapConditionForSingleNode(int i) {
        boolean flag = (lchild(i)>=arr.size() || arr.get(i).compareTo(arr.get(lchild(i)))<=0);
        return (rchild(i)>=arr.size() || arr.get(i).compareTo(arr.get(rchild(i)))<=0) && flag;
    }

    private void swap(int i,int j) {
        Vertex u = arr.get(i);
        Vertex v = arr.get(j);
        arr.set(i,v);
        arr.set(j,u);
    }

    private void minHeapify(int i) {
        int swapIndex = -1;
        if(lchild(i)<size() && arr.get(lchild(i)).compareTo(arr.get(i))<0) {
            swapIndex=lchild(i);
        }
        if(rchild(i)<size() && arr.get(rchild(i)).compareTo(arr.get(swapIndex))<0) {
            swapIndex = rchild(i);
        }
        if(swapIndex != -1) {
            swap(i,swapIndex);
            minHeapify(swapIndex);
        }
    }

    private void buildMinHeap() {
        //todo
        for(int i=size()/2-1;i>=0;i--) {
            minHeapify(i);
        }
    }

    private int parent(int i) {
        return (i-1)/2;
    }

    private int lchild(int i) {
        return 2*i+1;
    }

    private int rchild(int i) {
        return 2*i+2;
    }

    public Vertex getRoot() {
        Vertex minVal = arr.get(0);
        swap(0, arr.size()-1);
        arr.remove(arr.size()-1);
        minHeapify(0);
        return minVal;
    }

    public Vertex peekRoot() {
        return arr.get(0);
    }

    public Boolean find(Vertex v) {
        return arr.contains(v);
    }

    public int size() {
        return arr.size();
    }

    public void updateVertex(Vertex v, int value) {
        if(arr.contains(v)) {
            int index = arr.indexOf(v);
            Vertex u = arr.get(index);
            u.setDistance(value);
            arr.set(index,u);
            bubbleUp(index);
        }
    }
}
