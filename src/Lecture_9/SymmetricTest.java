package Lecture_9;

public class SymmetricTest {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{2,4,5},{3,5,8}};
        boolean check = true;

        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(i==j)continue;
                if(matrix[i][j]!=matrix[j][i]) {
                    check = false;
                    break;
                }
            }
        }

        for(int[] i: matrix){
            for(int j: i){
                System.out.print(j + "  ");
            }
            System.out.println();
        }
        System.out.println("Is the matrix an symmetric matrix? " + check);
    }
}
