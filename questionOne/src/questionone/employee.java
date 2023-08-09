
package questionone;

public class employee {
    protected String name;
    protected String Position;
    protected double Salary;
    protected double Experience;
    protected String educational_level;
    protected boolean full;
    protected boolean part;
    protected double Bouns;
    
    public employee( String name, String Position,
    double Salary, double Experience, String educational_level,
    boolean full, boolean part)
    {
        this.Experience = Experience;
        this.Position = Position;
        this.Salary = Salary;
        this.educational_level = educational_level;
        this.full = full;
        this.name = name;
        this.part = part;
    }
    double basicSalary(){
        double total;
        total = Salary + (Salary * 0.05 * Experience);
        if (educational_level.toLowerCase() == "bachelor")
            total += 500;
        else if (educational_level.toLowerCase() == "diploma")
            total += 250;
        else
            total+= 0;
        return total;
    }
    
    double bounsSalary(){
        double bonSal = 0;
        if (full == true)
            bonSal = Salary*0.03;
        else
            bonSal = Salary*0.015;
        
        return bonSal;
    }
    
    public void display()
    {
        System.out.println("name:\t"+name);
        System.out.println("Experience:\t"+Experience);
        System.out.println("Position:\t"+Position);
        System.out.println("Basic Salary:\t"+basicSalary());
        System.out.println("educational_level:\t"+educational_level);
        if(full == true)
            System.out.println("Work type:\tFull time employee");
        else
            System.out.println("Work type:\tPart time employee");
        System.out.println("Bouns Salary:\t"+bounsSalary());
    }
}
