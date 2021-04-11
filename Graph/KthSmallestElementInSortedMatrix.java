package Graph;// Name: Yuxin Wu (Peter Wu)

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElementInSortedMatrix {
    public static void main(String[] args) {
        KthSmallestElementInSortedMatrix result = new KthSmallestElementInSortedMatrix();
        int[][] test = new int[3][3];
        test[0] = new int[]{1, 2, 3, 4};
        test[1] = new int[]{3, 4, 5, 6};
        test[2] = new int[]{5, 6, 7, 8};
        System.out.print(result.kthSmallest(test, 7));

    }

    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        boolean[][] visited = new boolean[rows][columns];

        PriorityQueue<Cell> minHeap = new PriorityQueue<>(k, new Comparator<Cell>() {
            @Override
            public int compare(Cell c1, Cell c2) {
                if (c1.value == c2.value) {
                    return 0;
                }
                return c1.value < c2.value ? -1 : 1;
            }
        });

        minHeap.add(new Cell(0,0,matrix[0][0]));
        visited[0][0] = true;

        for (int i = 0; i < k -1; ++i) {
            Cell cur = minHeap.poll();
            if(cur.row + 1 < rows && !visited[cur.row + 1][cur.column]) {
                minHeap.add(new Cell(cur.row + 1, cur.column, matrix[cur.row + 1][cur.column]));
                visited[cur.row + 1][cur.column] = true;
            }

            if(cur.column + 1 < columns && !visited[cur.row][cur.column + 1]) {
                minHeap.add(new Cell(cur.row, cur.column + 1, matrix[cur.row][cur.column + 1]));
                visited[cur.row][cur.column + 1] = true;
            }
        }
        return minHeap.peek().value;

    }

    private class Cell {
        int row;
        int column;
        int value;

        public Cell(int rows, int columns, int value) {
            this.row = rows;
            this.column = columns;
            this.value = value;
        }
    }
}