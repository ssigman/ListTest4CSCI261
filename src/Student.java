
/**
 * The student class is used for testing purposes only.
 * 
 * @author S. Sigman
 * @version 2/15/2019
 */
public class Student
{
    private String name;        // full name
    private String yearInSchool;// Fresh, Soph, Jr, Sr

    public Student(String name, String yearInSchool)
    {
        this.name = name;
        this.yearInSchool = yearInSchool;
    }
    
    public Student()
    {
        this.name = "";
        this.yearInSchool = "";
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name) 
    {
        this.name = name;
    }
    
    public String getYearInSchool()
    {
        return this.yearInSchool;
    }
    
    public void setYearInSchool(String yearInSchool)
    {
        this.yearInSchool = yearInSchool;
    }
    
    public String toString() 
    {
       return this.name + " year: " + this.yearInSchool;
    }
}
