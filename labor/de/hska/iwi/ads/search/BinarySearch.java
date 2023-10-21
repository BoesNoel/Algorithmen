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
                System.out.println("obejct found at " + mid);
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

        return Search.super.search(a, key);
    }

    public static void main(String[] args) {
        Integer[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        BinarySearch<Integer> binarySearch = new BinarySearch<>();
        int result = binarySearch.search(array, 7, 0, array.length - 1);

    }
}
