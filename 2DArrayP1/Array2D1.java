public class Array2D1
{
    public static void main (String[] args)
    {
        int[][] randNums = new int[3][4];
        for(int row = 0; row < randNums.length; row++)
        {
            for(int col = 0; col < randNums[0].length;col++)
            {
                randNums[row][col] = (int) (Math.random() * 10);
                System.out.print(randNums[row][col] + "    ");
            }
            System.out.println("\n");
        }
        
        for(int row = 0; row < randNums.length; row++)
        {
            for(int col = 0; col < randNums[0].length;col++)
            {
                if(randNums[row][col] == 5)
                {
                    System.out.println("There is a five at " + (row) + ","+ (col));
                }
            }
        }
    }
}
