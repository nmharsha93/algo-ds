package Problems;

/**
 * Created by harsha.nm on 17/10/15.
 */

/**
 * Problem: A table composed of N x M cells, each having a certain quantity of apples, is given.
 * You start from the upper-left corner. At each step you can go down or right one cell.
 * Find the maximum number of apples you can collect.
 */

public class MaxApplesPath {
    int arr[][];
    int S[][];
    public MaxApplesPath(int arr[][]) {
        this.arr = arr;
        S = new int[arr.length][arr[0].length];
        int r = arr.length;
        int c = arr[0].length;
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                S[i][j] = Integer.MAX_VALUE;
            }
        }
    }

    public int maxApplesCollectable() {
        S[0][0] = arr[0][0];
        for(int i=0;i<S.length;i++) {
            for(int j=0;j<S[0].length;j++) {
                if(i>0) {
                    S[i][j] = S[i-1][j]+arr[i][j];
                }
                if(j>0 && S[i][j]<S[i][j-1]+arr[i][j]) {
                    S[i][j] = S[i][j-1] + arr[i][j];
                }
            }
        }
        return S[S.length-1][S[0].length-1];
    }
}
