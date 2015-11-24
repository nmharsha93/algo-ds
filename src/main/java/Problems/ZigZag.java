package Problems;

/**
 * Created by harsha.nm on 03/10/15.
 */
public class ZigZag {
    int dp1[];
    int dp2[];
    public int longestZigZag(int[] sequence) {

        dp1 = new int[sequence.length];
        for(int i=0;i<sequence.length;i++) {
            dp1[i]=Integer.MAX_VALUE;
        }
        dp2 = new int[sequence.length];
        for(int i=0;i<sequence.length;i++) {
            dp2[i]=-1;
        }

        dp1[0]=1;
        dp2[0]=sequence[0];

        for(int i=1;i<sequence.length;i++) {
            dp1[i]=1;
            dp2[i]=sequence[i];
            for(int j=0;j<i;j++) {
                if(dp1[j]+1>dp1[i] && (sequence[j]==dp2[j] || (dp2[j]-sequence[j])*(sequence[i]-sequence[j])>0)) {
                    dp1[i]=dp1[j]+1;
                    dp2[i]=sequence[j];
                }
            }
        }
        return dp1[sequence.length-1];
    }
}
