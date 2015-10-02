package Algos;

import Helpers.DisplayHelper;

import java.util.Arrays;

/**
 * Created by harsha.nm on 03/10/15.
 */
public class MinCoinsSum {

    private int[] state;
    private int[] arr;
    private DisplayHelper displayHelper;

    public MinCoinsSum(int S,int arr[]) {
        state = new int[S+1];
        this.arr = arr;
        for(int i=0;i< state.length;i++) {
            state[i]=1000;
        }
    }

    private int FindMinCoinsToS(int S) {
        state[0]=0;

        sortArray();

        for(int i=1;i<=S;i++) {
            for(int j=0;j<arr.length;j++) {
                if(arr[j]>i) {
                    break;
                }

                if(state[i-arr[j]]!=1000) {
                    if(state[i]>state[i-arr[j]]) {
                        state[i]=state[i-arr[j]]+1;
                    }
                }
            }
        }

        return state[S];
    }

    private void sortArray() {
        Arrays.sort(arr);
        displayHelper = new DisplayHelper();
        //displayHelper.printArray(arr);
    }

    public static void main(String[] args) {
        int S = 11;

        int arr[] = {1,5,3};
        for(int i=0;i<12;i++) {
            MinCoinsSum minCoinsSum = new MinCoinsSum(i, arr);
            System.out.println(minCoinsSum.FindMinCoinsToS(i));
        }
    }
}
