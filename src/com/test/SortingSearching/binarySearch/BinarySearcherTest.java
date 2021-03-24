package com.test.SortingSearching.binarySearch;

import com.main.SortingSearching.binarySearch.BinarySearcher;
import org.junit.Test;

import java.util.Arrays;

class BinarySearcherTest {

    BinarySearcher binarySearcher = new BinarySearcher();

    @Test
    void searchTest() {
        int[] b = { 4, 1, 9, 16, 64, 36, 19, 47, 89, 66 };
        Arrays.sort(b);
        int index = binarySearcher.search(b, 0,b.length - 1, 19);
        assert index == 4;

    }

}