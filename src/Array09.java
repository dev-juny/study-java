public class Array09 {
    public static void main(String[] args) {

        int[][] array = new int[][]{{0, 1, 2}, {3, 4, 5}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("array[i][j] = " + array[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

