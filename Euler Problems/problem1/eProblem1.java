
public class eProblem1
    {
        public static void main ( String[] argv )
            {
                int sum = 0;
                for(int i=0;i<100;i++)
                {
                    int answer3 = i % 3;
                    int answer5 = i % 5;
                    if(answer3 == 0 || answer5 == 0)
                    {
                        sum = sum + i;
                        //System.out.println(i);
                    }
                 
                }
                System.out.println(sum);
             } 
    } 