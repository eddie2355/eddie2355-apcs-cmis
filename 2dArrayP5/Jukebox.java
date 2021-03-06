import java.util.ArrayList;
public class Jukebox
{
    MySong[][] songList= new MySong[3][4];
    int rvalue=0;
    int cvalue=0;

    public Jukebox()
    {
        songList[0][0] = new MySong("The Trooper", 5);
        songList[0][1] = new MySong("Bad Moon Rising", 4);
        songList[0][2] = new MySong("What Does the Fox Say?", 1);
        songList[0][3] = new MySong("Master of Puppets", 5);
        songList[1][0] = new MySong("Reincarnate", 1);
        songList[1][1] = new MySong("Ride the Lighting", 4);
        songList[1][2] = new MySong("Forever Young", 5);
        songList[1][3] = new MySong("Blue Suede Shoes", 3);
        songList[2][0] = new MySong("Hammer Time", 2);
        songList[2][1] = new MySong("Boys in the Hood", 4);
        songList[2][2] = new MySong("Barbie", 1);
        songList[2][3] = new MySong("The Bad Touch", 4);
    }
    
    public MySong randomSong()
    {
        rvalue=((int) Math.random()*(3));
        cvalue=((int) Math.random()*(4));
        return songList[rvalue][cvalue];
    }
    
    public ArrayList<MySong> playSongWithRating(int rating)
    {
        ArrayList<MySong> selectSong=new ArrayList();
        for(int row = 0;row < songList.length;row++)
        {
            for(int col=0;col<songList[0].length;col++)
            {
                if(songList[row][col].getRating()==rating)
                {
                    selectSong.add(songList[row][col]);
                }
            }
        }
        return selectSong;
    }

    public String toString()
    {
        String output=new String();
        for(MySong[] row: songList)
        {
            for(MySong song:row)
            {
                output+= song + "\n";
            } 
        }
        return output;
    }
}
