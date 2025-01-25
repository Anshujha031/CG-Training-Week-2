package assistedproblems.employeemanagementsystem;

class Developer extends Employee{
    public  String ProgrammingLanguage;
    public Developer(String name , int age , int salary , String ProgrammingLanguage ){
        super(name, age, salary);
        this.ProgrammingLanguage = ProgrammingLanguage;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language : "+ ProgrammingLanguage);
    }
}