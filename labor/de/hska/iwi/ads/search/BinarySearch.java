package de.hska.iwi.ads.search;

public class BinarySearch implements Search {
    @Override
    public int search(Comparable[] a, Comparable key, int left, int right) {
        return 0;
    }

    @Override
    public int search(Comparable[] a, Comparable key) {
        return Search.super.search(a, key);
    }
}
