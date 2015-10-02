package Algos;

import Helpers.DisplayHelper;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by harsha.nm on 27/09/15.
 */
public class LIS {
    private ArrayList<Integer> arr;
    private int dp[];
    DisplayHelper displayHelper;

    public LIS(ArrayList<Integer> arr) {
        displayHelper = new DisplayHelper();
        this.arr = arr;
        dp = new int[arr.size()];
        for(int i=0;i< arr.size();i++) {
            dp[i] = -1;
        }
    }


    private int LISLength() {
        for(int i=0;i<arr.size();i++) {
            dp[i]=1;
            for(int j=0;j<i;j++) {
                if(dp[j]>=dp[i]) {
                    dp[i]=dp[j];
                    if(arr.get(i)>arr.get(j)) {
                        dp[i]+=1;
                    }
                }

            }
        }
        displayHelper.printArray(dp);
        return dp[arr.size()-1];
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Collections.addAll(arr, 5,3,4,8,6,7);
        LIS lis = new LIS(arr);
        System.out.println(lis.LISLength());
    }
}
