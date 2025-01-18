import java.util.*;

class Person{
	public String name;
	public int age;
	
	//para constructor
	public Person(String name , int age){
		this.name = name;
		this.age = age;
		}
		
		
	// copy constructor
	
	public Person(Person otherPerson){
		this.name = otherPerson.name;
		this.age = otherPerson.age;
		}
		
	public void display(){
		System.out.println("Name " + name);
		System.out.println("age " + age);
		}
		
	public static void main(String[] args){
		Person p = new Person("Naveen" , 20);
		p.display();
		
		//call copy constructor
		Person p1 = new Person(p);
		p1.display();
		}
	
	
}