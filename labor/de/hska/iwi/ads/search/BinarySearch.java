package de.hska.iwi.ads.search;

public class BinarySearch<E extends Comparable<E>> implements Search<E> {

    @Override
    public int search(E[] array, E key, int left, int right) {
        if (left > right) {
            System.out.println("Element not found");

        } else {
            int mid = (left + right) / 2;
            int keyResult = key.compareTo(array[mid]);

            if (keyResult == 0) {
                for (int i = mid; i >= 0; i--) {
                    if (array[i] != key) {
                        System.out.println("Element found at " + (i + 1));
                        return i + 1;
                    } else if (i == 0) {
                        return 0;
                    }
                }

            } else if (keyResult < 0)
                return search(array, key, left, mid - 1);

            else {
                return search(array, key, mid + 1, right);

            }
        }

        return -1;
    }

    @Override
    public int search(E[] array, E key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int keyResult = key.compareTo(array[mid]);
            if (keyResult == 0) {
                for (int i = mid; i >= 0; i--) {
                    if (array[i] != key) {
                        System.out.println("Element found at " + (i + 1));
                        return i + 1;
                    } else if (i == 0) {
                        return 0;
                    }
                }

            } else if (keyResult < 0) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }
        }
        System.out.println("Element not found ");
        return -1;
    }

}
