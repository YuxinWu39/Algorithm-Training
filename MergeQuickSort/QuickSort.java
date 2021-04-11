package MergeQuickSort;
public class QuickSort {
    public static void main(String[] args) {
        QuickSort test = new QuickSort();
        int[] array = new int[] {4,7,8,56,34,23,67,100,1};
        array = test.quickSort(array);
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
    }

    public int[] quickSort(int[] array) {
        if (array == null || array.length <= 1){
            return array;
        }
        quickSort(array,0,array.length - 1);
        return array;
    }

    public void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = partition(array, left, right);
        quickSort(array, left, mid - 1);
        quickSort(array,mid + 1, right);
    }


    public int partition (int[] array, int left, int right) {
        int pivot = left + (int) (Math.random() * (right - left + 1));
        swap(array, pivot, right);
        int i = left;
        int j = right - 1;
        while (i <= j) {
            if (array[i] < array[right]) {
                i++;
            } else if (array[j] >= array[right]) {
                j--;
            } else {
                swap(array, i++, j--);
            }
        }
        swap(array,i,right);
        return i;
    }

    public void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
