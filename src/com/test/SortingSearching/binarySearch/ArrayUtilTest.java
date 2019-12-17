package com.test.SortingSearching.binarySearch;

import com.main.SortingSearching.binarySearch.ArrayUtil;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

<<<<<<< HEAD:src/com/example/idea/SortingSearching/binarySearch/ArrayUtilTest.java
=======

>>>>>>> 261c71a92fc4f2bedfef4f8cb3209dd0712e6e11:src/com/test/SortingSearching/binarySearch/ArrayUtilTest.java
class ArrayUtilTest {

    ArrayUtil arrayUtil = new ArrayUtil();

    @Test
    void randomIntArrayTest() {
        intArr = arrayUtil.randomIntArray(5, 5);
        Assert.assertEquals(intArr.length, 5);

    }

    @Test
    void swapTest() {
<<<<<<< HEAD:src/com/example/idea/SortingSearching/binarySearch/ArrayUtilTest.java
        intArr = new int[] {1,2,3,4,5};
=======
        int[] intArr = new int[] {1,2,3,4,5};
>>>>>>> 261c71a92fc4f2bedfef4f8cb3209dd0712e6e11:src/com/test/SortingSearching/binarySearch/ArrayUtilTest.java
        arrayUtil.swap(intArr, 0, 4);
        Assert.assertEquals(intArr[0], 5);
        Assert.assertEquals(intArr[4], 1);

    }

}