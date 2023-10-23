package de.hska.iwi.ads.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    @Test
    public void testBinarySearch() {
        BinarySearch<Integer> binarySearch = new BinarySearch<>();
        Integer[] array = {1, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        // Test auf vorhandenen Wert
        int index1 = binarySearch.search(array, 5);
        assertEquals(6, index1);

        // Test auf nicht vorhandenen Wert
        int index2 = binarySearch.search(array, 11);
        assertEquals(-1, index2);

        // Test auf kleineren Wert (Fall 1)
        int index3 = binarySearch.search(array, 0);
        assertEquals(-1, index3);

        // Test auf größeren Wert (Fall 2)
        int index4 = binarySearch.search(array, 15);
        assertEquals(-1, index4);

        // Test auf innerhalb des Bereichs (Fall 3)
        int index5 = binarySearch.search(array, 2);
        assertEquals(1, index5);


    }
}