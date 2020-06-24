package ua.edu.npu.lab03.task04;

public class Duck extends Pet implements Flying, Talking, Walking, Swimming {
    @Override
    public String getType() {
        return "Duck";
    }

    public Duck(String owner, String name, int age) {
        super(name, age);
    }

    public void fly() {
        System.out.println("Duck fly");
    }

    public void talk() {
        System.out.println("Quack");
    }

    public void walk() {
        System.out.println("Duck walk");
    }

    public void swim() {
        System.out.println("Duck swim");
    }
}
