package ua.edu.npu.lab01.task03;

public class Main {

        public static void main(String[] args) {
            StringArr stringArr = new StringArr();
            ShorterThanAvg avg = new ShorterThanAvg();
            stringArr.arrQuantity();
            stringArr.strInput();
            avg.strOutput(stringArr.getStringArr(), stringArr.getN(), avg.avgLength(stringArr.getStringArr(), stringArr.getN()));
        }

}
