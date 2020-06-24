package ua.edu.npu.lab03.task05;

public class Turtle extends Pet implements Walking, Swimming {
    @Override
    public String getType() {
        return "Turtle";
    }

    public Turtle(String owner, String name, int age) {
        super(owner, name, age);
    }

    public void walk() {
        System.out.println("Turtle walk");
    }

    public void swim() {
        System.out.println("Turtle swim");
    }
}
