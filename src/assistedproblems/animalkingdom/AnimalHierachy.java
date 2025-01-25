package assistedproblems.animalkingdom;

public class AnimalHierachy {
    public static void main(String[] args){

        //creating object for each subclass
        Animal Dog = new Dog("tiger" , 20);
        Animal Cat = new Cat("Kitty" , 52);
        Animal Bird = new Bird("Koyal" , 12);

        Dog.makeSound();
        Cat.makeSound();
        Bird.makeSound();
    }
}
