package ua.edu.npu.lab01.task02;

import java.util.Scanner;

public class StringArr {
    String[] stringArr;
    int n;
    Scanner input = new Scanner(System.in);
    public void arrQuantity() {
        System.out.println("Enter number of strings: ");
        n = input.nextInt();
    }
    public void strInput() {
        stringArr = new String[n];
        for (int i=0; i<n; i++) {
            System.out.println("Enter string number " + i);
            stringArr[i] = input.next();
        }
    }
    public void strOutput(String[] str, int N) {
        for (int i=0; i<N; i++) {
            System.out.println(str[i]);
        }
    }
    public String[] getStringArr() {
        return stringArr;
    }
    public int getN() {
        return n;
    }
}



