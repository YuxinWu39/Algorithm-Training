package MergeQuickSort;// Name: Yuxin Wu (Peter Wu)

// VUnetID: wuy45
// Email: yuxin.wu@vanderbilt.edu
// Class: CS 1101 - Vanderbilt University
// Section: 02 (TR Singh)
//
// Program description: This program is designed to output the interstate highway numbers.
// Date: 25th Sep
// Honor statement: I have neither given nor received any unauthorized aid on this assignment.
public class SelectionSort {
    public static void main (String[] args) {
        SelectionSort test = new SelectionSort();
        int[] array = new int[] {7,8,60,7,5,4,7,23,45};
        array = test.selectionSort(array);
        for(int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
    }

    public int[] selectionSort(int[] array) {
        if (array == null || array.length <= 1) {
            return array;
        }
        int pos = 0;
        for (int i = 0; i < array.length - 1; ++i) {
            for (int j = i + 1; j < array.length; ++j) {
                if (array[j] < array[pos]) {
                    pos = j;
                }
            }
            swap(array, i, pos);
        }
        return array;
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
