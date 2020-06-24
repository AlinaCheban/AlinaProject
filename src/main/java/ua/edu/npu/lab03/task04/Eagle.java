package ua.edu.npu.lab03.task04;

public class Eagle extends Pet implements Walking, Talking, Flying {
    @Override
    public String getType() {
        return "Eagle";
    }

    public Eagle(String owner, String name, int age) {
        super(name, age);
    }

    public void walk() {
        System.out.println("Eagle walk");
    }

    public void talk() {
        System.out.println("Screech");
    }

    public void fly() {
        System.out.println("Eagle fly");
    }
}
