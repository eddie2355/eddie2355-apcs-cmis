public class RosterApp
{
    public static void main (String[] args)
    {
        Roster roster1 = new Roster();
        System.out.println( roster1 + "\n");
        System.out.println("The person with the highest GPA is of course " + roster1.findStudentWithMaxGPA());
    }
}
