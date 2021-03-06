public class Roster
{
    private Student[] roster = new Student[3];
    
    public Roster()
    {
        double[] stud1 = new double[] {4.0,4.0,4.0,4.0,4.0};
        roster[0] = new Student(12, "Eddie","Awesome", stud1);
        
        double[] stud2 = new double[] {4.0,4.0,3.3,3.3,3.3};
        roster[1] = new Student(11, "Ted", "Shmosby", stud2);
        
        double[] stud3 = new double[] {0.0,0.0,0.0,0.0,0.0};
        roster[2] = new Student(11, "Rachel", "Lame", stud3);
    }
    
    public String findStudentWithMaxGPA()
    {
        int bestAround = 0;
        for (int i = 0; i <roster.length; i++)
            {
                if(roster[i].calcGPA() > roster[bestAround].calcGPA())
                {
                    bestAround = i;
                }
            }
            
        String theBestName = roster[bestAround].getName();
        return theBestName;
    }
    
    public String toString()
    {
        String students = new String();
        for(Student student : roster)
            {
                students += (student + "\n");
            }
        String output = String.format(students);
        return output;
    }
}
