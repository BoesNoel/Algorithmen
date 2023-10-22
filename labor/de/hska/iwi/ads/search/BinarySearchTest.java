package de.hska.iwi.ads.search;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public abstract class BinarySearchTest extends SearchTest {
    public abstract <E extends Comparable<E>> BinarySearch<E> createBinarySearch();
    @Test
    void testSearchIntegerArrayInteger() {
        BinarySearch<Integer> search = new BinarySearch<>();
        Integer[] a = {0, 2, 4, 7, 9, 10, 11};
        assertEquals(3, search.search(a, 7));
    }

    @Test
    void testSearchStringArrayString() {
        BinarySearch<String> search = new BinarySearch<>();
        String[] a = {"apple", "banana", "cherry", "date", "grape", "kiwi", "orange"};
        assertEquals(4, search.search(a, "grape"));
    }

    @Test
    void testSearchStringArrayStringNotFound() {
        BinarySearch<String> search = new BinarySearch<>();
        String[] a = {"apple", "banana", "cherry", "date", "grape", "kiwi", "orange"};
        assertEquals(-1, search.search(a, "pear"));
    }

    @Test
    void testSearchEmptyArray() {
        BinarySearch<Integer> search = new BinarySearch<>();
        Integer[] a = {};
        assertEquals(-1, search.search(a, 7));
    }

    @Test
    void testSearchSingleElementArrayFound() {
        BinarySearch<Integer> search = new BinarySearch<>();
        Integer[] a = {5};
        assertEquals(0, search.search(a, 5));
    }

    @Test
    void testSearchSingleElementArrayNotFound() {
        BinarySearch<Integer> search = new BinarySearch<>();
        Integer[] a = {5};
        assertEquals(-1, search.search(a, 10));
    }

    @Test
    void testSearchNullArray() {
        BinarySearch<Integer> search = new BinarySearch<>();
        Integer[] a = null;
        assertEquals(-1, search.search(a, 10));
    }

   /* @Test
    void testSearchIntegerArrayInteger() {
        BinarySearch<Integer> search = createBinarySearch();
        Integer[] a = {0, 2, 4, 7, 9, 10, 11};
        assertEquals(3, search.search(a, 7));
    }

    @Test
    void testSearchIntegerEArrayInteger1() {
        BinarySearch<Integer> search = createBinarySearch();
        Integer [] a = {0, 2, 4, 7, 9, 10, 11};

        assertEquals(3, search.search(a, 6));
    }

    @Test
    void testSearchIntegerArrayInteger2() {
        BinarySearch<Integer> search = createBinarySearch();
        Integer [] a = {0, 2, 4, 7, 9, 10, 11};
        assertEquals(6, search.search(a, 11));
    }

    @Test
    void testSearchIntegerArrayInteger3() {
        BinarySearch<Integer> search = createBinarySearch();
        Integer [] a = {0, 2, 4, 7, 9, 10, 11};

        assertEquals(0, search.search(a, 0));
    }

    @Test
    void testSearchIntegerArrayInteger4() {
        BinarySearch<Integer> search = createBinarySearch();
        Integer [] a = {0, 2, 4, 7, 9, 10, 11};

        assertEquals(7, search.search(a, 13));
    }

    @Test
    void testSearchIntegerArrayInteger5() {
        BinarySearch<Integer> search = createBinarySearch();
        Integer [] a = {1, 3, 5, 7, 9};

        assertEquals(3, search.search(a, 6));
    }

    @Test
    void testSearchIntegerArrayE5() {
        BinarySearch<Integer> search = createBinarySearch();
        Integer [] a = {0, 2, 4, 7, 9, 10, 11};

        assertEquals(-1, search.search(a, -2));
    }


    @Test
    void testSearchIntegerArrayIntegerIntInt() {
        BinarySearch<Integer> search = createBinarySearch();
        Integer [] a = {0, 2, 4, 7, 9, 10, 11};

        assertEquals(3, search.search(a, 7, 1, a.length - 2));
    }

    @Test
    void testSearchIntegerArrayIntegerIntInt1() {
        BinarySearch<Integer> search = createBinarySearch();
        Integer [] a = {0, 2, 4, 7, 9, 10, 11};

        assertEquals(3, search.search(a, 7, 3, 3));
    }

    @Test
    void testSearchIntegerArrayIntegerIntInt2() {
        BinarySearch<Integer> search = createBinarySearch();
        Integer [] a = {0, 2, 4, 7, 9, 10, 11};

        assertEquals(2, search.search(a, 5, 3, 3));
    }

    @Test
    void testSearchIntegerArrayIntegerIntInt3() {
        BinarySearch<Integer> search = createBinarySearch();
        Integer [] a = {0, 2, 4, 7, 9, 10, 11};

        assertEquals(2, search.search(a, 5, 3, 3));
    }

    @Test
    void testSearchIntegerArrayIntegerIntInt4() {
        BinarySearch<Integer> search = createBinarySearch();
        Integer [] a = {0, 2, 4, 7, 9, 10, 11};

        assertEquals(4, search.search(a, 9, 3, 3));
    }

    @Test
    void testSearchStringArrayString() {
        BinarySearch<String> search = createBinarySearch();
        String [] a = {"a", "c", "e", "g"};
        assertEquals(2, search.search(a, "e", 0, a.length -1));
    }

    @Test
    void testSearchStringArrayString2() {
        BinarySearch<String> search = createBinarySearch();
        String [] a = {"a", "black", "car", "moving", "over", "public", "roads", "to", "utah"};
        assertEquals(-1, search.search(a, " "));
    }

    @Test
    void testSearchStringArrayString3() {
        BinarySearch<String> search = createBinarySearch();
        String [] a = {"a", "black", "car", "moving", "over", "public", "roads", "to", "utah"};
        assertEquals(0, search.search(a, "a"));
    }

    @Test
    void testSearchStringArrayString4() {
        BinarySearch<String> search = createBinarySearch();
        String [] a = {"a", "black", "car", "moving", "over", "public", "roads", "to", "utah"};
        assertEquals(1, search.search(a, "b"));
    }

    @Test
    void testSearchStringArrayString5() {
        BinarySearch<String> search = createBinarySearch();
        String [] a = {"a", "black", "car", "moving", "over", "public", "roads", "to", "utah"};
        assertEquals(4, search.search(a, "over"));
    }

    @Test
    void testSearchStringArrayString6() {
        BinarySearch<String> search = createBinarySearch();
        String [] a = {"a", "black", "car", "moving", "over", "public", "roads", "to", "utah"};
        assertEquals(6, search.search(a, "rapidly"));
    }

    @Test
    void testSearchStringArrayString7() {
        BinarySearch<String> search = createBinarySearch();
        String [] a = {"a", "black", "car", "moving", "over", "public", "roads", "to", "utah"};
        assertEquals(8, search.search(a, "utah"));
    }

    @Test
    void testSearchStringArrayString8() {
        BinarySearch<String> search = createBinarySearch();
        String [] a = {"a", "black", "car", "moving", "over", "public", "roads", "to", "utah"};
        assertEquals(9, search.search(a, "washington"));
    }

    @Test
    void testSearchLocaleDateArrayLocaleDate() {
        LocalDate date = LocalDate.of(2018, Month.SEPTEMBER, 10);
        BinarySearch<ChronoLocalDate> search = createBinarySearch();
        LocalDate [] dates = {date.minusMonths(2), date.minusDays(5), date, date.plusDays(5), date.plusMonths(2)};
        assertEquals(2, search.search(dates, date));
    }

    @Test
    void testSearchLocaleDateArrayLocaleDate1() {
        LocalDate date = LocalDate.of(2018, Month.SEPTEMBER, 10);
        BinarySearch<ChronoLocalDate> search = createBinarySearch();
        LocalDate [] dates = {date.minusMonths(2), date.minusDays(5), date, date.plusDays(5), date.plusMonths(2)};
        assertEquals(3, search.search(dates, date.plusDays(1)));
    }

    @Test
    void testSearchIntArrayInt1() {
        Integer [] a = {1, 2, 2, 2, 3, 4, 5};
        BinarySearch<Integer> search = createBinarySearch();
        assertEquals(1, search.search(a, 2));
    }

    @Test
    void testSearchIntArrayInt2() {
        Integer [] a = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2};
        BinarySearch<Integer> search = createBinarySearch();
        assertEquals(0, search.search(a, 1));
    }

    @Test
    void testSearchIntArrayIntNull() {
        Integer [] a = null;
        BinarySearch<Integer> search = createBinarySearch();
        assertThrows(NullPointerException.class , () -> search.search(a, 1) );
    }

    @Test
    void testSearchIntArrayIntOutOfBounds() {
        Integer [] a = {0, 1, 2, 3, 4, 5};
        BinarySearch<Integer> search = createBinarySearch();
        assertThrows(ArrayIndexOutOfBoundsException.class , () -> search.search(a, 2, 0, 7) );
    }

    @Test
    void testSearchIntArrayIntOutOfBounds1() {
        Integer [] a = {0, 1, 2, 3, 4, 5};
        BinarySearch<Integer> search = createBinarySearch();
        assertThrows(ArrayIndexOutOfBoundsException.class , () -> search.search(a, 2, 0, -2) );
    }*/

}
