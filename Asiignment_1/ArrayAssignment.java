public class ArrayAssignment {
    public static void main(String[] args) {
        // ==========================================================================
        // ONE-DIMENSIONAL ARRAY
        // ==========================================================================

        int[] array1D = {10, 20, 30, 40, 50};
        System.out.println("\n================= ONE-DIMENSIONAL ARRAY: =================");
        for (int i = 0; i < array1D.length; i++) {
            System.out.println("[" + i + "] = " + array1D[i]);
        }
        
        // ==========================================================================
        // TWO-DIMENSIONAL ARRAY
        // ==========================================================================

        int[][] array2D = {{1, 2, 3},{4, 5, 6},{7, 8, 9} };
        System.out.println("\n=================TWO-DIMENSIONAL ARRAY: ==================");
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length;j++) {
                System.out.println( "[" + i + "][" + j + "] = " + array2D[i][j] );
            }
        }

        // ==========================================================================
        // THREE-DIMENSIONAL ARRAY
        // ==========================================================================

        int[][][] array3D = {{{1, 2},{3, 4}},{{5, 6}, {7, 8}}};
        System.out.println("\n=================THREE-DIMENSIONAL ARRAY: ==================");
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0;j < array3D[i].length; j++) {
                for (int k = 0;k < array3D[i][j].length; k++) {
                    System.out.println("[" + i + "][" + j + "][" + k + "] = " + array3D[i][j][k] );
                }
            }
        }
        
        // ==========================================================================
        //  MERGING ARRAYS
        // ==========================================================================

        int[] firstArray = {10, 20, 30};
        int[] secondArray = {40, 50, 60};
        
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        int position = 0;
                
        for (int i = 0; i < firstArray.length; i++) {
            mergedArray[position] = firstArray[i];
            position++;
        }

        for (int i = 0; i < secondArray.length; i++) {
            mergedArray[position] = secondArray[i];
            position++;
        }

        System.out.println("\n=================MERGED ARRAY:=================");

        for (int i = 0; i < mergedArray.length; i++) {

            System.out.print( mergedArray[i] + " ");
        }
        
        // ==========================================================================
        // MINIMUM AND MAXIMUM
        // ==========================================================================

        int[][] matrix = {{12, 45, 7},{23, 56, 3}, {89, 34, 15}};
        System.out.println("\n\n=================MINIMUM AND MAXIMUM:=================");
        findMinimum(matrix);
        findMaximum(matrix);
    }

    // Function to find the minimum element

    public static void findMinimum(int[][] matrix) {
        int minimum = matrix[0][0];
        int row = 0;
        int column = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minimum) {
                    minimum = matrix[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        
        System.out.println(
            "Minimum Element: " + minimum
        );
        System.out.println( "Located at : Row " + row + ",and Column " + column);
    }
    
        // Function to find the maximum element
    public static void findMaximum(int[][] matrix) {

        int maximum = matrix[0][0];
        int row = 0;
        int column = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] > maximum) {
                    maximum = matrix[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        System.out.println(
            "Maximum Element: " + maximum
        );

        System.out.println("Located at : Row " + row + ",and Column " + column );
    }
}





































