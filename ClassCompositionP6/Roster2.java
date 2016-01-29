import java.util.ArrayList;
public class Roster2
{
    private ArrayList<Student> roster = new ArrayList<Student>();
    
    public Roster2()
    {
        double[] stud1 = new double[] {4.0,4.0,4.0,4.0,4.0};
        roster.add(new Student(12, "Eddie","Awesome", stud1));
        
        double[] stud2 = new double[] {4.0,4.0,3.3,3.3,3.3};
        roster.add(new Student(11, "Ted", "Shmosby", stud2));
        
        double[] stud3 = new double[] {0.0,0.0,0.0,0.0,0.0};
        roster.add(new Student(11, "Rachel", "Lame", stud3));
    }

    public void addStudent( Student newStudent)
    {
        roster.add( newStudent );
    }
    
    public void dropStudent( String lastName )
    {
        Student droppingStudent;
        for( int i = 0; i < roster.size();i++)
        {
            if(roster.get(i).getLastName().equals(lastName))
            {
                droppingStudent = roster.get(i);
                roster.remove(droppingStudent);
            }
        }
    }
    
    public String toString()
    {
        String students = new String();
        for(Student student : roster)
            {
                students += (student + "period1 \n \n");
            }
        String output = String.format(students);
        return output;
    }
}
