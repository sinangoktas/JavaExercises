package com.main.SortingSearching.linearSearch;
import com.main.SortingSearching.binarySearch.BinarySearcher;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BinarySearcherTest {
    static BinarySearcher binarySearcher;
    int[] a;

    @BeforeClass
    public static void setUp() {
        binarySearcher = new BinarySearcher();
    }

    @Test
    public void searchTest() {
        a = new int[] {9, 12, 19, 23, 33, 44, 54, 65, 89, 98};
        int result1 = binarySearcher.search(a, 0, a.length - 1, 98);
        int result2 = binarySearcher.search(a, 0, a.length - 1, 23);
        Assert.assertEquals(9, result1);
        Assert.assertEquals(3, result2);


    }

}