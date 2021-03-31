package MergeQuickSort;// Name: Yuxin Wu (Peter Wu)

// VUnetID: wuy45
// Email: yuxin.wu@vanderbilt.edu
// Class: CS 1101 - Vanderbilt University
// Section: 02 (TR Singh)
//
// Program description: This program is designed to output the interstate highway numbers.
// Date: 25th Sep
// Honor statement: I have neither given nor received any unauthorized aid on this assignment.
public class MergeSort {
    public static void main(String[] args) {
        MergeSort test = new MergeSort();
        int[] testArr = new int[] {4,30,46,98,56,34,32,65};
        testArr = test.sort(testArr);
        for(int i= 0; i < testArr.length; ++i) {
            System.out.print(testArr[i] + " ");
        }

    }

    public int[] sort(int[] array) {
        if (array == null || array.length <= 1) {
            return array;
        }
        return mergeSort(array, 0, array.length - 1);
    }

    public int[] mergeSort(int[] array, int left, int right) {

        if (left == right) {
            return new int[]{array[left]};
        }
        int mid = left + (right - left) / 2;
        int[] leftResult = mergeSort(array, left, mid);
        int[] rightResult = mergeSort(array, mid + 1, right);
        return merge(leftResult, rightResult);
    }

    private int[] merge(int[] leftResult, int[] rightResult) {
        int[] result = new int[leftResult.length + rightResult.length];

        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        while (leftIndex < leftResult.length && rightIndex < rightResult.length) {
            if (leftResult[leftIndex] <= rightResult[rightIndex]) {
                result[resultIndex] = leftResult[leftIndex];
                leftIndex++;
            } else {
                result[resultIndex] = rightResult[rightIndex];
                rightIndex++;
            }
            resultIndex++;
        }

        while (leftIndex < leftResult.length) {
            result[resultIndex] = leftResult[leftIndex];
            leftIndex++;
            resultIndex++;
        }

        while (rightIndex < rightResult.length) {
            result[resultIndex] = rightResult[rightIndex];
            rightIndex++;
            resultIndex++;
        }
        return result;
    }


}
