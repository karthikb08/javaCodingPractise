public class Matrix {
    public static void main(String[] args) {

        int[][] dp = new int[3][4];

        dp[0][0] =1;
        dp[0][1] =3;
        dp[0][2] =1;
        dp[0][3] =2;
        dp[1][0] =1;
        dp[1][1] =5;
        dp[1][2] =1;
        dp[1][3] =3;
        dp[2][0] =4;
        dp[2][1] =2;
        dp[2][2] =1;
        dp[2][3] =1;

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(dp[i][j]);
            }
            System.out.println("");
        }

    }
}
