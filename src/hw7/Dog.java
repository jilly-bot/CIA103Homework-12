package hw7;

import java.io.Serializable;

public class Dog implements Animal, Serializable {
	private static final long serialVersionUID = 5891963794288431013L;
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	@Override
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
	
    @Override
    public String toString() {
        return "Dog{name='" + name + "}";
    }
}
