package ua.edu.npu.lab01.task09;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String str;
            Counting counting = new Counting();
            System.out.println("Enter your String");
            str = input.nextLine();
            counting.counting(str);
            counting.PrintInfo();
        }
    }


