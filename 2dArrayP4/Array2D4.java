public class Array2D4
{
    public static void main(String[] args)
    {
        String[][] grid= new String[10][10];
        String[] ABC;
        int i=0;
        ABC = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        for(int row = 0;row < grid.length;row ++)
        {
            for(int col =0;col <grid[0].length;col ++)
            {
                grid[row][col]=ABC[i];
                i= i+1;
                if(i==26)
                {
                    i=0;
                }
            }
        }

        for(int row = 0;row <grid.length;row++)
        {
            for(int col=0;col<grid[0].length;col++)
            {
                System.out.print(grid[row][col]+ "\t");
            }
            System.out.print("\n");
        }
    }
}
