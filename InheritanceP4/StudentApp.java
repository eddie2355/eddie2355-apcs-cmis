public class StudentApp
{
    public static void main (String[] args)
    {
        Student[][] studentBody = new Student[3][2];
        
        studentBody[0][0] = new UnderGrad("James", "Flatulation", 6);
        studentBody[0][1] = new UnderGrad("Jen", "Astro-psychology", 4);
        
        studentBody[1][0] = new Graduate("Eddie", "Origins of the Self", 99);
        studentBody[1][1] = new Graduate("Rachel", "Gastro-philosophy", 1);
        
        studentBody[2][0] = new PostGrad("Steph", "Scientology", 3);
        studentBody[2][1] = new PostGrad("Ed", "Poultry-hypnosis", 11);
        
        for(int r = 0; r< studentBody.length;r++)
        {
            for(int c = 0; c <studentBody[0].length;c++)
            {
                System.out.println("Student: " + studentBody[r][c].getName() + "\n" +
                                   "Major: " + studentBody[r][c].getMajor() + "\n" +
                                   "Tuition: " + studentBody[r][c].calculateTuition(studentBody[r][c].getUnitsTaken()) + "\n");
            }
        }
    }
}
