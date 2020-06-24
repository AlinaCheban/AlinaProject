package ua.edu.npu.lab01.task11;

public class Main {
        public static void main(String[] args) {
            pointArr pointArr = new pointArr(5);
            LengthSumLess lengthSumLess = new LengthSumLess();
            for (int p = 0; p < pointArr.pArr.length; p++) {
                System.out.println("Point " + p + "  X:" + pointArr.pArr[p].getX() + "   Y:" + pointArr.pArr[p].getY());
            }
            System.out.println("Less sum of lengths: " + lengthSumLess.lengthSumLess(pointArr));
        }
    }
