public class Assig4 {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{1, 2 },{9, 7}};
        int[][] arr2 = new int[][]{{2, 3},{0, 1}};
        int[][] arr3 = new int[2][2];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr3[i][j] = arr1[i][j] * arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();

        }
    }
}
