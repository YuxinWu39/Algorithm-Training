package com.company;

import java.util.*;

public class Solution {
    public int[] quickSort(int[] array) {
        if (array == null) {
            return null;
        }
        quickSort(array, 0, array.length - 1);
        return array;
    }

    public void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivotPos = partition(array, left, right);
        quickSort(array, left, pivotPos - 1);
        quickSort(array, pivotPos - 1, right);

    }

    private int partition(int[] array, int left, int right) {
        int pivotIndex = getPivotIndex(left, right);
        int pivotValue = array[pivotIndex];

        swap(array, pivotIndex, right);

        int leftBound = left;
        int rightBound = right - 1;
        while (leftBound <= rightBound) {
            if (array[leftBound] < pivotValue) {
                leftBound++;
            } else if (array[rightBound] >= pivotValue) {
                rightBound--;
            } else {
                swap(array, leftBound++, rightBound--);
            }
        }
        swap(array, leftBound, right);
        return leftBound;

    }

    private int getPivotIndex(int left, int right) {
        return left + (int) (Math.random() * (right - left + 1));
    }

    private void swap(int[] array, int left, int right) {
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }

    public static void main(String args[]) {
        Solution sol = new Solution();
        int[] inputArray = new int[]{3, 5, 1, 2, 4, 8};
        int[] outputArray = null;
        outputArray = sol.quickSort(inputArray);
        System.out.println(Arrays.toString(outputArray));
    }


}

