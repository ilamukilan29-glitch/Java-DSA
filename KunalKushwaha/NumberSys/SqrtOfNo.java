public class SqrtOfNo {
    static double sqrt(int n){
        int str=0;
        int end=n;
        double root=0.0;
        while(str<=end){
            int mid=str+(end-str)/2;
            if(mid*mid==n){
                return mid;
            }
            if(mid*mid>n){
                end=mid-1;
            }else{
                //root =mid;
                str=mid+1;
            }
        }
        double inc=0.1;
        for(int i=0;i<3;i++){
            while(root*root<=n){
                root+=inc;
            }
            root-=inc;
            inc/=10;
        }
        return root;
    }
    public static void main(String[] args){
        int n=40;
        // O(log n) -> T/C
        System.out.print(sqrt(n));
        System.out.printf("%.3f", sqrt(n));
        
    }
}
