package Problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by harsha.nm on 17/10/15.
 */
public class Puzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[m];

        for(int i=0;i<m;i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int diff = Integer.MAX_VALUE;

        for(int i=n-1;i<m;i++) {
            if(diff>arr[i]-arr[i-(n-1)]) {
                diff = arr[i]-arr[i-(n-1)];
            }
        }
        System.out.println(diff);
    }
}
