public class Room
{
    private String hall1;
    private String hall2;
    private String hall3;
    private String goBack;
    private String direction;
    public Room(String goBack, String direction)
    {
        this.goBack = new String( goBack);
        this.direction = new String( direction );
        System.out.println("Looks like a dead end. Weird.");
    } //dead end room object + exit
    public Room(String hall1, String goBack, String direction)
    {
        this.hall1 = new String( hall1 );
        this.goBack = new String( goBack );
        this.direction = new String( direction );
        System.out.println("Look there is a hallway! \n" +
                           "What shall we do");
    }//room with one hallway + exit
    public Room(String hall1, String hall2, String direction, String goBack)
    {
        this.hall1 = new String( hall1 );
        this.hall2 = new String( hall2 );
        this.goBack = new String( goBack );
        this.direction = new String( direction );
        System.out.println("Look there are two hallways! \n" +
                           "What shall we do");
    }
}
