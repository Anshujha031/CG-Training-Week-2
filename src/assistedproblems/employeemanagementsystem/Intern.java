package assistedproblems.employeemanagementsystem;

class Intern extends Employee{
    String ProgrammingLanguage;
    public Intern(String name , int age , int salary , String ProgrammingLanguage){
        super(name, age, salary);
        this.ProgrammingLanguage = ProgrammingLanguage;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language : " + ProgrammingLanguage);
    }
}
