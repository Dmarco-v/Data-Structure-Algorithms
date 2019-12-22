package offer;

public class CountPrime {
	public static int numPrimeArrangements(int n) {
        return (int)(factorial(countPrime(n)) * factorial(n-countPrime(n))%1000000007);
    }
    private static int countPrime(int n){
        int[] num =new int[n+1];
        for(int i=2;i<n+1;i++){
            if(num[i]==0){
                for(int j=2;i*j<n+1;j++){
                    num[i*j]=1;
                }
            }
        }
        int count=0;
        for(int i=2;i<n+1;i++){
            if(num[i]==0) count++;
        }
        return count;
    }
    private static long factorial(int n){
        if(n<=1) return 1;
        else return (long)n*factorial(n-1)%1000000007;
    }
    static //辗转相除法求最大公约数
    int gcdMod(int a,int b){
        return (b==0)? a : gcdMod(b, a%b);
    }
    //更相减损法求最大公约数
    static int gcdMinus(int a,int b){
        if(a<b) return gcdMinus(b,a);
        return (b==0)? a: gcdMinus(b,a-b);
    }
    static //最小公倍数为ab相乘除以最大公约数
    int lcm(int a,int b){
        return a*b/gcdMod(a,b);
    }
    

    
    public static void main(String[] args) {
    	System.out.println(countPrime(100));
    	System.out.println(factorial(countPrime(100))* factorial(100-countPrime(100)));
    	System.out.println(numPrimeArrangements(100));
    	System.out.println(gcdMod(664,332));
    	System.out.println(gcdMinus(210,287));
    	System.out.println(lcm(40,7));
	}
}
