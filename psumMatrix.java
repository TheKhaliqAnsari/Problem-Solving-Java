class psumMatrix {
    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int psumMatrix1[][] = new int[matrix[0].length][matrix.length];
        // Creating psum Matrix ->
        // Row wise sum
        for(int i = 0; i < matrix.length; i++){
            int sum = 0;
            for(int j = 0; j < matrix[i].length; j++){
                sum = sum + matrix[i][j];
                psumMatrix1[i][j] = sum;
            }
        }
        // Col wise sum ->
        for(int i = 0; i < matrix.length; i++){
            int sum = 0;
            for(int j = 0; j < matrix[i].length; j++){
                sum = sum + psumMatrix1[j][i];
                psumMatrix1[j][i] = sum;
            }
        }

        for(int i = 0; i < matrix.length; i++){
            // int sum = 0;
            for(int j = 0; j < matrix[i].length; j++){
               System.out.print(psumMatrix1[i][j] + " ");
            }
            System.out.println();
        }
        

    }
}