class Animal
{
	
	void eat()
	{
	System.out.println("animal is eating");	
	}
	void sleep()
	{
		System.out.println("animal is sleeping");
	}
}
class Birds extends Animal
{
	@Override
	void eat()
{
System.out.println("Bird is eating");	
}
	void sleep()
	{
		System.out.println("Bird is sleeping");
	}
	
	void fly()
	{
		System.out.println("the bird is flying");
	}
}

public class Inmain {
public static void main(String[] args) {
	Animal al= new Animal();
	Birds bi= new Birds();
	al.eat();
	al.sleep();
	bi.eat();
	bi.sleep();
	bi.fly();
	
	
}
}
