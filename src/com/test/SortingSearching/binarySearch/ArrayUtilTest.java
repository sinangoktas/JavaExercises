package com.test.SortingSearching.binarySearch;

import com.main.SortingSearching.binarySearch.ArrayUtil;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class ArrayUtilTest {

    ArrayUtil arrayUtil = new ArrayUtil();

    @Test
    void randomIntArrayTest() {
        int[] arr = arrayUtil.randomIntArray(5, 5);
        Assert.assertEquals(arr.length, 5);

    }

    @Test
    void swapTest() {
        int[] intArr = new int[] {1,2,3,4,5};
        arrayUtil.swap(intArr, 0, 4);
        Assert.assertEquals(intArr[0], 5);
        Assert.assertEquals(intArr[4], 1);

    }

}