package Problems;

import junit.framework.TestCase;

/**
 * Created by harsha.nm on 17/10/15.
 */
public class MaxApplesPathTest extends TestCase {

    public void testMaxApplesCollectable() throws Exception {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        MaxApplesPath maxApplesPath = new MaxApplesPath(arr);
        System.out.println(maxApplesPath.maxApplesCollectable());
    }
}