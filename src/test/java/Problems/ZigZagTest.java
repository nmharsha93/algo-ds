package Problems;

import junit.framework.TestCase;

/**
 * Created by harsha.nm on 03/10/15.
 */
public class ZigZagTest extends TestCase {

    public void testLongestZigZag() throws Exception {
        ZigZag zigZag = new ZigZag();
        int arr[] = {1, 7, 4, 9, 2, 5};
        assertEquals(zigZag.longestZigZag(arr),6);
    }

    public void test4() throws Exception {
        ZigZag zigZag = new ZigZag();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(zigZag.longestZigZag(arr),2);
    }

    public void test3() throws Exception {
        ZigZag zigZag = new ZigZag();
        int arr[] = {44};
        assertEquals(zigZag.longestZigZag(arr),1);
    }

    public void test5() throws Exception {
        ZigZag zigZag = new ZigZag();
        int arr[] = {70, 55, 13, 2, 99, 2, 80, 80, 80, 80, 100, 19, 7, 5, 5, 5, 1000, 32, 32};
        assertEquals(zigZag.longestZigZag(arr),8);
    }

    public void test6() throws Exception {
        ZigZag zigZag = new ZigZag();
        int arr[] = {374, 40, 854, 203, 203, 156, 362, 279, 812, 955,
                600, 947, 978, 46, 100, 953, 670, 862, 568, 188,
                67, 669, 810, 704, 52, 861, 49, 640, 370, 908,
                477, 245, 413, 109, 659, 401, 483, 308, 609, 120,
                249, 22, 176, 279, 23, 22, 617, 462, 459, 244};
        assertEquals(zigZag.longestZigZag(arr),36);
    }

    public void testLongestZigZag2() throws Exception {
        ZigZag zigZag = new ZigZag();
        int arr[] = {1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
        assertEquals(zigZag.longestZigZag(arr), 7);
    }
}