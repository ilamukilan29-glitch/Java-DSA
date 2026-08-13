public class Spiral {
    public static void main(String[] args) {
        int n=3;
        int[][] res = new int[n][n];
        int val=1;
        int l=0;
        int r=n-1;
        int b=n-1;
        int t=0;
        while(l<=r && t<=b){
            for(int j=l;j<=r;j++){
                res[t][j]=val++;
            }
            t++;
            for(int j=t;j<=b;j++){
                res[j][r]=val++;
            }
            r--;
            for(int j=r;j>=l;j--){
                res[b][j]=val++;
            }
            b--;
            for(int j=b;j>=t;j--){
                res[j][l]=val++;
            }
            l++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                  System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
      
    }
}
