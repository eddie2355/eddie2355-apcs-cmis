public class eProblem2
    {
        public static void main ( String[] argv )
            {
                int[] fib = new int [2];
                fib[1] = 2;
                while(fib[1] < 4000000)
                {
                   fib[0] = 1;
                   fib[1] = fib[0] + fib[1];
                    fib[0] = fib[1];
                   
                   
                   System.out.println(fib[0]);
                   System.out.println(fib[1]);
                }
                
            }  
    } 
