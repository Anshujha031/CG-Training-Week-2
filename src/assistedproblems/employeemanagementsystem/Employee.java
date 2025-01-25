package assistedproblems.employeemanagementsystem;

class Employee{
    public String name;
    public int age;
    public int salary;

    public Employee(String name , int age, int salary){
        this.name = name;
        this.age=age;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
    }
}