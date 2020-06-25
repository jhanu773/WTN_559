package com.wipro.polymorphism;

public class FirstPolymorphismProgram {
	public static void main(String[] args) {
		new fruit().eat();
		new apple().eat();
		new orange().eat();
	}
}
class fruit {
	String name;
	String taste;
	int size;
	
	public fruit() {
		name = "apple";
		taste = "sweet";
		size =10;
	}
	public void eat() {
		System.out.println(name + " tastes so "+ taste);
	}
}
	class apple extends fruit {
		public void eat() {
			System.out.println("It tastes like an Apple");
		}
	}
		class orange extends fruit  {
			public void eat() {
				System.out.println("It tastes like an Orange");
			}
		}

