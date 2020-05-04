package com.test.SortingSearching.binarySearch;

import com.main.SortingSearching.binarySearch.ArrayUtil;
import org.junit.Assert;
import org.junit.Test;

class ArrayUtilTest {

    ArrayUtil arrayUtil = new ArrayUtil();

    @Test
    void randomIntArrayTest() {
        int[] intArr = arrayUtil.randomIntArray(5, 5);
        Assert.assertEquals(intArr.length, 5);

    }

    @Test
    void swapTest() {
        int[] intArr = new int[] {1,2,3,4,5};
        arrayUtil.swap(intArr, 0, 4);
        Assert.assertEquals(intArr[0], 5);
        Assert.assertEquals(intArr[4], 1);

    }

}