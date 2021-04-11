package BinarySearch;// Name: Yuxin Wu (Peter Wu)

// VUnetID: wuy45
// Email: yuxin.wu@vanderbilt.edu
// Class: CS 1101 - Vanderbilt University
// Section: 02 (TR Singh)
//
// Program description: This program is designed to output the interstate highway numbers.
// Date: 25th Sep
// Honor statement: I have neither given nor received any unauthorized aid on this assignment.
public class KClosestElements {
    public static void main(String[] args) {
        KClosestElements testCase = new KClosestElements();
        int[] testArr = {5,6,10,30,32,43,54,55,100};
        int[] result = testCase.kClosest(testArr, 20,4);
        for (int i = 0; i < result.length; ++i) {
            System.out.print(result[i] + " ");
        }
    }

    public int[] kClosest(int[] array, int target, int k) {
        if (array == null || array.length == 0) {
            return array;
        }

        int left = findLargestSmaller(array, target);
        int right = left + 1;
        return formKClosestArray(array,left,right,k,target);

    }

    public int findLargestSmaller(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                right = mid - 1;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }

        if (array[right] <= target) {
            return right;
        } else if (array[left] <= target) {
            return left;
        }
        return -1;
    }

    public int[] formKClosestArray(int[] array, int left, int right, int num, int target) {
        if (array == null || array.length == 0) {
            return array;
        }

        int[] kCloeset = new int[num];
        for (int i = 0; i < num; ++i) {
            if (right >= array.length || left >= 0 && Math.abs(array[left] - target) <= Math.abs(array[right] - target)) {
                kCloeset[i] = array[left--];
            } else {
                kCloeset[i] = array[right++];
            }
        }
        return kCloeset;
    }

}
