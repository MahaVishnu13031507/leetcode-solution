// Last updated: 2/4/2026, 8:59:42 PM
class Solution {
    public int diagonalSum(int[][] mat) {
             int sum=0;
             for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat.length;j++){
                    if(i==j|| (i+j)==(mat.length-1))
                    sum+=mat[i][j];
                }
             }
             return sum;
    }
}