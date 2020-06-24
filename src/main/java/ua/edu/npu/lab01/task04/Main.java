package ua.edu.npu.lab01.task04;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String MainString = "";
            StringSplit split = new StringSplit();
            StringMod stringMod = new StringMod();
            System.out.println("Enter your String");
            MainString = input.nextLine();
            split.split(MainString);
            String[] StrArr = split.getStringArr();
            stringMod.replace(StrArr);
            stringMod.out(StrArr);
        }
    }


