package Algos;

import java.util.ArrayList;

/**
 * Created by harsha.nm on 22/09/15.
 */
public class MergeSort {

    private SplitObject splitInTwo(ArrayList<Integer> arr) {
        ArrayList<Integer> firstHalf = new ArrayList<Integer>();
        ArrayList<Integer> secondHalf = new ArrayList<Integer>();

        for(int i=0;i<arr.size();i++) {
            if(i<arr.size()/2)
                firstHalf.add(arr.get(i));
            else
                secondHalf.add(arr.get(i));
        }

        SplitObject splitObject = new SplitObject(firstHalf,secondHalf);
        return splitObject;
    }

    private void doMergeSort(ArrayList<Integer> arr) {
        System.out.println("Hi there");
        SplitObject splitObject = splitInTwo(arr);
        splitObject.getFirstHalf();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(new Integer(2));
        arr.add(new Integer(4));
        arr.add(new Integer(3));
        arr.add(new Integer(5));
        arr.add(new Integer(1));
        MergeSort mergeSort = new MergeSort();
        mergeSort.doMergeSort(arr);
    }
}


class SplitObject {
    private ArrayList<Integer> firstHalf;
    private ArrayList<Integer> secondHalf;

    public SplitObject(ArrayList<Integer> firstHalf, ArrayList<Integer> secondHalf) {
        this.firstHalf = firstHalf;
        this.secondHalf = secondHalf;
    }

    public ArrayList<Integer> getFirstHalf() {
        return firstHalf;
    }

    public void setFirstHalf(ArrayList<Integer> firstHalf) {
        this.firstHalf = firstHalf;
    }

    public ArrayList<Integer> getSecondHalf() {
        return secondHalf;
    }

    public void setSecondHalf(ArrayList<Integer> secondHalf) {
        this.secondHalf = secondHalf;
    }
}
