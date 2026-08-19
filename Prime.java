public class Prime {
    public static void main(String[] args) {
        int n=40;
        if(n<=2){
            System.out.println(0);
        }else{
        boolean[] primes = new boolean[n];
        sieveInrothanasis(primes, n);
        }
    }
    // Sieve of Eratosthenes
    static void sieveInrothanasis(boolean[] primes, int n){
        
        for(int i=2;i*i<n;i++){
            if(!primes[i]){
                for(int j=i*i;j<n;j+=i)
                    primes[j]=true;
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(!primes[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
