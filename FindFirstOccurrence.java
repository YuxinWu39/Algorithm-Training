package BinarySearch;// Name: Yuxin Wu (Peter Wu)

// VUnetID: wuy45
// Email: yuxin.wu@vanderbilt.edu
// Class: CS 1101 - Vanderbilt University
// Section: 02 (TR Singh)
//
// Program description: This program is designed to output the interstate highway numbers.
// Date: 25th Sep
// Honor statement: I have neither given nor received any unauthorized aid on this assignment.
public class FindFirstOccurrence {

    public static void main(String[] args) {
        FindFirstOccurrence test = new FindFirstOccurrence();
        int[] testArr = new int[] {3,4,8,8,8,8,67,67,67,67};
        System.out.println(test.FirstOccurence(testArr,67));
        System.out.println(test.FirstOccurence(testArr,8));
    }

    public int FirstOccurence (int[] array, int target){
        if (array == null||array.length==0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;

        while (left < right-1) {
            int mid = left + (right - left) / 2;
            if(array[mid] == target) {
                right = mid;
            } else if (array[mid] > target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if (array[left] == target) {
            return left;
        } else if (array[right] == target){
            return right;
        }
        return -1;
    }
}
