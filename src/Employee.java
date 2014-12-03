public class Employee
{
  String name;
  double hourlyWage;
  int hoursWorked;
  
  public Employee(String name, double wage, int hours)
  {
    this.name=name;
    hourlyWage=wage;
    hoursWorked=hours;
  }
  
  public String getName()
  {
    return name;
  }
  
  public double getWage()
  {
    return hourlyWage;
  }
  
  public int getHours()
  {
    return hoursWorked;
  }
  
  public double getWeeklySalary()
  {
    return hourlyWage*40;
  }
  
  public double getYearlySalary()
  {
    return hourlyWage*2080;
  }
  
  public String toString()
  {
    return "name: "+name+", wage: $"+hourlyWage+", hours: "+hoursWorked;
  }
  
  public void setName(String newName)
  {
    name=newName;
  }
  
  public void setWage(double newWage)
  {
    hourlyWage=newWage;
  }
  
  public void setHours(int h)
  {
    hoursWorked=h;
  }
  
  public void giveRaise()
  {
    hourlyWage=hourlyWage+1;
  }
}
