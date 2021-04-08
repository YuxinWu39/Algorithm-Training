package BinarySearch;// Name: Yuxin Wu (Peter Wu)

// VUnetID: wuy45
// Email: yuxin.wu@vanderbilt.edu
// Class: CS 1101 - Vanderbilt University
// Section: 02 (TR Singh)
//
// Program description: This program is designed to output the interstate highway numbers.
// Date: 25th Sep
// Honor statement: I have neither given nor received any unauthorized aid on this assignment.
public class FindLastOccurence {
    public int findLastOccurence(int[] array, int target) {
        if(array == null||array.length==0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while (left < right -1 ) {
            int mid = left + (right -left) / 2;
            if (array[mid] == target) {
                left = mid;
            } else if (array[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (array[right] == target) {
            return right;
        } else if (array[left] == target) {
            return left;
        }
        return -1;
    }
    public static void main(String[] args) {
        FindLastOccurence test = new FindLastOccurence();
        int[] testArr = new int[] {3,4,5,6,7,8,9,9,9,9,9,9};
        System.out.print(test.findLastOccurence(testArr,9));
    }
}
