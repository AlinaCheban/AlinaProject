package ua.edu.npu.lab01.task01;

public class Main {
    public static void main(String[] args) {
        StringArr stringArr = new StringArr();
        FindShortest shortestString = new FindShortest();
        stringArr.arrQuantity();
        stringArr.strInput();
        stringArr.strOutput(stringArr.getStringArr(), stringArr.getN());
        shortestString.findShortestString(stringArr.getStringArr(), stringArr.getN());
    }
}