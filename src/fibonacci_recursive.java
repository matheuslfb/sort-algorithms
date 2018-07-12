//Fibonacci Series using Recursion
class fibonacci_recursive
{
    static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
      
    public static void main (String args[]){
        double start =  System.currentTimeMillis();
        int n = 25;
        System.out.println(fib(n));

        double end  =  System.currentTimeMillis();

        double atual = end - start;
        System.out.println("Tempo em segundos: "+ atual/1000);
    }
}
/* This code is contributed by Rajat Mishra */