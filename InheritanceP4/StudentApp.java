public class StudentApp
{
    public static void main (String[] args)
    {
        Student[][] studentBody = new Student[3][2];
        
        UnderGrad ug1 = new UnderGrad("James", "Flatulation", 6);
        UnderGrad ug2 = new UnderGrad("Jen", "Astro-psychology", 4);
        
        Graduate grad1 = new Graduate("Eddie", "Origins of the Self", 99);
        Graduate grad2 = new Graduate("Rachel", "Gastro-philosophy", 1);
        
        PostGrad pg1 = new PostGrad("Steph", "Scientology", 3);
        PostGrad pg2 = new PostGrad("Ed", "Poultry-hypnosis", 11);
        
        //add loop to put things in 2d array and print out each student
    }
}
