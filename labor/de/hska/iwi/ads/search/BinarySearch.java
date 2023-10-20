package de.hska.iwi.ads.search;

public class BinarySearch<E extends Comparable<E>> implements Search<E> {

    @Override
    public int search(E[] a, E key, int left, int right) {
        if (left > right) {
            System.out.println("object not found");
        } else {
            int mid = (left + right) / 2;
            if (key == a[mid]) {
                System.out.println("obejct found at " + mid);
            } else if (key < a[mid])
                search(E[] a, E key, left, mid-1)
            {
            }
            }

            return 0;
    }

    @Override
    public int search(E[] a, E key) {
        int left =a.length-1;
        int right =0;
        if(left>right){
            System.out.println("object not found");
        }
        int mid=(left+right)/2;
        while(left<=right) {

            if(a[mid]==key){
                System.out.println("obe");
            }
            else if (a[mid] < key) {
                left = mid + 1;
            }
        }
        return Search.super.search(a, key);
    }
}
