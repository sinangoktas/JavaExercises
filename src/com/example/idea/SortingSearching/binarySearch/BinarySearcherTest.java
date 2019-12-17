package com.example.idea.SortingSearching.binarySearch;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class BinarySearcherTest {
    BinarySearcher binarySearcher;
    int[] a;

    @BeforeClass
    void setUp() {
        binarySearcher = new BinarySearcher();
    }

    @Test
    void searchTest() {
        a = new int[] {9, 12, 19, 23, 33, 44, 54, 65, 89, 98};
        int result1 = binarySearcher.search(a, 0, a.length - 1, 98);
        int result2 = binarySearcher.search(a, 0, a.length - 1, 23);
        Assert.assertEquals(9, result1);
        Assert.assertEquals(3, result2);


    }

}