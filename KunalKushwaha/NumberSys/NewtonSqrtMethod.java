public class NewtonSqrtMethod {
    // Newton's Rapshon square root method
    /*
        root(n) = (x+(n/x))/2;
        Error: (root-x);
    */
   static double findsqr(int n){
        double x=n;
        double root;
        while(true){
            root=0.5*(x+(n/x));
            if(Math.abs(root -x)<0.1){
                break;
            }
            x=root;
        }
        return root;
   }
    public static void main(String[] ags){
        int n=40;
        System.out.print(findsqr(n));
    }
}
