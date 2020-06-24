package ua.edu.npu.lab03.task04;

public class Fish extends Pet implements Swimming {
    @Override
    public String getType() {
        return "Fish";
    }

    public Fish(String owner, String name, int age) {
        super(name, age);
    }

    public void swim() {
        System.out.println("Fish swim");
    }
}
