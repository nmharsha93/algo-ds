package Algos;

/**
 * Created by harsha.nm on 17/10/15.
 */
public class KadaneAlgo {

    private int[] arr;

    public KadaneAlgo(int[] arr) {
        this.arr = arr;
    }

    public int maxSum() {
        int maxSoFar = arr[0];
        int currMax = arr[0];
        for(int i=0;i<arr.length;i++) {
            currMax = Math.max(arr[i],currMax+arr[i]);
            maxSoFar = Math.max(maxSoFar,currMax);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int a[] =  {-2, -3, 4, -1, -2, 1, 5, -3};
        KadaneAlgo kadaneAlgo = new KadaneAlgo(a);
        int max_sum = kadaneAlgo.maxSum();
        System.out.println(max_sum);
        //cout << "Maximum contiguous sum is " << max_sum;
    }
}
