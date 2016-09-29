import java.util.*;
class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
}

class Dog extends Animal {
	private String name;
   public void move() {
      System.out.println("Dogs can walk and run");
   }
   public void bark() {
      System.out.println("Dogs can bark");
   }
   public String getName(){
	   return this.name;
   }
   public void setName(String s){
	   this.name = s;
   }
}

class Husky extends Dog{
	public void bark(){
		System.out.println("Huskys have loud barks");
	}
	
}
public class OOPrinciples {
	public static void main(String args[]) {
		Animal a = new Animal();   // Animal reference and object
		Dog b = new Dog();   // Animal reference but Dog object
		Husky c = new Husky();
		a.move();   // runs the method in Animal class
		b.move();   // runs the method in Dog class
		b.bark();
		c.bark();
		c.move();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\nWhat is your dogs name: ");
		String dogName = sc.nextLine();
		b.setName(dogName);
		String name = b.getName();
		System.out.println(name + " is the best dog");
	}

}
