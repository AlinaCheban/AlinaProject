package ua.edu.npu.lab01.task07;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String str;
            Redaction redaction = new Redaction();
            StringSplit stringSplit = new StringSplit();
            System.out.println("Enter String");
            str = input.nextLine();
            stringSplit.split(str);
            String[] StrArr = stringSplit.getStringArr();
            redaction.redaction(StrArr);
            stringSplit.out(StrArr);
        }
    }


