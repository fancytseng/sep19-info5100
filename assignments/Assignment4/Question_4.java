package Assignment4;

public class Question_4 {
        public int[][] SparseMatrixMultiplication(int[][] A, int[][] B) {

            int[][] C = new int[A.length][B[0].length];//[B[0].length] means B's column

            for(int i=0; i<C.length; i++){
                for(int j=0; j<C[0].length; j++){
                    //we are calculating the sum for each row from A and column from B so we initalize the sum first
                    int sum=0;
                    //k has to be less than A's column (which is equal to B's row)
                    for(int k=0; k<A[0].length; k++){
                        //k is column
                        //A[i][k]: [i]row not changing, [k]column changing
                        //B[k][j]: [k]column not changing, [i]row changing
                        sum += A[i][k]*B[k][j];
                    }
                    C[i][j] = sum;
                }
            }
            return C;
        }
}

