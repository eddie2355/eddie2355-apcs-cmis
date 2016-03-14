public class MySong
{
    private String name;
    private int rating;
    
    public MySong()
    {
        name= new String("Teenage Dirtbag");
        rating = 4;
    }
    
    public int getRating()
    {
        return rating;
    }

    public MySong(String name,int rating)
    {
        this.name= new String(name);
        this.rating=rating;
    }

    public String toString()
    {
        String output=new String();
        output="Name: "+ name +"\n Rating: "+rating;
        return output;
    }
}
