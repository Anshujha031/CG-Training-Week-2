package assistedproblems.animalkingdom;


class Cat extends Animal{
    public Cat(String name , int age){
        super(name,age);
    }

    @Override
    public void makeSound(){
        System.out.println("Cat can speak");
    }
}
