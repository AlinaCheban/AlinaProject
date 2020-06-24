package ua.edu.npu.lab01.task08;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String str;
            Counting counting = new Counting();
            StringSplit stringSplit = new StringSplit();
            System.out.println("Enter your String");
            str = input.nextLine();
            stringSplit.split(str);
            String[] StringArr = stringSplit.getStringArr();
            counting.count(StringArr);
            counting.Out();
        }
    }


