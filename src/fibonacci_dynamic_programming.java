// Fibonacci Series using Dynamic Programming
class fibonacci_dynamic_programming
{
   static double fib(int n)
    {
    /* Declare an array to store Fibonacci numbers. */
    int f[] = new int[n+2]; // 1 extra to handle case, n = 0
    int i;
      
    /* 0th and 1st number of the series are 0 and 1*/
    f[0] = 0;
    f[1] = 1;
     
    for (i = 2; i <= n; i++)
    {
       /* Add the previous 2 numbers in the series
         and store it */
        f[i] = f[i-1] + f[i-2];
    }
      
    return f[n];
    }
      
    public static void main (String args[])
    {
        double start =  System.currentTimeMillis();
        int n = 161;
        System.out.println("Fib de "+n);
        System.out.println(fib(n));

        double end  =  System.currentTimeMillis();

        double atual = end - start;
        System.out.println("Tempo em segundos: "+ atual/1000);
    }
}
/* This code is contributed by Rajat Mishra */