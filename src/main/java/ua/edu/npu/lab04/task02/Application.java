package ua.edu.npu.lab04.task02;

public class Application {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(2);
        stack.push(1);
        stack.push(6);
        stack.push(4);
        System.out.println("Popped " + stack.pop());
        System.out.println("Stack size is: " + stack.size());
        stack.clear();
        System.out.println("Stack size is: " + stack.size());

    }
}
