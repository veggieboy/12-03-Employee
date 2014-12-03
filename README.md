Employee
================

## Objectives
- Understand how to represent an object's state as *fields*
- Understand how to represent an object's behavior as instance *methods*
- Be able to implement a class with *multiple constructors*

## Assignment
Write a class called Employee (Employee.java) that models an employee at a company. 
- Complete the main class EmployeeWages to create two Employee instances, print them, then test each of Employee's methods - see the comments for pseudocode in the main program
- An Employee object should have the following fields:
  - name: employee's name
  - hourlyWage: how much money the Employee makes per hour
  - hoursWorked: how man hours the employy works in a given week
- An Employee object should have the following methods:

### Constructors
- **public Employee(String name, double wage, int hours)**: Constructs a new employee object with the given name, wage and hours.   
  - Question to consider: Since there is no default constructor (a constructor with NO parameters), what happens if you execute `Employee emp3 = new Employee();`?

### Accessors
Don't forget, these need a return type :-)
- **getName()**: returns the name of the employee
- **getWage()**: returns the wage of the employee
- **getHours()**: returns the hours of the employee
- **getWeeklySalary()**: returns the weekly salary of the employee
- **getYearlySalary()**: returns the annual salary of the employee - assume that the employee works the same amount of hours every week, and works 52 weeks in a year
- **toString()**: returns a string in the following form: "name: Roger, wage: $9, hours: 40"

### Mutators
Don't forget, these need a return type (or void) :-)
- **setName(String newName)**: changes the employee's name to newName
- **setWage(double newWage)**: changes the employee's wage to newWage
- **setHours(int h)**: changes the employee's hours to h
- **giveRaise(String newName)**: increases the employee's wage by $1 dollar

## Output
```
Student: Don Irwin
name: Roger, wage: $9.0, hours: 40
	weekly salary: 360.0
	annual salary: 18720.0
name: Susie, wage: $11.0, hours: 42
name: Susan, wage: $11.5, hours: 43
	weekly salary: 494.5
	annual salary: 25714.0
name: Susan, wage: $12.5, hours: 43
```
