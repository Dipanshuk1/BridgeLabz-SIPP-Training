package Inheritance;


class Animal {
 String name;
 int age;


 Animal(String name, int age) {
     this.name = name;
     this.age = age;
 }

 
 public void makeSound() {
     System.out.println("Animal makes a sound");
 }
}


class Dog extends Animal {
 Dog(String name, int age) {
     super(name, age);
 }

 @Override
 public void makeSound() {
     System.out.println(name + " the dog barks: Woof");
 }
}


class Cat extends Animal {
 Cat(String name, int age) {
     super(name, age);
 }

 @Override
 public void makeSound() {
     System.out.println(name + " the cat meows: Meow");
 }
}


class Bird extends Animal {
 Bird(String name, int age) {
     super(name, age);
 }

 @Override
 public void makeSound() {
     System.out.println(name + " the bird chirps: Tweet");
 }
}


public class AnimalHierarchy {
 public static void main(String[] args) {
     Animal dog = new Dog("Buddy", 3);
     Animal cat = new Cat("Jacky", 2);
     Animal bird = new Bird("Bite", 1);

    
     dog.makeSound();
     cat.makeSound();
     bird.makeSound();
 }
}