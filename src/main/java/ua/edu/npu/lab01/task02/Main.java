package ua.edu.npu.lab01.task02;

public class Main {

    public static void main(String[] args) {
        StringArr stringArr = new StringArr();
        Sorting sorting  = new Sorting();
        stringArr.arrQuantity();
        stringArr.strInput();
        stringArr.strOutput(sorting.sorting(stringArr.getStringArr(), stringArr.getN()), stringArr.getN());
    }
}

