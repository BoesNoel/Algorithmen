package de.hska.iwi.ads.search;

public class BinarySearch<E extends Comparable<E>> implements Search<E> {

    @Override
    public int search(E[] a, E key, int left, int right) {
        if (left > right) {
            System.out.println("object not found");
        } else {
            int mid = (left + right) / 2;
            int keyResult = key.compareTo(a[mid]);
            if (keyResult == 0) {
                System.out.println("object found at " + mid);
                return mid;
            } else if (keyResult < 0)
                return search(a, key, left, mid - 1);


            else {
                return search(a, key, left, mid + 1);

            }
        }

        return 0;
    }

    @Override
    public int search(E[] a, E key) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int keyResult = key.compareTo(a[mid]);
            if (keyResult == 0) {
                return mid;
            } else if (keyResult < 0) {
                left = mid - 1;
            } else {
                right = mid + 1;
            }
        }
        return Search.super.search(a, key);
    }

}
