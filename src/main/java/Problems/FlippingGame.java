package Problems;

import Algos.KadaneAlgo;

import java.util.Scanner;

/**
 * Created by harsha.nm on 17/10/15.
 */
public class FlippingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int b[] = new int[n];
        int numOfOnes = 0;
        for(int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
            if(arr[i]==1) {
                b[i]=-1;
                numOfOnes++;
            } else {
                b[i]=1;
            }
        }

        int maxSoFar = b[0];
        int currMax = b[0];
        for(int i=1;i<b.length;i++) {
            currMax = Math.max(b[i],currMax+b[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }

        System.out.println(numOfOnes+maxSoFar);

    }
}
