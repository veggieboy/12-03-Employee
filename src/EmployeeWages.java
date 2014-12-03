// placeholder for your main method
public class EmployeeWages {
    public static void main(String[] args) {
        // replace <put your name here> with your name!
        System.out.println("Student: Alek Pensky");
        
        // Create two instances of class Employee emp1 & emp2
        Employee emp1=new Employee("Spongebob", 0.01, 1000000000);
        Employee emp2=new Employee("Squidward", 10.0, 1);
        // print emp1 
        emp1.toString();
        // print emp1's weekly salary (put a tab first) like "       weekly salary: $360.00" 
         System.out.println("/tweekly salary: $"+emp1.getWeeklySalary());
        // print emp1's annual salary (put a tab first) like "       annual salary: $18,720.00" 
        System.out.println("/tannual salary: $"+emp1.getYearlySalary());
        // print emp2
        emp2.toString();
        // change emp2's name
        emp2.setName("Patrick");
        // change emp2's wage
        emp2.setWage(0.1);
        // change emp2's hours
        emp2.setHours(1000000001);
        // print emp2 
        emp2.toString();
        // print emp2's weekly salary (put a tab first) like "       weekly salary: $360.00" 
         System.out.println("/tweekly salary: $"+emp2.getWeeklySalary());
        // print emp2's annual salary (put a tab first) like "       annual salary: $18,720.00" 
        System.out.println("/tannual salary: $"+emp2.getYearlySalary());
        // give emp2 a raise
        emp2.giveRaise();
        // print emp2
        emp2.toString();
    }
}
