package com.example.idea.SortingSearching.binarySearch;

import org.junit.jupiter.api.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;


class ArrayUtilTest {

    ArrayUtil arrayUtil;
    int[] intArr;

    @BeforeClass
    void setUp() {
        arrayUtil = new ArrayUtil();
    }

    @Test
    void randomIntArrayTest() {
        int[] arr = arrayUtil.randomIntArray(5, 5);
        Assert.assertEquals(arr.length, 5);

    }

    @Test
    void swapTest() {
        intArr = new int[] {1,2,3,4,5};
        arrayUtil = new ArrayUtil();
        arrayUtil.swap(intArr, 0, 4);
        Assert.assertEquals(intArr[0], 5);
        Assert.assertEquals(intArr[4], 1);

    }
}