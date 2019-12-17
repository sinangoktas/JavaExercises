package com.example.idea.SortingSearching.binarySearch;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class ArrayUtilTest {

    ArrayUtil arrayUtil;
    int[] intArr;

    @BeforeClass
    void setUp() {
        arrayUtil = new ArrayUtil();
    }

    @Test
    void randomIntArrayTest() {
        intArr = arrayUtil.randomIntArray(5, 5);
        Assert.assertEquals(intArr.length, 5);

    }

    @Test
    void swapTest() {
        intArr = new int[] {1,2,3,4,5};
        arrayUtil.swap(intArr, 0, 4);
        Assert.assertEquals(intArr[0], 5);
        Assert.assertEquals(intArr[4], 1);

    }
}