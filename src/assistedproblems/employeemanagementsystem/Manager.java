package assistedproblems.employeemanagementsystem;

class Manager extends Employee{
    public int teamSize;
    public Manager(String name , int age , int salary ,int teamSize) {
        super(name, age, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("teamSize : " + teamSize);
    }


}