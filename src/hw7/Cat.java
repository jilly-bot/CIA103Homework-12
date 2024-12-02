package hw7;

import java.io.Serializable;

public class Cat implements Animal, Serializable {
	private static final long serialVersionUID = 8815931259008764856L;
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	@Override
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
    @Override
    public String toString() {
        return "Cat{name='" + name + "}";
    }
	
}
