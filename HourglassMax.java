
public class HourglassMax {
    public static void main(String[] args) {
        int mat[][] = {
            {1,2,3,0,0},
            {0,0,0,0,0},
            {2,1,4,0,0},
            {0,0,0,0,0},
            {1,1,0,1,0},
        };
        if(mat.length<3 || mat[0].length<3){
            return;
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<mat.length-2;i++){
            for(int j=0; j<mat[i].length-2;j++){
                int sum = mat[i][j]+mat[i][j+1]+mat[i][j+2]+mat[i+1][j+1]+mat[i+2][j]+mat[i+2][j+1]+mat[i+2][j+2];
                maxSum = sum>maxSum?sum:maxSum;
            }
        }
        System.out.println(maxSum);
    }
}
