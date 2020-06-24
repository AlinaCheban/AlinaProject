package ua.edu.npu.lab03.task04;

public abstract class Pet {
    String petName = new String();
    int age;

    abstract public String getType();

    public Pet(String name, int age) {
        this.petName = name;
        this.age = age;
    }

    public Pet() {
        petName = "No name";
        age = 0;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return petName;
    }
}
