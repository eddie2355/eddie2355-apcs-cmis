import java.util.ArrayList;
public class ArrayP2
{
    public static void main (String[] args)
    {
        int[][] array = new int[3][5];
        int rowSum = 0;
        int colSum = 0;
        int allSum = 0;
        int i = 0;
        ArrayList<Integer> rowAll = new ArrayList();
        ArrayList<Integer> colAll = new ArrayList();
        
        for(int row = 0; row < array.length;row++)
        {
            for(int col = 0; col < array[0].length;col++)
            {
                array[row][col] = i + 1;
                i++;
            }
        }
        
        for( int[] row : array)
        {
            for(int num : row)
            {
                System.out.print( num + "\t");
            }
            System.out.println("\n");
        }
        
        for(int row = 0; row < array.length;row++)
        {
            for(int col = 0; col < array[0].length;col++)
            {
                    allSum = allSum + array[row][col];
            }
        }
        
        for(int row = 0; row < array.length;row++)
        {
            for(int col = 0; col < array[0].length;col++)
            {
                    rowSum = rowSum + array[row][col];
                    if(col == array[0].length - 1)
                    {
                        rowAll.add(rowSum);
                        rowSum = 0;
                    }
            }
        }
        
        for(int col = 0; col < array[0].length;col++)
        {
            for(int row = 0; row < array.length;row++)
            {
                    colSum = colSum + array[row][col];
                    if(row == array.length - 1)
                    {
                        colAll.add(colSum);
                        colSum = 0;
                    }
            }
        }
        
        System.out.println("The total sum is " + allSum);
        
        for(int num = 0; num < rowAll.size();num++)
        {
            System.out.println("Sum of row " + (num +1) + ":   " + (rowAll.get(num)));
        }
        
        for(int num = 0; num < colAll.size();num++)
        {
            System.out.println("Sum of column " + (num + 1) +  ":   " + (colAll.get(num)));
        }
    }
}
