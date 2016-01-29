public class Roster2App
{
    public static void main (String[] args)
    {
        Roster2 roster1 = new Roster2();
        
        Roster2 roster2 = new Roster2();
        
        System.out.println(roster1 + "\n" + roster2);
        
        double[] stud1 = new double[] {4.0,4.0,4.0,4.0,4.0};
        roster2.addStudent(new Student(12, "Lex","Luthor", stud1));

        double[] stud2 = new double[] {4.0,4.0,3.3,3.3,3.3};
        roster2.addStudent(new Student(11, "Tony", "Stark", stud2));
  
        double[] stud3 = new double[] {0.0,0.0,0.0,0.0,0.0};
        roster2.addStudent(new Student(11, "Ant", "Man", stud3));
        
        System.out.println(roster1 + "---------------------------\n" +
                                   "\nAP ComputerScience Students: \n" + roster2);
        
        roster2.dropStudent( "Luthor" );
        
        System.out.println( roster2 );
    }
}
