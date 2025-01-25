package assistedproblems.animalkingdom;
class Animal
{
    public String name;
    public int age;

    public Animal(String name , int age){
        this.name = name;
        this.age = age;
    }

    //method to make Sound()
    public void makeSound(){
        System.out.println("Animal is shouting");
    }

}