import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonaci {

	public static void main(String[] args) {
		
		int n =100;
		
		System.out.println(0);
		
	    for (int i = 0; i < n-1; i++) {
	        System.out.println(fibonacci3(i));
	    }
	}
	
	private static Map<Integer, BigInteger> memo = new HashMap<>();

	public static BigInteger fibonacci3(int n) {
	    if (n == 0 || n == 1) {
	        return BigInteger.ONE;
	    }
	    if (memo.containsKey(n)) {
	        return memo.get(n);
	    }
	    BigInteger v = fibonacci3(n - 2).add(fibonacci3(n - 1));
	    memo.put(n, v);
	    return v;
	}
	
}

/* Output: 
218922995834555169026 
*/