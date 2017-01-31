public class Exercise06_27 {

    public static void main(String[] args) {
        
    	//equation for all three sub class must be true to show the number
    	int count = 0;
        for (int x = 10; count < 100; x++) {
            if (isPrime(x) && isPrime(reversingPrime(x)) && !reversablePrime(x)) {
            	System.out.printf("%5d", x);
                count++;
                if (count % 10 == 0 && x != 0) System.out.println();
      }
    }
  }
    
    //equation for finding prime
    public static boolean isPrime(long n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    //equation to reverse a prime number
    public static long reversingPrime(long n) {
        long i = 0;
        while (n != 0) {
            i = i * 10 + n % 10;
            n = n / 10;
        }
        return i;
    }
    
    //show that a prime is a prime reversed
    public static boolean reversablePrime(long n) {
    	return (n == reversingPrime(n));
    }
}
