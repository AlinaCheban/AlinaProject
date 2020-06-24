package ua.edu.npu.lab04.task03;

public class Application {
    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack();
        stack.pop();
        stack.push(6);
        stack.push(1);
        stack.push(15);
        stack.push(4);
        stack.push(28);
        stack.push(5);
        System.out.println("Popped " + stack.pop());
        System.out.println("Popped " + stack.pop());
        System.out.println("Popped " + stack.pop());
        System.out.println("Popped " + stack.pop());
        System.out.println("Stack size: " + stack.size());
        stack.clear();
        stack.pop();

    }
}
