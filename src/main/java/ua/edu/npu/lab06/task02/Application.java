package ua.edu.npu.lab06.task02;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Interface inter;
        inter = (int x) -> {
            String number;
            switch (x) {
                case 0:
                    number = "zero";
                    break;
                case 1:
                    number = "one";
                    break;
                case 2:
                    number = "two";
                    break;
                case 3:
                    number = "three";
                    break;
                case 4:
                    number = "four";
                    break;
                case 5:
                    number = "five";
                    break;
                case 6:
                    number = "six";
                    break;
                case 7:
                    number = "seven";
                    break;
                case 8:
                    number = "eight";
                    break;
                case 9:
                    number = "nine";
                    break;
                default:
                    number = "undefined";
            }
            return number;
        };
        System.out.println(inter.method(8));
        inter = (int x) -> {
            Random r = new Random();
            StringBuilder sb = new StringBuilder();
            String word;
            for (int i = 0; i < x ;i++) {
                char tmp = (char) ('a' + r.nextInt('z' - 'a'));
                sb.append(tmp);
            }
            word = sb.toString();
            return word;
        };
        System.out.println(inter.method(10));
        inter = (int x) -> {
            String sqr = "";
            if ((Math.sqrt(x) * Math.sqrt(x)) == x){
                sqr = "Square";
            }
            return sqr;
        };
        System.out.println(inter.method(16));
    }
}
